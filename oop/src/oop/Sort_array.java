package oop;
import java.util.Arrays;

public class Sort_array {

	public static  int leftOccurence(int a[],int key) {
		int l=0;
		int r = a.length -1;
		int ans =-1;
		while(l<=r) {
			int mid = (l+r)/2;
			if (a[mid] == key) {
				ans =mid;
				r = mid-1;
			}
			if(key>a[mid]) {
				l=mid+1;
			}
			else
				r =mid -1;
		}
		return ans;
				
	}
	public static void main(String[] args) {
        int a[]= {1,1,2,3,4,4,4,5,5,6,7,7};
        Arrays.sort(a);  // Sorting the array to ensure binary search works correctly
        System.out.print(leftOccurence(a,5));
	}

}
