package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/8/2.
 */
public class nearestPalindromic {

    public String nearestPalindromic(String n) {
        StringBuilder stringBuilder = new StringBuilder(n);

        if (nearOne(n)) {
            stringBuilder = new StringBuilder();
            for (int i = 0; i < n.length()-1; i++) {
                stringBuilder.append("9");
            }
            return stringBuilder.toString();
        }

        if (isNine(n)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("1");
            for (int i = 0; i < n.length()-1; i++) {
                stringBuilder.append("0");
            }
            stringBuilder.append("1");
            return stringBuilder.toString();
        }

        if (isPalindrome(n)) {
            char c = n.charAt(n.length()/2);
            if (c == '0') {
                int nc = Integer.parseInt(c+"");
                nc++;
                stringBuilder.replace(n.length()/2,n.length()/2+1,nc+"");
                if (n.length()%2 == 0) {
                    stringBuilder.replace(n.length()/2-1,n.length()/2,nc+"");
                }
            } else {
                int nc = Integer.parseInt(c+"");
                nc--;
                stringBuilder.replace(n.length()/2,n.length()/2+1,nc+"");
                if (n.length()%2 == 0) {
                    stringBuilder.replace(n.length()/2-1,n.length()/2,nc+"");
                }
            }
        } else {
            int low = 0, high = n.length()-1;
            while (low < high-1) {
                if (n.charAt(low) != n.charAt(high)) {
                    stringBuilder.replace(high, high+1, n.charAt(low)+"");
                }
                low++;
                high--;
            }
            if (n.length()%2==0) {
                char a = n.charAt(n.length()/2-1);
                char b = n.charAt(n.length()/2);
                if (a != b) {
                    String two = two(a, b, n, stringBuilder.toString());
                    if (two.length() == 1) {
                        two = two+two;
                    }
                    stringBuilder.replace(n.length()/2-1, n.length()/2+1, two);
                }
            } else {
                return one(n, stringBuilder.toString());
            }
        }
        return stringBuilder.toString();
    }

    private boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int low = 0, high = s.length()-1;
        while (low < high) {
            if (s.charAt(low++) != s.charAt(high--)) return false;
        }
        return true;
    }

    /**
     * 判断是不是10...01,10..0,11这种形式
     * @param n
     * @return
     */
    private boolean nearOne(String n) {
        int len = n.length();
        if (!(n.charAt(0) == '1' && (n.charAt(len-1) == '1' || n.charAt(len-1) == '0') && len > 1)) {
            return false;
        }
        for (int i = 1; i < len-1; i++) {
            if (n.charAt(i) != '0') return false;
        }
        return true;
    }

    /**
     * 是否是9...9这种形式
     * @param n
     * @return
     */
    private boolean isNine(String n) {
        int len = n.length();
        if (len <= 1) return false;
        for (int i = 0; i < len; i++) {
            if (n.charAt(i) != '9') return false;
        }
        return true;
    }

    /**
     * 数字ab
     * @param a
     * @param b
     * @return 离ab最近到回文
     */
    private String two(char a, char b, String num, String num1) {

        Double d = Double.parseDouble(num.substring(num.length()/2-1));

        StringBuilder sb1 = new StringBuilder(num1.substring(num.length()/2-1));
        sb1.replace(1,2,a+"");
        Double d1 = Double.parseDouble(sb1.toString());

        StringBuilder sb2 = new StringBuilder(sb1.toString());

        int ai = Integer.parseInt(a+"");
        int bi = Integer.parseInt(b+"");
        int n = ai*10+bi;
        int r = ai*10+ai;
        int r1 = 0;
        if (r > n) {
            r1 = r - 11;

        } else if (r < n){
            r1 = r + 11;

        } else {
            return r+"";
        }

        if (r1 < 10) {
            sb2.replace(0,2,"0"+r1);
        } else {
            sb2.replace(0,2,r1+"");
        }

        double d2 = Double.parseDouble(sb2.toString());

        double m = Math.abs(d2-d) - Math.abs(d1-d);

        if (m > 0) {
            return r+"";
        } else if (m < 0) {
            return r1+"";
        } else {
            if (d2 < d1) {
                return r1+"";
            } else {
                return r+"";
            }
        }
    }

    /**
     * 12389 应该返回12421而不是12321
     * @param n
     * @return
     */
    private String one(String n, String n1) {
        StringBuilder sb = new StringBuilder();
        sb.append(n.substring(n.length()/2, n.length()));

        StringBuilder sb1 = new StringBuilder();
        sb1.append(n1.substring(n1.length()/2, n1.length()));

        StringBuilder sb2 = new StringBuilder(sb1.toString());

        char c = n.charAt(n.length()/2);
        int ic = Integer.parseInt(c+"");

        int in = Integer.parseInt(sb.toString());
        int in1 = Integer.parseInt(sb1.toString());
        int in2 = 0;
        if (in > in1) {
            ic++;
        } else {
            ic--;
        }
        sb2.replace(0,1,ic+"");
        in2 = Integer.parseInt(sb2.toString());

        int m = Math.abs(in2-in) - Math.abs(in1-in);

        sb2 = new StringBuilder(n1);
        sb2.replace(n.length()/2, n.length()/2+1, ic+"");
        if (m < 0) {
            return sb2.toString();
        } else if (m == 0) {
            if (in2 < in1) {
                return sb2.toString();
            } else {
                return n1;
            }
        } else {
            return n1;
        }
    }
}
