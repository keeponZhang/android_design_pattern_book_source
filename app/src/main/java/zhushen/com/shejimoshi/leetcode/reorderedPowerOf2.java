package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Zhushen on 2018/9/11.
 */
public class reorderedPowerOf2 {
    public boolean reorderedPowerOf2(int N) {
        //1 2 4 8
        //16 32 64                              64 61 32
        //128 256 512                           821 652 521
        //1024 2048 4096 8192                   9821 9640 8420 4210
        //16384 32768 65536                     86431 87632 66553
        //131072 262144 524288                  885422  732110  644221
        //1048576 2097152 4194304 8388608       9752210 9444310 8888630 8765410
        //16777216 33554432 67108864            88766410 77766211 55443332
        //134217728 268435456 536870912         987653210 877432211 866554432
        String num = N+"";
        int[] nums = new int[num.length()];

        for (int i = 0; i <num.length(); i++) {
            nums[i] = num.charAt(i) -'0';
        }
        Arrays.sort(nums);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <num.length() ; i++) {
            sb.append(nums[i]);
        }
        List<String> list = Arrays.asList("1","2","4","8"
                ,"64","61","32"
                ,"821","652","521"
                ,"9821","9640","8420","4210"
                ,"86431","87632","66553"
                ,"885422","732110","644221"
                ,"9752210","9444310","8888630","8765410"
                ,"88766410","77766211","55443332"
                ,"987653210","877432211","866554432");
        return list.contains(sb.reverse().toString());
    }
}
