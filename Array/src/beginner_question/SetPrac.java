package beginner_question;
import java.util.*;
public class SetPrac {
public static void main(String args[]) {
	int arr[]= {1,1,2,2,2,3,3};
	
	Set<Integer> a= new HashSet<Integer>();
	
	for(int i=0;i<arr.length;i++) {
		a.add(arr[i]);
	}
	
	System.out.println(a.size());

	
}
}
