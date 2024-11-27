package JavaPractice;



import java.util.Scanner;

public class Plandrome {
    public static void main(String[] args) {

      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String input = scanner.nextLine();*/
        String input = "Madm";
        String CleanedString = input.replaceAll("\\s+", "").toLowerCase();
        boolean isPalindrome = true;
        int left = 0;
        int right = CleanedString.length()-1;
        System.out.println(right);

        while (left < right) {
            if (CleanedString.charAt(left) != CleanedString.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        //scanner.close();


    }

}



