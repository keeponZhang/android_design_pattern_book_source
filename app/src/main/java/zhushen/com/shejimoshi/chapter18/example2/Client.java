package zhushen.com.shejimoshi.chapter18.example2;

/**
 * Created by Zhushen on 2018/5/30.
 */
public class Client {
    public static void main(String[] args){
        ILawsuit xiaomin = new XiaoMin();
        ILawsuit lawyer = new Lawyer(xiaomin);

        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();
    }
}
