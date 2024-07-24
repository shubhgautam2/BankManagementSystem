package app19;

public class A {
	int a=10;
	static int b=20;

	public static void main(String[] args) {
		A sc=new A();
		sc.Disp();
		A.Show();
	
	}
	void Disp()
	{
		System.out.println(a);
	}
	static void Show()
	{
		System.out.println(b);
	}

}
