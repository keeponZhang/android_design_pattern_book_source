package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/2.
 */
public class maskPII {
    public String maskPII(String S) {

        return "";
    }

    public String MaskMail(String S){
        S = S.toLowerCase();
        String[] strings = S.split("@");
        StringBuilder sb = new StringBuilder();
        sb.append(strings[0].charAt(0));
        sb.append("*****");
        sb.append(strings[0].charAt(strings[0].length() - 1));
        sb.append("@");
        sb.append(strings[1]);
        return sb.toString();
    }

    //电话号码是一串包括数组 0-9，以及 {'+', '-', '(', ')', ' '} 这几个字符的字符串。你可以假设电话号码包含 10 到 13 个数字。
    //
    //电话号码的最后 10 个数字组成本地号码，在这之前的数字组成国际号码。注意，国际号码是可选的。我们只暴露最后 4 个数字并隐藏所有其他数字。
    //
    //本地号码是有格式的，并且如 "***-***-1111" 这样显示，这里的 1 表示暴露的数字。
    //
    //为了隐藏有国际号码的电话号码，像 "+111 111 111 1111"，我们以 "+***-***-***-1111" 的格式来显示。在本地号码前面的 '+' 号和第一个 '-' 号仅当电话号码中包含国际号码时存在。例如，一个 12 位的电话号码应当以 "+**-" 开头进行显示。

    //


    public String MaskPhone(String S){

        return "";
    }


}
