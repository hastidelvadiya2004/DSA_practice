import java.util.*;
public class Group_anagram{
    public static void main(String[] args) {
        String strs[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> map = new HashMap<>();
        for(String word : strs){
            char chars[] = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            
            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }
        ArrayList ans = new ArrayList<>(map.values());
        System.out.println(ans);
    }
}