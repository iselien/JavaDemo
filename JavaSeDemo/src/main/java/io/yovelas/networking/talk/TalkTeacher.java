package io.yovelas.networking.talk;

import java.net.SocketException;

//加入多线程 ,实现双向交流 模拟在线咨询
public class TalkTeacher {
	public static void main(String[] args) throws SocketException {
		new Thread(new TalkServer(5555)).start();//接收
	}
}
