package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * Created by Zhushen on 2018/8/21.
 */
public class ladderLength {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (wordList == null) {
            return 0;
        }
        if (beginWord.equals(endWord)) {
            return 1;
        }

        //为了能搜出这个结果，end需在字典中
        wordList.add(beginWord);
        wordList.add(endWord);

        //BFS搜索每层可能的结果，并比较知否找到end
        Queue<String> queue = new LinkedList<>();
        HashSet<String> set = new HashSet<>();
        queue.offer(beginWord);
        set.add(beginWord);

        int length = 1;
        while (!queue.isEmpty()) {
            length++;   //遍历每层可能的结果前计数值加一
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String word = queue.poll();
                //遍历下个单词的所有可能，如果已出现过这个可能则直接跳过，将没出现过的记录下来
                for (String nextWord : wordList) {
                    if (set.contains(nextWord)) {
                        continue;
                    }
                    if (nextWord.equals(endWord)) {
                        return length;
                    }
                    set.add(nextWord);
                    queue.offer(nextWord);
                }
            }
        }
        return 0;


    }

    private ArrayList<String> getNextWords(String word, Set<String> dict) {
        ArrayList<String> nextWords = new ArrayList<>();
        for (char c = 'a'; c < 'z'; c++) {
            for (int i = 0; i < word.length(); i++) {
                if (c == word.charAt(i)) {
                    continue;
                }
                String nextWord = replace(word, i, c);
                if (dict.contains(nextWord)) {
                    nextWords.add(nextWord);
                }
            }
        }
        return nextWords;
    }


    private String replace(String s, int index, char c) {
        char[] chars = s.toCharArray();
        chars[index] = c;
        return new String(chars);
    }

}
