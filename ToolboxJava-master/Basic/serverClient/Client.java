package serverClient;

import java.io.*;

public class Client {
	public static void main(String[] args) {
		Client client = new Client();
		try {
			client.test();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	void test() throws IOException {
		String ip = "127.0.0.1";
		int port = 12345;
		java.net.Socket socket = new java.net.Socket(ip, port);
		String messageToSend = "Hello World";
		writeMessage(socket, messageToSend);
		String recivedMessage = readMessage(socket);
		System.out.println(recivedMessage);
	}

	void writeMessage(java.net.Socket socket, String message) throws IOException {
		PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
		printWriter.print(message);
		printWriter.flush();
	}

	String readMessage(java.net.Socket socket) throws IOException {
		BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(socket.getInputStream())));
		char[] buffer = new char[200];
		int charSum = bufferedReader.read(buffer, 0, 200);
		String message = new String(buffer, 0, charSum);
		return message;
	}
}
