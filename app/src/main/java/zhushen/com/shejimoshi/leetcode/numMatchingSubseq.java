package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/10/30.
 */
public class numMatchingSubseq {

    public static void main(String[] args){
        String[] words = new String[]{"wpddkvbnn",
                "lnagtva",
                "kvbnnuglnagtvamxkqtwhqgwbqgfbvgkwyuqkdwhzudsxvju",
                "rwpddkvbnnugln",
                "gloeofnpjqlkdsqvruvabjrikfwronbrdyyj",
                "vbgeinupkvgmgxeaaiuiyojmoqkahwvbpwugdainxciedbdkos",
                "mspuhbykmmumtveoighlcgpcapzczomshiblnvhjzqjlfkpina",
                "rgmliajkiknongrofpugfgajedxicdhxinzjakwnifvxwlokip",
                "fhepktaipapyrbylskxddypwmuuxyoivcewzrdwwlrlhqwzikq",
                "qatithxifaaiwyszlkgoljzkkweqkjjzvymedvclfxwcezqebx"};
        String S = "rwpddkvbnnuglnagtvamxkqtwhqgwbqgfbvgkwyuqkdwhzudsxvjubjgloeofnpjqlkdsqvruvabjrikfwronbrdyyjnakstqjac";

        int result = numMatchingSubseq(S,words);
        int x = 0;

    }
    public static int numMatchingSubseq(String S, String[] words) {
        int sum = 0;
        int[] index = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            index[i] = 0;
        }
        boolean hasMatch = false;
        char[] cs = S.toCharArray();
        for (int m = 0; m < cs.length; m++) {
            char c = cs[m];
            if (!hasMatch && m > 0 && cs[m - 1] == c) {
                continue;
            }
            if (hasMatch) hasMatch = false;
            for (int i = 0; i < words.length; i++) {
                if (index[i] == -1) {
                    continue;
                }
                if (c == words[i].charAt(index[i])) {
                    index[i]++;
                    if (index[i] >= words[i].length()) {
                        sum++;
                        index[i] = -1;
                        hasMatch = true;
                    }
                }
            }
        }
        return sum;

    }
}
