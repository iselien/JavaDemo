package io.yovelas.networking.talk;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TalkServer implements Runnable {
	private DatagramSocket sever;
	public TalkServer(int port) throws SocketException {
		sever= new DatagramSocket(port);
	}
	@Override
	public void run() {
		//2.准备容器 封装成DatagramPacket包裹
		byte[] container=new byte[1024*60];
		DatagramPacket packet=new DatagramPacket(container,0,container.length);
		while(true) {
		//3阻塞式接收包裹receive(DatagramPacket P)
		try {
			sever.receive(packet);
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		//4.分析数据
		//byte[] getData()
		//getLength()
		byte[] datas=packet.getData();
		int len=packet.getLength();
	String data=new String(datas,0,len);
		System.out.println(data);
		if(data.equals("bye")) {
		break;	
		}
		//5.释放资源*/
		}
		sever.close();
	}
	}
	

