package cn.hb.mr;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class socketTest {
    public static void main(String[] args)  throws IOException {
        Socket scoket = new Socket("127.0.0.1",8888);
        OutputStream outstr = scoket.getOutputStream();
        outstr.write("你好，服务器".getBytes());
        scoket.close();

    }
}

