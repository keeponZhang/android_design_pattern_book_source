package zhushen.com.shejimoshi.chapter15.example;

/**
 * Created by Zhushen on 2018/5/23.
 */
public class Client {
    public static void main(String[] args){
        AbsreactComputer computer = new CoderComputer();
        computer.startUp();

        computer = new MilitaryComputer();
        computer.startUp();
    }
}
