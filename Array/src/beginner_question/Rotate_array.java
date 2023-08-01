package beginner_question;

import java.util.*;
import java.util.Set;

public class Rotate_array {

	
	public static List< Integer > sortedArray(int []a, int []b) {
	      Set<Integer> hash_Set = new HashSet<Integer>();

	      for(int i=0;i<a.length;i++){
	        hash_Set.add(a[i]);
	      }

	       for(int i=0;i<b.length;i++){
	        hash_Set.add(b[i]);
	      }
	      
	    List<Integer> arr=new ArrayList<>(hash_Set);

	    
	      
	      return arr;
	    }
	
	public static void main(String args[]) {
		

		Scanner sc=new Scanner(System.in);
    
		int  nums[]= {1,2,3,4,6};  
		int nums2[]= {2,3,5};
		
		System.out.println(sortedArray(nums, nums2));
		 
	    }
	}
	 

