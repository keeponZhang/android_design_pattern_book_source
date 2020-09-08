package zhushen.com.shejimoshi.chapter17.example2;

/**
 * Created by Zhushen on 2018/5/29.
 */
public class GraphicsCard extends Colleague {
    public GraphicsCard(Mediator mediator) {
        super(mediator);
    }

    public void videoPlay(String data){
        System.out.println("video :" + data);
    }
}
