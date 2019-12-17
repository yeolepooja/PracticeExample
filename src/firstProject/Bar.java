package firstProject;
class Foo {
	Foo(){
		m1();
	}
 
	public void m1() {
		System.out.println("Foo");
	}
}

public class Bar extends Foo {
	int x= 5;
	
	public void  m1() {
		System.out.println("x=" +x);
	}
	public static void main(String[] args) {
		Foo f=new Bar();
		f.m1();	
	}
}