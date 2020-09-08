package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/10/11.
 */
public class numberToWords {
    static String num1[] = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
    static String num2[] = { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
    static String tens[] = { "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

    public String numberToWords(int num) {
        if(num == 0){return "Zero";}
        String result = "";
        if(num > 999999999){
            result += numberToWordsWithThreeDIgit(num/1000000000) + " Billion";
            num %= 1000000000;
        }
        if(num > 999999){
            result += numberToWordsWithThreeDIgit(num/1000000) + " Million";
            num %= 1000000;
        }
        if(num > 999){
            result += numberToWordsWithThreeDIgit(num/1000) + " Thousand";
            num %= 1000;
        }
        if(num > 0){
            result += numberToWordsWithThreeDIgit(num);
        }
        return result.trim();
    }

    public String numberToWordsWithThreeDIgit(int num) {
        String result = "";
        if(num > 99){
            result += " " + num1[num / 100 - 1] + " Hundred";
        }
        num %= 100;
        if(num>19){
            result += " " + tens[num / 10 - 2];
            num %= 10;
        }else if(num>9){
            result += " " + num2[num - 10];
            num = 0;
        }
        if(num > 0){
            result += " " + num1[num-1];
        }
        return result;
    }
}
