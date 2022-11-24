package day3.chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client1 {

	Socket socket;
	
	//보조 스트림
	DataInputStream dataInputStream;
	DataOutputStream dataOutputStream;
	
	public Client1() {
		try {
			socket = new Socket("localhost",6100);
			//socket = new Socket("192.168.0.89",6100);
			System.out.println("connection...\n[클라이언트]");
			
			dataInputStream = new DataInputStream(socket.getInputStream());
			dataOutputStream = new DataOutputStream(socket.getOutputStream());
			
			//
			dataSend();
			dataRecv();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//받기
	private void dataRecv() {
		Thread thread = new Thread( () -> {
			try {
				while(true) {
					String message = dataInputStream.readUTF();
					System.out.println(message);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		
		thread.start();
	}
	
	//보내기
	private void dataSend() {
		Scanner in = new Scanner(System.in);
		
		Thread thread = new Thread( () -> {
			try {
				while(true) {
					String message = in.nextLine();
					dataOutputStream.writeUTF(message);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		
		thread.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Client1(); 
	}

}
