package io.yovelas.networking.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        try {
            ServerSocket ss = new ServerSocket(9999);
            Socket s = ss.accept();

            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        try {
                            System.out.println("client say: " + din.readUTF());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();

            String str = "", str2 = "";
            while (!str.equals("stop")) {
//                str = din.readUTF();
//                System.out.println("client says: " + str);
                str2 = br.readLine();
                dout.writeUTF(str2);
                dout.flush();
            }
//            din.close();
//            s.close();
//            ss.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

}
