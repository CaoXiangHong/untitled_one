package cn.hb.mr;

public interface MyInterfaceAbs {
     void  absOne();
     void  absTwo();

     default void absFive(){
         System.out.println("新添加的默认方法5");
     }
     default void absSix(){
         System.out.println("第二个默认方法6");
     }
     static void absEnt(){
         System.out.println("来自接口的静态方法，通过接口名来直接调用");
     }

}
