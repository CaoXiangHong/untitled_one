package cn.hb.mr;

public class testOne {
    public static void main(String[] args) {
    Zi zi1 = new Zi ();
        System.out.println(zi1.numV);
        zi1.metFu();
        zi1.methzi();

       // System.out.println(super.numV);

    IntfaceOne bac = new IntfaceOne();
    bac.absOne();
    bac.absTwo();
    bac.absThr();
    bac.absFou();
    bac.absFive();
    bac.absSix();
    bac.absSev();
    MyInterfaceAbs.absEnt();

    Fu zi2 = new Zi ();
    zi2.metFu();

    Zi zi3 = (Zi) zi2;
    zi3.methzi();
    DouDIZhu dou = new DouDIZhu();
    /*dou.p1 = "周润发";
    dou.p2 = "刘德华";
    dou.p3 = "周星驰"; */
    dou.start("周润发","刘德华","周星驰");
    }

}