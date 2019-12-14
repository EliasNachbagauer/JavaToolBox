package array;

public class Array {

	public void setAndGetData() {

		// This array can hold 5 numbers and stars at 0
		int[] array = new int[5];

		// Fill manually
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;

		// Fill automatic
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}

		// read manually
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);

		// read automatic

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public void reverse() {
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}

		int[] reverseArray = new int[5];
		int runVariableReverse = 4;

		// now the reverse

		for (int i = 0; i < array.length; i++) {
			reverseArray[runVariableReverse] = array[i];
			runVariableReverse--;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(reverseArray[i]);
		}
	}
	
	public void multidimensionalArray () {
		//You can use more dimensional Array for encryption or to create a Matrix of Data
		int [][] twoD=new int[5][10];
		//fill it up
		for (int i = 0;i<twoD.length;i++) {
			for (int j=0;j<10;j++) {
				twoD[i][j]=j;
			}
		}
		
	}
	
	public static void main(String[] args) {
		new Array().multidimensionalArray();
	}
}
