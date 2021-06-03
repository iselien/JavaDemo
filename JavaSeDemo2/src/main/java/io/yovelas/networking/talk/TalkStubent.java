package io.yovelas.networking.talk;
public class TalkStubent  {
public static void main(String[] args) {
	new Thread(new TalkSend(6666,"fmmmg", 5555)).start();
	
}
}
