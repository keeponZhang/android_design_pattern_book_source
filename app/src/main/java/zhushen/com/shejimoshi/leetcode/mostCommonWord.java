package zhushen.com.shejimoshi.leetcode;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Zhushen on 2018/9/7.
 */
public class mostCommonWord {

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args){
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = new String[]{"hit"};
        String result = mostCommonWord(paragraph,banned);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> bannedSet = new HashSet<>();
        HashMap<String, Integer> wordsMap = new HashMap<>();
        String mcw = "";
        int mcwCount = -1;

        // filter spaces and punctuation
        String[] wordsArr = paragraph.toLowerCase().split(" |!|\\?|'|,|;|\\.");

        // put banned words into hash set
        for(String s: banned)
            bannedSet.add(s);

        // add and count non-banned words into wordsMap
        for(String s: wordsArr)
        {
            if(!bannedSet.contains(s) && !s.equals(""))
            {
                wordsMap.put(s, wordsMap.getOrDefault(s, 0) + 1);

                int count = wordsMap.get(s);
                // keep tracking the most common word
                if(count > mcwCount)
                {
                    mcw = s;
                    mcwCount = count;
                }
            }

        }

        return mcw;
    }
}
