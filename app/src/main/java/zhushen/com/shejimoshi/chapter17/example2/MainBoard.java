package zhushen.com.shejimoshi.chapter17.example2;

/**
 * Created by Zhushen on 2018/5/29.
 */
public class MainBoard extends Mediator{
    private CDDevice cdDevice;
    private CPU cpu;
    private SoundCard soundCard;
    private GraphicsCard graphicsCard;


    @Override
    public void changed(Colleague c) {
        if(c == cdDevice){
            handleCD((CDDevice)c);
        }else if(c == cpu){
            handleCPU((CPU)c);
        }

    }

    private void handleCPU(CPU c) {
        soundCard.soundPlay(c.getDataSound());
        graphicsCard.videoPlay(c.getDateVideo());
    }

    private void handleCD(CDDevice c) {
        cpu.decodeData(cdDevice.read());
    }

    public void setCdDevice(CDDevice cdDevice) {
        this.cdDevice = cdDevice;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }
}
