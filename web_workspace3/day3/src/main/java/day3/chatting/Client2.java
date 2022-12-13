package day3.chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client2 {

	Socket socket;

	DataInputStream dataInputStream;
	DataOutputStream dataOutputStream;


	public Client2() {
		//서버요청
		try {
			socket = new Socket("localhost" , 6100);	
			System.out.println(" connection ....");
			dataInputStream   = new DataInputStream(socket.getInputStream());
			dataOutputStream  = new DataOutputStream( socket.getOutputStream());			

			// 보내기
			dataSend();
			// 받기
			dataRecv();

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

	}


	private void dataRecv() {
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


	private void dataSend() {
		Scanner sc = new Scanner(System.in);
		Thread th = new Thread( new Runnable() {
			@Override
			public void run() {
				try {

					while( true) {
						System.out.print("작성할 메시지 : ");
						String message  = sc.nextLine();
						dataOutputStream.writeUTF(message);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
			}});
		th.start();
	}


	public static void main(String[] args) {

		new Client2();

	}

}
