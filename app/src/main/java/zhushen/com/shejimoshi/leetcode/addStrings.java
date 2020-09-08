package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/23.
 */
public class addStrings {
    public static void main(String[] args){
        String result = addStrings("661","12345");
        int x = 0;
    }

    public static String addStrings(String num1, String num2) {

        int length1 = num1.length();
        int length2 = num2.length();

        StringBuilder stringBuilder1,stringBuilder2;
        if(length1>length2){
            stringBuilder1= new StringBuilder(num1);
            stringBuilder2 = new StringBuilder(num2);
        }else {
            stringBuilder1= new StringBuilder(num2);
            stringBuilder2 = new StringBuilder(num1);

            length2 = length1;
            length1 = num2.length();
        }


        StringBuilder result = new StringBuilder();

        stringBuilder1.reverse();
        stringBuilder2.reverse();

        int temp = 0;
        for(int i=0;i<length2;i++){
            int val = stringBuilder1.charAt(i) -'0' + stringBuilder2.charAt(i)- '0' + temp;
            result.append(val%10);
            temp = val/10;
        }
        for (int i = length2; i < length1; i++) {
            int val = stringBuilder1.charAt(i) - '0' + temp;
            result.append(val%10);
            temp = val/10;
        }

        if(temp!=0){
            result.append(temp);
        }
        return result.reverse().toString();

    }
}
