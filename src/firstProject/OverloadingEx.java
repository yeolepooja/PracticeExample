package firstProject;

public class OverloadingEx {
	
	public int add(int x, float y) {
		System.out.println("x:"+x +"y:" +y);
		return 0;
	}
	 
	public int add(float x, int y) {
		System.out.println("x:"+x +"y:" +y);
		return 0;
	}

	public static void main(String[] args) {
		OverloadingEx obj1 = new OverloadingEx();
		obj1.add(10.0f, 10);
		obj1.add(10, 10.0f);	
	}
}
