package io.yovelas.networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class getResource {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.baidu.com");
        System.out.println(url.getHost());
        System.out.println(url.getPath());
        System.out.println(url.getProtocol());
        URLConnection urlConnection = url.openConnection();
        InputStream inputStream = urlConnection.getInputStream();

        System.out.println((char) inputStream.read());

    }
}