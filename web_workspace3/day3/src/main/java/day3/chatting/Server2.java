package day3.chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;



// 서버

public class Server2 {

	ServerSocket  serverSocket;  
	Socket  socket;	
	//보조스트림
	DataInputStream dataInputStream;
	DataOutputStream dataOutputStream;			

	//생성자 
	public Server2() {

		try {
			serverSocket = new ServerSocket(6100 );
			System.out.println(" 서버소켓생성");
			socket=serverSocket.accept();			
			System.out.println("클라이언트 생성");

			dataInputStream  = new DataInputStream( socket.getInputStream());
			dataOutputStream = new DataOutputStream( socket.getOutputStream());

			dataRecv();
			dataSend();


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	//보내느것
	private void dataSend() {		
		Scanner sc = new Scanner(System.in);	
		Thread th = new Thread(  new Runnable() {

			@Override
			public void run() {
				try {			

					while(true) {
						System.out.println("메시지 입력");
						String message = sc.nextLine() ;
						dataOutputStream.writeUTF(message);
					}

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		});
		th.start();




	}


	private void dataRecv() {		  //받는거

		//	Thread th = new Thread( new Runnable() {});
		Thread th = new Thread( new Runnable() {

			@Override
			public void run() {
				try {
					while(true) {
						String message  = dataInputStream.readUTF();
						System.out.println( message);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}});
		th.start();




	}


	public static void main(String[] args) {
		new  Server2();

	}



}
