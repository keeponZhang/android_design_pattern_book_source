package zhushen.com.shejimoshi.chapter17.example2;

/**
 * Created by Zhushen on 2018/5/29.
 */
public class CDDevice extends Colleague {
    private String data;

    public CDDevice(Mediator mediator) {
        super(mediator);
    }

    public String read(){
        return data;
    }

    public void load(){
        data = "video data,sound data";
        mediator.changed(this);
    }

}
