package day3.thread;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client3 {

	   private Socket clientSocket;
	   private DataInputStream dataInputStream;
	   private DataOutputStream dataOutputStream;

	   public Client3(){
			try {
		        clientSocket= new Socket("localhost", 6077);
	            System.out.println("서버 접속요청");
	            dataInputStream = new DataInputStream(clientSocket.getInputStream());
			    dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
			}catch(Exception e) {
				 
			}
		    dataSend();
		    dataRecv();
		  
		}
	  
	   public void dataRecv() { 			
			new Thread (new Runnable() {					
				
				@Override
				public void run() {	 					 
						try {
							String  data="";
							while(true) {
							  data= dataInputStream.readUTF();
							  System.out.println(data);
							}						 
							
						} catch (IOException e) {					 
							System.out.println("나감");
						}									
				}			 
			}).start();	 
		}

		
		  public void dataSend()  {
			  
			  Scanner in = new Scanner(System.in);
			  
			  new Thread( new Runnable() {	 
				  
		          @Override
		          public void run() { 		             
		                 try{
		                	 while(true) {
			                   String sendData = in.nextLine(); 
			                   dataOutputStream.writeUTF(sendData);
		                	 }
		                }catch(Exception e){
		                	System.out.println("나감");
		                }
		              }
	             }).start();
			  
			 
	}


		 
	public static void main(String[] args) {		 
		new Client3();

	}

}
