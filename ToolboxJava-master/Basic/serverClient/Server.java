package serverClient;

import java.io.*;

public class Server {
	public static void main(String[] args) {
		Server server = new Server();
		try {
			server.test();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	void test() throws IOException {
		int port = 12345;
		java.net.ServerSocket serverSocket = new java.net.ServerSocket(port);
		java.net.Socket client = waitForClient(serverSocket);
		String message = readMessage(client);
		System.out.println(message);
		writeMessage(client, message);

	}

	java.net.Socket waitForClient(java.net.ServerSocket serverSocket) throws IOException {
		java.net.Socket socket = serverSocket.accept();
		return socket;
	}

	String readMessage(java.net.Socket socket) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		char[] buffer = new char[200];
		int charSum = bufferedReader.read(buffer, 0, 200);
		String message = new String(buffer, 0, charSum);
		return message;

	}

	void writeMessage(java.net.Socket socket, String message) throws IOException {
		PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
		printWriter.print(message);
		printWriter.flush();

	}
}
