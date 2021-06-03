package io.yovelas.networking.talk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class TalkSend implements Runnable {
private	DatagramSocket client;
 private BufferedReader reader;
 private String inpo;
 private int  po;
public TalkSend(int port,String inpo,int po) {
	this.inpo=inpo;
	this.po=po;
  try {
	client= new DatagramSocket(port);
	reader=new BufferedReader(new InputStreamReader(System.in));
} catch (SocketException e) {
	// TODO 自动生成的 catch 块
	e.printStackTrace();
}
}
  @Override
	public void run() {
	  while(true) {
			String data;
			try {
				data = reader.readLine();
				byte[] dytes=data.getBytes();
				//	3.封装成DatagramPacket包裹，需要指定目的地
					DatagramPacket packet=new DatagramPacket(dytes, 0, dytes.length,
							new InetSocketAddress(inpo,po));
					//4.发送包裹send(DatagramPacket p)
				
						client.send(packet);
						if(data.equals("bye")) {
							break;
						}
					} catch (IOException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					}
				//	5.释放资源*/
					client.close();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				}
  
}
		
			