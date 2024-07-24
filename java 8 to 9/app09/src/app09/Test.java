package app09;

public class Test {
	void sum (int a,int b) {
	System.out.println(a+b);
}
	void sum(float a, float b) {
		System.out.println( a+b);
	}
	public static void main(String[] args) {
		Test obj=new Test();
		obj.sum(10.5f, 10.5f);
		obj.sum(20,20);
		

	}

}
