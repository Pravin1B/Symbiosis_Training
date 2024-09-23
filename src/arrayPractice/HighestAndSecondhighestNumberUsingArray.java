package arrayPractice;

public class HighestAndSecondhighestNumberUsingArray {

	void highestAndSecondHighest() {
		TakeInputArray inputarr=new TakeInputArray();
		int[] array=inputarr.inputArray();
		int highest=Integer.MIN_VALUE;
		int secondhighest=Integer.MIN_VALUE;
		for(int i=0; i<array.length; i++) {
			if (array[i]>highest) {
				secondhighest=highest;
				highest=array[i];
			}
			else if(array[i]>secondhighest && array[i]!=highest) {
				secondhighest=array[i];
			}
		}
		System.out.print("Highest is: "+highest+"\nSecond Highest is: "+secondhighest);
	}
	public static void main(String[] args) {
		HighestAndSecondhighestNumberUsingArray obj=new HighestAndSecondhighestNumberUsingArray();
		obj.highestAndSecondHighest();
	}

}
