package oop;

public class serachRotatedSorted {
	
	public static int SearchSort(int a[], int key) {
		int l = 0, r = a.length - 1;
		
        while (l <= r) {
			int mid = l + (r - l) / 2; // Correct calculation of mid

			if (a[mid] == key) 
				return mid;

			// If the left half is sorted
			if (a[l] <= a[mid]) {
				// Check if the key is within the left half
				if (key >= a[l] && key < a[mid]) {
					r = mid - 1;
				} else {
					l = mid + 1;
				}
			}
			// If the right half is sorted
			else {
				// Check if the key is within the right half
				if (key > a[mid] && key <= a[r]) {
					l = mid + 1;
				} else {
					r = mid - 1;
				}
			}
		}
		return -1; // Key not found
	}


	public static void main(String[] args) {
		int a[] = {4, 5, 6, 8, 9, 1, 2, 3};
		int key = 3;
		int result = SearchSort(a, key);
		System.out.println("Index of key " + key + " is: " + result);

}}
