package com.kh.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader in = null;
		PrintWriter out = null;
		ServerSocket serverSocket = null;
		Socket socket = null;

		try {
			serverSocket = new ServerSocket(3000);
			System.out.println("[Server실행] Client연결대기중...");
			socket = serverSocket.accept();
			System.out.println(socket.getInetAddress().getHostAddress() + "로부터의 연결 요청 ....");

			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());

			while (true) {
				String inputMessage = in.readLine(); // 수신데이터 한줄씩 읽기
				if ("quit".equalsIgnoreCase(inputMessage))
					break;

				System.out.println(socket.getInetAddress().getHostAddress() + " : " + inputMessage);
				System.out.print("전송하기>>> ");

				String outputMessage = sc.nextLine();
				out.println(outputMessage);
				out.flush();
				if ("quit".equalsIgnoreCase(outputMessage))
					break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(sc != null)
					sc.close(); // Scanner 닫기
				if(socket != null)
					socket.close(); // Socket 닫기
				if(serverSocket != null)
					serverSocket.close(); // ServerSocket 닫기
				System.out.println("연결종료");
			} catch (IOException e) {
				System.out.println("소켓통신에러");
			}
		}
	}
}
