import java.util.*;
public class anagram{
    public static void main(String[] args) {
        String str1 = "aabaa";
        String str2 = "baaaa";
        // System.out.println("This is the brute force approach of the program");
        // for(int i = 0; i < str1.length(); i++){
        //     for(int j = 0; j < str2.length(); j++){
        //         if(str1.charAt(i) == str2.charAt(j)){
        //             str2 = str2.substring(0, j) + str2.substring(j+1, str2.length());
        //             break;
        //         }
        //     }
        // }
        // if(str2.length() == 0){
        //     System.out.println("String is anagram");
        // }
        // else{
        //     System.out.println("String is not anagram");
        // }


        System.out.println("Let's discuss optimal solution");
        Map<Character, Integer> count = new HashMap<>();
        for(char x : str1.toCharArray()){
            count.put(x, count.getOrDefault(x, 0) + 1);
        }
        for(char x : str2.toCharArray()){
            count.put(x, count.getOrDefault(x, 0) - 1);
        }
        int flag = 0;
        for(int val : count.values()){
            if(val != 0){
                System.out.println("String is not anagram");
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.println("String is anagram");
        }
    }
}