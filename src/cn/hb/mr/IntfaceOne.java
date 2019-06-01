package cn.hb.mr;

public class IntfaceOne implements MyInterfaceAbs, MyInterfaceAbsb{


    @Override
    public void absOne() {
        System.out.println("实现了接口方法1");
    }

    @Override
    public void absTwo() {
        System.out.println("实现了接口方法2");
    }

    @Override
    public void absThr() {
        System.out.println("实现了接口方法3");
    }

    @Override
    public void absFou() {
        System.out.println("实现了接口方法4");
    }
    @Override
    public void absSix(){
        System.out.println("重写的默认方法6");
    }
    public void absSev(){
        System.out.println("这是实现类的私有方法");
    }
}
