package zhushen.com.shejimoshi.chapter10;

/**
 * Created by Zhushen on 2018/5/11.
 */
public class Client {
    public static void main(String[] args){
        Calculator calculator = new Calculator("153 + 3589 + 118 + 555");
        System.out.println(calculator.calculate());
    }
}
