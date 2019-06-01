package cn.hb.mr;

public class Zi extends Fu {
    public int numV = 10 ;
    public void methzi(){
        int numV = 5 ;
        System.out.println(numV);
        System.out.println(this.numV);
        System.out.println(super.numV);
    }

}
