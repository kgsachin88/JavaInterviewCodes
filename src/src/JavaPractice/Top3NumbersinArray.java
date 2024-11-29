package JavaPractice;

public class Top3NumbersinArray {
    public static void main(String[] args) {
        int[] arr = {10, 4, 3, 50, 23, 90};
        if (arr.length < 3) {
            System.out.println("Array must have at least 3 elements.");

        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                // Shift the top two down
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                // Shift the second down
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }

        System.out.println("Top three numbers are: " + first + ", " + second + ", " + third);
    }
}

