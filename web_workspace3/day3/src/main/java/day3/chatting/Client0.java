package day3.chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client0 {

	Socket socket;
	
	//보조 스트림
	DataInputStream dataInputStream;
	DataOutputStream dataOutputStream;
	
	public Client0() {
		try {
			socket = new Socket("localhost",6100);
			//socket = new Socket("192.168.0.89",6100);
			System.out.println("connection...");
			
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
	
	private void dataRecv() {
		try {
			String message = dataInputStream.readUTF();
			System.out.println(message);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void dataSend() {
		Scanner in = new Scanner(System.in);
		try {
			String message = in.nextLine();
			dataOutputStream.writeUTF(message);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Client0(); 
	}

}
