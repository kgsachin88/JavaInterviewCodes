package JavaPractice;

public class

StringWordwiseReverse {
    public static void main(String[] args) {
        String str = "Hello Sachin";
        String[] words = str.split(" ");
        String result = "";
        for(String word: words){
            String reverse = "";
            for(int i = word.length()-1;i>=0;i--){
                reverse += word.charAt(i);
            }
            result +=reverse+" ";
        }
        System.out.println(result.trim());
    }
}
