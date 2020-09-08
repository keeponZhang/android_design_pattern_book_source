package zhushen.com.shejimoshi.chapter9.example3;

/**
 * Created by Zhushen on 2018/5/9.
 */
public class XiaoMin {
    public static void main(String[] args){
        GroupLeader groupLeader = new GroupLeader();
        Director director = new Director();
        Manager manager = new Manager();
        Boss boss = new Boss();


        groupLeader.nextHandler = director;
        director.nextHandler = manager;
        manager.nextHandler = boss;

        groupLeader.handleRequest(50000);

    }
}
