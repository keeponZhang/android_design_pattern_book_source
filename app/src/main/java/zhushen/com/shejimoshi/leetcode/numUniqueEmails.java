package zhushen.com.shejimoshi.leetcode;

import java.util.HashSet;

/**
 * Created by Zhushen on 2018/11/30.
 */
public class numUniqueEmails {
    //输入：["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
    //输出：2
    //解释：实际收到邮件的是 "testemail@leetcode.com" 和 "testemail@lee.tcode.com"。
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for (String email:
                emails) {
            String[] afterCliped=email.split("@");

            String temp=afterCliped[0];
            if (temp.contains("+")){
                temp= temp.substring(0,temp.indexOf("+"));
            }
            if (temp.contains(".")){
                temp=temp.replace(".","");
            }
            set.add(temp+"@"+afterCliped[1]);
        }
        return set.size();
    }
}
