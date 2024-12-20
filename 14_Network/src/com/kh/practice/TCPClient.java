package com.kh.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) {
		BufferedReader in = null;
		PrintWriter out = null;
		Socket socket = null;
		Scanner sc = new Scanner(System.in);

		try {
			socket = new Socket("127.0.0.1", 3000);

			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());

			while (true) {
				System.out.print("데이터 전송>>> ");
				String outputMessage = sc.nextLine();
				out.println(outputMessage);
				out.flush();
				if ("quit".equalsIgnoreCase(outputMessage))
					break;

				String inputMessage = in.readLine();
				System.out.println("From Server: " + inputMessage);
				if ("quit".equalsIgnoreCase(inputMessage))
					break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (sc != null)
					sc.close();
				if(out != null)
					out.close();
				if(in != null)
					in.close();
				if (socket != null)
					socket.close();
				System.out.println("정상 종료");
			} catch (IOException e) {
				System.out.println("에러");
			}
		}

	}
}
