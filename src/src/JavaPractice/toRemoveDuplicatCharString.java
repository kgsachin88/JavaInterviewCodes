package JavaPractice;

import java.util.LinkedHashSet;

public class toRemoveDuplicatCharString {
    public static void main(String[] args) {
        String input = "Prpsogramming";
        String result="";
        char[] strarr = input.toLowerCase().toCharArray();
        LinkedHashSet<Character> hset = new LinkedHashSet<>();
        for(char c: strarr){
            hset.add(c);
        }
        System.out.println(hset);

        for (char ch:hset) {
            result+=ch;
        }
        System.out.println(result);


    }
}
