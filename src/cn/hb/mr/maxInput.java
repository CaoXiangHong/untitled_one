package cn.hb.mr;

import java.util.Scanner;

public class maxInput {
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);

        System.out.println("请输入第一个数字");

        int a = sc.nextInt();

        System.out.println("请输入第二个数字");

        int b = sc.nextInt();

        System.out.println("请输入第三年个数字");

        int c = sc.nextInt();

        int d = a > b ? a : b;
        int e = d > c ? d:c;

        System.out.println("最大的数是"+ e );

    }
}
