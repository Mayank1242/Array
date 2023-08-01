package beginner_question;

public class LargestElment {
	public static void main(String args[]) {
int arr[]= {12,39090,4,43,4,32323,1,243292};
	
	int largest=0;
	for(int i=0;i<arr.length;i++) {
	  if(arr[i]>largest) {
		  largest=arr[i];
	  }
	}
	
	System.out.println(largest);
}
}

