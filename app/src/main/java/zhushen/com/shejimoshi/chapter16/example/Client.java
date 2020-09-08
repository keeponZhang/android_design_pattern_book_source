package zhushen.com.shejimoshi.chapter16.example;

/**
 * Created by Zhushen on 2018/5/23.
 */
public class Client {
    public static void main(String[] args){
        BusinessReport report = new BusinessReport();

        System.out.println("----------CEO FORM------------");
        report.showReport(new CEOVisitor());

        System.out.println("----------CTO FORM------------");
        report.showReport(new CTOVisitor());
    }
}
