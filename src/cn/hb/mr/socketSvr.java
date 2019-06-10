package cn.hb.mr;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class socketSvr {
    public static void main(String[] args) throws IOException {
        ServerSocket sco = new ServerSocket(8888);
        Socket socket = sco.accept();
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println("收到了什么?");
        System.out.println("我收到的信息" + new String(bytes,0,len));
        OutputStream os = socket.getOutputStream();
        os.write("收到，谢谢".getBytes());
        socket.close();
        sco.close();
    }
}
