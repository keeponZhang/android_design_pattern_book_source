package zhushen.com.shejimoshi.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Zhushen on 2018/8/10.
 */
public class uniqueMorseRepresentations {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        String[] data = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (String word:words){
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i <word.length() ; i++) {
                String str = data[word.charAt(i) - 'a'];
                stringBuilder.append(str);
            }
            set.add(stringBuilder.toString());
        }
        return set.size();
    }
}
