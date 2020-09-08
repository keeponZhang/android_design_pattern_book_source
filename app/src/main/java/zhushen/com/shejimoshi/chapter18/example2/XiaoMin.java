package zhushen.com.shejimoshi.chapter18.example2;

/**
 * Created by Zhushen on 2018/5/30.
 */
public class XiaoMin implements ILawsuit {
    @Override
    public void submit() {
        System.out.println("xiaomin submit");
    }

    @Override
    public void burden() {
        System.out.println("xiaomin burden");
    }

    @Override
    public void defend() {
        System.out.println("xiaomin defend");
    }

    @Override
    public void finish() {
        System.out.println("xiaomin finish");
    }
}
