package beginner_question;
import java.util.*;
public class Leetcode_question {

	
	public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
		Set<Integer> set1=new HashSet<>();
        for(int i: nums1) {
        	set1.add(i);
        }
        
        Set<Integer> set2=new HashSet<>();
        for(int i: nums2) {
        	set2.add(i);
        }
        	
		List<List<Integer>> arr3= new ArrayList<>();
      
		List<Integer> diff1 = new ArrayList<>(set1);
        diff1.removeAll(set2);
        List<Integer> diff2 = new ArrayList<>(set2);
        diff2.removeAll(set1);
        
        arr3.add(diff1);
        arr3.add(diff2);

        return arr3;
    }
	
	public static void main(String args[]) {
		
		int arr1[]= {1,2,3};
		int arr2[]= {1,1,2};
		System.out.println(findDifference(arr1,arr2));
		
		
	}
	
}
