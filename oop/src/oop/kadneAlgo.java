package oop;

public class kadneAlgo {
//    public static int kadane(int[] nums) {
//        int maxCurrent = nums[0];
//        int maxGlobal = nums[0];
//        
//        for (int i = 1; i < nums.length; i++) {
//            // Update maxCurrent to be the maximum of the current element or the current element + maxCurrent
//            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
//            
//            // Update maxGlobal to be the maximum of maxGlobal and maxCurrent
//            if (maxCurrent > maxGlobal) {
//                maxGlobal = maxCurrent;
//            }
//        }
//        
//        // Return the maximum sum found
//        return maxGlobal;
//    }
	
	public static int maxSumSubarray(int[] a) {
	    int maxSum = 0;
	    int currSum = 0;
	    
	    for (int i = 0; i < a.length; i++) {
	        currSum += a[i];
	        
	        if (currSum > maxSum) {
	            maxSum = currSum;
	        }
	        
	        if (currSum < 0) {
	            currSum = 0;
	        }
	    }
	    
	    return maxSum;
	}

	public static void main(String[] args) {
	    int[] nums = {2, 1, 3,1,8,4,2, 4, 1, 2, 1, 5, 4};
	    int maxSum = maxSumSubarray(nums);
	    System.out.println("Maximum Subarray Sum: " + maxSum); // Output should be 6
	}


	
//-11+27
}
