package JavaPractice;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateWords {
    public static void main(String[] args) {
        String input = "This is a test. This test is only a test.";
        String[] words = input.toLowerCase().split("\\W+");
        HashMap<String,Integer> wordscountMap = new HashMap<>();
        for(String word:words){
            if(wordscountMap.containsKey(word)){
                wordscountMap.put(word,wordscountMap.get(word)+1);
            }else {
                wordscountMap.put(word,1);
            }
        }

        for(Map.Entry<String,Integer> entry: wordscountMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+"   "+entry.getValue());
            }



        }
    }
}
