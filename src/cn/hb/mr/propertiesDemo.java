package cn.hb.mr;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class propertiesDemo {
    public static void main(String[] args) throws IOException {
      //show01();  //集合数据固化到磁盘
      show02();    //磁盘文件读取到集合
    }
        private static void show01 () throws IOException {
            Properties prop = new Properties();
            prop.setProperty("赵丽颖","168");
            prop.setProperty("迪丽热巴","165");
            prop.setProperty("古力娜扎","160");
            FileWriter fw = new FileWriter("e:\\迅雷下载\\d.txt");
            prop.store(fw,"save data" );
            fw.close();

            Set<String > set = prop.stringPropertyNames();
            for (String key : set ) {
                String value = prop.getProperty(key);
                System.out.println(key+ "=" + value);
            }

        }
        private static void show02 () throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("e:\\迅雷下载\\d.txt"));
        Set <String> set = prop.stringPropertyNames();
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key+ "=" + value);
        }
        }

}