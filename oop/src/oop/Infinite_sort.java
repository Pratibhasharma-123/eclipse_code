package oop;

public class Infinite_sort {
	    
	    public static int binarySearch(int[] a, int low, int high, int key) {
	        while (low <= high) {
	            int mid = low + (high - low) / 2;

	            // Check if the key is present at mid
	            if (a[mid] == key) {
	                return mid;
	            }

	            // If the key is greater, ignore the left half
	            if (a[mid] < key) {
	                low = mid + 1;
	            }
	            // If the key is smaller, ignore the right half
	            else {
	                high = mid - 1;
	            }
	        }
	        // If the key is not present in the array
	        return -1;
	    }

	    // Function to find the range where the key might be present and call binary search
	    public static int searchInfinite(int[] a, int key) {
	        int low = 0;
	        int high = 1;

	        // Expand the range exponentially until the key is less than the high index element
	        while (high < a.length && a[high] < key) {
	            low = high;
	            high = 2 * high;
	        }

	        // Call binary search for the found range
	        if (high >= a.length) {
	            high = a.length - 1; // Ensure high does not go out of array bounds
	        }
	        return binarySearch(a, low, high, key);
	    }

	    public static void main(String[] args) {
	        int[] a = {1, 2, 3, 7, 8, 12, 34, 58, 72};
	        int key = 34;
	        int result = searchInfinite(a, key);
	        if (result == -1) {
	            System.out.println("Element not found in the array.");
	        } else {
	            System.out.println("Element found at index: " + result);
	        }
	    }
	}
