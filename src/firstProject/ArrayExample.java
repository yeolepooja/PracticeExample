package firstProject;

public class ArrayExample {
	public static void main(String args[]) {
		
  //int [] array={5,7,9,11,13};
	int array[]=new int [5];
	array[0]=5;
	array[1]=7;
	array[2]=9;
	array[3]=11;
	array[4]=13;
	
	for(int i=0;i<array.length;i++) {
		System.out.println(array[i]);
	}
  }
}