package com.myjava.cn;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class AndroidService {


	public static void main(String[] args) throws IOException {
		ServerSocket serivce = new ServerSocket(8888);
		while (true) {
			//�ȴ��ͻ�������
			Socket socket = serivce.accept();
			new Thread(new AndroidRunable(socket)).start();
		}
	}

}
