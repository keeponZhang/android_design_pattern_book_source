package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/24.
 */
public class licenseKeyFormatting {
    public static void main(String[] args){
        String result = licenseKeyFormatting("5F3Z-2e-9-w",4);
        int x = 1;


    }

    public static String licenseKeyFormatting(String S, int K) {

        String[] strings = S.toUpperCase().split("-");
        StringBuilder stringBuilder = new StringBuilder();
        for (String str:strings) {
            stringBuilder.append(str);
        }
        S = stringBuilder.reverse().toString();
        StringBuilder result  = new StringBuilder(addSpace(S,K));
        String output = result.reverse().toString();
        if(output.startsWith("-")){
            return output.substring(1,output.length());
        }

        return output;
    }

    private static String addSpace(String input,int space) {
        String regex = "(.{"+space +"})";
        input = input.replaceAll (regex, "$1-");
        return input;
    }
}
