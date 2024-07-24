package app02;

public class ContinueDemo2 {

	public static void main(String[] args) {
		outer:
			for (int i=1;i<=5;i++) {
				for (int j=1;j<=5;j++) {
					System.out.println("Hello");
					continue outer;
					
				}
				
			}
	System.out.println("Good bye");


	}

}
