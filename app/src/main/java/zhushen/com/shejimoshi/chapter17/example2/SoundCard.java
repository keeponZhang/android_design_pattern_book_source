package zhushen.com.shejimoshi.chapter17.example2;

/**
 * Created by Zhushen on 2018/5/29.
 */
public class SoundCard extends Colleague {
    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    public void soundPlay(String data){
        System.out.println("sound :" + data);
    }
}
