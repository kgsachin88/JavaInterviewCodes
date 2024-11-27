package JavaPractice;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 2, 3, 10};
        int n = array.length;

        // Step 1: Perform bubble sort directly in main
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Step 2: Perform binary search directly in main
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        int left = 0;
        int right = n - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                result = mid;  // Target found
                break;
            } else if (array[mid] < target) {
                left = mid + 1;  // Ignore left half
            } else {
                right = mid - 1; // Ignore right half
            }
        }

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
}
