package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/8/21.
 */
public class originalDigits {
    public static void main(String[] args){
        String result = originalDigits("owoztneoer");
        int x = 0;
    }

    public static String originalDigits(String s) {
        //zero              z
        //one
        //two               w
        //three
        //four              u
        //five
        //six               x
        //seven
        //eight             
        //nine

        int[] chars = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i) - 'a';
            chars[x] ++;
        }

        int[] nums = new int[10];
        nums[0] = chars['z'-'a'];
        nums[2] = chars['w'-'a'];
        nums[4] = chars['u'-'a'];
        nums[6] = chars['x'-'a'];
        nums[8] = chars['g'-'a'];

        nums[1] = chars['o'-'a'] - nums[0] - nums[2] - nums[4];
        nums[3] = chars['h'-'a'] - nums[8];
        nums[5] = chars['f'-'a'] - nums[4];
        nums[7] = chars['s'-'a'] - nums[6];
        nums[9] = chars['i'-'a'] - nums[6] - nums[8] - nums[5];

        String result = "";

        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j <nums[i] ; j++) {
                result += (i);
            }
        }

        return result;

    }
}
