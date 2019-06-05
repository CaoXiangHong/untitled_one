package cn.hb.mr;


import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class memo2File {
    public static void main(String[] args) throws IOException {
       /* FileOutputStream fos = new FileOutputStream(new File("e:\\迅雷下载\\b.txt"),true);
        fos.write(49);
        fos.write(48);
        fos.write(48);
        //fos.close();
        byte[] bytes = {65,66,67,68};
        fos.write(bytes);
        String hl = "   HELLO WORLD,你好 世界。\r\n";
        bytes = hl.getBytes();
        fos.write(bytes);
        fos.close();
        */
        FileInputStream memo = new FileInputStream ("e:\\迅雷下载\\b.txt");
        FileOutputStream fos = new FileOutputStream(new File("e:\\迅雷下载\\c.txt"),true);
        byte[] by = new byte[1024];
        int len = 0;
        while ((len = memo.read(by) ) != -1 ) {
            fos.write(by);
        }
        fos.close();
        memo.close();
    }
}
