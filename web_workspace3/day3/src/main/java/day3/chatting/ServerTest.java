package day3.chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerTest {
	
	ServerSocket serverSocket;
	Socket socket;
	
	DataInputStream dataInputStream;
	DataOutputStream dataOutputStream;
	
	public ServerTest() {
		// TODO Auto-generated constructor stub
		try {
			serverSocket = new ServerSocket(6000);
			System.out.println("서버소켓 연결");
			socket = serverSocket.accept();
			System.out.println("클라이언트소켓 연결");
			
			dataInputStream = new DataInputStream(socket.getInputStream());
			dataOutputStream = new DataOutputStream(socket.getOutputStream());
			
			dataRecv();
			dataSend();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void dataSend() {
		Scanner sc = new Scanner(System.in);
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					while(true) {
						String message = sc.nextLine();
						dataOutputStream.writeUTF(message);
						
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		thread.start();
	}

	private void dataRecv() {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					while(true) {
						String message = dataInputStream.readUTF();
						System.out.println(message);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ServerTest();
	}

}
