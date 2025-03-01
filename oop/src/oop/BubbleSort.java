package oop;

public class BubbleSort {
	 public static void swap(int a[], int i, int j) {
	        int temp = a[i];
	        a[i] = a[j];
	        a[j] = temp;
	    }

	    public static void bubbleSort(int a[]) {
	        for (int i = 0; i < a.length - 1; i++) {
	            for (int j = 0; j < a.length - i - 1; j++) {
	                if (a[j] > a[j + 1]) {
	                    swap(a, j, j + 1);
	                }
	            }
	        }
	    }
	public static void main(String[] args) {
		 int[] array = {64, 34, 25, 12, 22, 11, 90};
	        System.out.println("Unsorted array:");
	        for (int i : array) {
	            System.out.print(i + " ");
	        }
	        System.out.println();

	        bubbleSort(array);

	        System.out.println("Sorted array:");
	        for (int i : array) {
	            System.out.print(i + " ");
	        }
	    }

	}

