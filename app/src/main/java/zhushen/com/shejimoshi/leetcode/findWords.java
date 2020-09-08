package zhushen.com.shejimoshi.leetcode;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Zhushen on 2018/7/20.
 */
public class findWords {
    public static void main(String[] args){

    }

    public String[] findWords(String[] words) {
        Set<String> set1,set2,set3;
        set1 = new HashSet<>();
        set1.add("q");set1.add("Q");
        set1.add("w");set1.add("W");
        set1.add("e");set1.add("E");
        set1.add("r");set1.add("R");
        set1.add("t");set1.add("T");
        set1.add("y");set1.add("Y");
        set1.add("u");set1.add("U");
        set1.add("i");set1.add("I");
        set1.add("o");set1.add("O");
        set1.add("p");set1.add("P");

        set2 = new HashSet<>();
        set2.add("a");set2.add("A");
        set2.add("s");set2.add("S");
        set2.add("d");set2.add("D");
        set2.add("f");set2.add("F");
        set2.add("g");set2.add("G");
        set2.add("h");set2.add("H");
        set2.add("j");set2.add("J");
        set2.add("k");set2.add("K");
        set2.add("l");set2.add("L");

        set3 = new HashSet<>();
        set2.add("z");set2.add("Z");
        set2.add("x");set2.add("X");
        set2.add("c");set2.add("C");
        set2.add("v");set2.add("V");
        set2.add("b");set2.add("B");
        set2.add("n");set2.add("N");
        set2.add("m");set2.add("M");


        StringBuilder sb = new StringBuilder();

        for (String str:words){

        }

        return null;
    }
}
