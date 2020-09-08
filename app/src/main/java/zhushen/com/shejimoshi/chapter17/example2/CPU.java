package zhushen.com.shejimoshi.chapter17.example2;

/**
 * Created by Zhushen on 2018/5/29.
 */
public class CPU extends Colleague {
    private String dateVideo,dataSound;

    public CPU(Mediator mediator) {
        super(mediator);
    }

    public String getDateVideo() {
        return dateVideo;
    }

    public String getDataSound() {
        return dataSound;
    }

    public void decodeData(String data){
        String[] tmp = data.split(",");

        dateVideo = tmp[0];
        dataSound = tmp[1];

        mediator.changed(this);
    }
}
