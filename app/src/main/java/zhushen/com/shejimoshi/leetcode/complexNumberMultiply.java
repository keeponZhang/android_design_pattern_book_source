package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/10/9.
 */
public class complexNumberMultiply {

    // a+bi
    public String complexNumberMultiply(String a, String b) {

        int realA = 0,realB = 0;
        int imagineA = 0,imagineB = 0;
        String arrayA[] = a.split("\\+");
        String arrayB[] = b.split("\\+");
        realA = Integer.parseInt(arrayA[0]);
        realB = Integer.parseInt(arrayB[0]);
        imagineA = Integer.parseInt(arrayA[1].substring(0, arrayA[1].indexOf('i')));
        imagineB = Integer.parseInt(arrayB[1].substring(0, arrayB[1].indexOf('i')));

        int newReal = realA * realB - imagineA * imagineB;
        int newImagine = realA * imagineB + realB * imagineA;
        StringBuilder result =  new StringBuilder();
        result.append(newReal).append("+").append(newImagine).append('i');

        return result.toString();
    }




}
