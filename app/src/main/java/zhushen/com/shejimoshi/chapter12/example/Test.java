package zhushen.com.shejimoshi.chapter12.example;

/**
 * Created by Zhushen on 2018/5/12.
 */
public class Test {
    public static void main(String[] args){
        DevTechFrontier devTechFrontier = new DevTechFrontier();

        Coder mrsimple = new Coder("Mr.Simple");
        Coder coder1 = new Coder("coder1");
        Coder coder2 = new Coder("coder2");
        Coder coder3 = new Coder("coder3");

        devTechFrontier.addObserver(mrsimple);
        devTechFrontier.addObserver(coder1);
        devTechFrontier.addObserver(coder2);
        devTechFrontier.addObserver(coder3);

        devTechFrontier.postNewPublication("test message");

    }
}
