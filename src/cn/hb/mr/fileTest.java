package cn.hb.mr;

import java.io.File;


public class fileTest {

    public static void main(String[]args){
        File f1 = new File("e:\\迅雷下载");

        show01(f1);

      }

      private static  void show01(File f1){

        File [] fls =f1.listFiles();

        for (File f : fls) {
            if (f.isFile()) {
                String s = f.toString();
                if (s.endsWith(".java")) {
                    System.out.println(f);

                }

              }else{

             show01(f);
            }

            }


        }






    }

