package beginner_question;

public class SecondLargest {
public static void main(String args[]) {
	int arr[]= {12,4,3,4,34,3,2,1};
	
	int lar=0;
	int seclar=0;
	int smal=arr[0];
	int secondsml=0;
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>lar) {
			seclar=lar;
			lar=arr[i];
			
		}
		if(arr[i]<smal) {
		   secondsml=smal;
		   smal=arr[i];
		}
	}
	
	System.out.println("second largest is "+seclar);
	System.out.println("second smalles is "+secondsml);

}
}
