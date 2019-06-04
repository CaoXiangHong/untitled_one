package cn.hb.mr;

import java.io.File;


public class fileTest {

    public static void main(String[]args){
        File f1 = new File("e:\\迅雷下载");
        int [] fczz ;
        fczz = show01(f1);
        System.out.println("该目录下共有文件"+fczz[0]+"个,目录"+fczz[1]+"个");
      }

      private static int[] show01(File f1){

        File [] fls =f1.listFiles();
        int fc = 0;
        int fd = 0;
        int fcz = 0;
        for (File f : fls) {
            if (f.isFile()) {
                String s = f.toString();
                if (s.endsWith(".java")) {
                    System.out.println(f);
                }
                fc++;
              }else{
                fd++;
                fcz = fcz + fc;
             show01(f);
            }

            }
        int [] arrayR = {fcz,fd};
          return arrayR;
        //System.out.println("总计文件"+fcz+"个,"+"目录"+fd+"个。");
        }






    }

