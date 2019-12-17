package firstProject;

public class ExecutionSeq {
	{
		System.out.println("execution of instance block");
	}

	static
	{
		System.out.println("execution of staic block");
	}
	
	ExecutionSeq(){
		System.out.println("this is constructor");
	}
	
	public static void main(String args[]) {
		new ExecutionSeq();
	}
}
