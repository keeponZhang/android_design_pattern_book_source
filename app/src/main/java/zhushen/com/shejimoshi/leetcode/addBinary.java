package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/13.
 */
public class addBinary {
    public static void main(String[] args){
        String result = addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011");
        int i = 0;
    }



    public static String addBinary(String a, String b) {
        StringBuilder sba = new StringBuilder(a);
        StringBuilder sbb = new StringBuilder(b);
        StringBuilder result = new StringBuilder();

        sba.reverse();
        sbb.reverse();

        int la = a.length();
        int lb = b.length();
        int length = la>lb?la:lb;

        int va = 0;
        int vb = 0;

        Math.sqrt(100);

        int temp = 0;
        for(int i=0;i<length;i++){
            if(i>=la){
                va =0;
            }else {
                va= Integer.valueOf(sba.substring(i,i+1));
            }

            if(i>=lb){
                vb = 0;
            }else {
                vb = Integer.valueOf(sbb.substring(i,i+1));
            }

            switch (va+vb +temp){
                case 0:
                    result.append("0");
                    temp = 0;
                    break;
                case 1:
                    result.append("1");
                    temp = 0;
                    break;
                case 2:
                    result.append("0");
                    temp =1;
                    break;
                case 3:
                    result.append("1");
                    temp =1;
                    break;
            }

        }

        if(temp ==1){
            result.append(temp);
        }



        result.reverse();

        return result.toString();
    }
}
