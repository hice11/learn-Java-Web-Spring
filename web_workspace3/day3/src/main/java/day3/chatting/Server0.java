package day3.chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server0 {
	
	ServerSocket serverSocket;
	Socket clientSocket;
	
	//보조 스트림
	DataInputStream dataInputStream;
	DataOutputStream dataOutputStream;
	
	public Server0() {
		//1. 서버소켓 생성
		//  포트번호 5500~9900
		try {
			serverSocket = new ServerSocket(6100);
			System.out.println("서버소켓 생성");
			
			clientSocket = serverSocket.accept();
			System.out.println("클라이언트소켓 생성");
			
			//보조 스트림
			dataInputStream = new DataInputStream(clientSocket.getInputStream());
			dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
			
			dataRecv();
			dataSend();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//보내기
	private void dataSend() {
		Scanner in = new Scanner(System.in);
		try {
			String message = in.nextLine();
			dataOutputStream.writeUTF(message);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//받기
	private void dataRecv() {
		try {
			String message = dataInputStream.readUTF();
			System.out.println(message);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Server0();

	}

}
