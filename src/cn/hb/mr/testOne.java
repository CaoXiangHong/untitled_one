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

    }

}