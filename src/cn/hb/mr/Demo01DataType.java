package cn.hb.mr;

public class Demo01DataType {
	public static void main (String[] args) {
	two();

	Zi zi1 = new Zi();
		System.out.println(zi1.numV);
	}
	
	public static void one () {
		for (int i = 0; i < 20; i++) {
			System.out.print("*");
		}
	}
	public static void two (){
			for (int j = 0; j < 10; j++) {
				one();
				System.out.println();
			}
	}
	
}