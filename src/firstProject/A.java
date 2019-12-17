package firstProject;

public class A extends J implements I {
	
	public void m1() {
		System.out.println("Implementation of method m1 in class A ");
	}

	
	public void m2() {
		System.out.println("Implementation of method m2");
	}
	
	public void  m3() {
		System.out.println("Implementation of method m3 ");
	}
	
	
	
	public static void main(String[] args) {
		I obj = new A();
		obj.m1();
	
		J obj1 = new A();
		obj1.m1();
	}

}
