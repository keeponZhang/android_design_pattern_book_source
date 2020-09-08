package zhushen.com.shejimoshi.chapter22;

/**
 * Created by Zhushen on 2018/11/22.
 */
public class test {
    public static void main(String[] args){
        testString();
    }

    private static void testString(){
        String str1 = new String("abc");
        String str2 = "abc";
        String str3 = new String("abc");
        String str4 = "ab" + "c";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str3.equals(str2));

        System.out.println(str1 == str2);
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str4 == str2);
    }
}
