package zhushen.com.shejimoshi.chapter17.example2;

/**
 * Created by Zhushen on 2018/5/29.
 */
public class Client {
    public static void main(String[] data){
        MainBoard mainBoard = new MainBoard();

        CDDevice cdDevice = new CDDevice(mainBoard);
        CPU cpu = new CPU(mainBoard);
        GraphicsCard graphicsCard = new GraphicsCard(mainBoard);
        SoundCard soundCard = new SoundCard(mainBoard);

        mainBoard.setCdDevice(cdDevice);
        mainBoard.setCpu(cpu);
        mainBoard.setGraphicsCard(graphicsCard);
        mainBoard.setSoundCard(soundCard);

        cdDevice.load();
    }
}
