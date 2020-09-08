package zhushen.com.shejimoshi.chapter23.example1;

/**
 * Created by Zhushen on 2018/11/22.
 */
public class MobilePhone {
    private Phone phone = new PhoneImpl();
    private Camera camera = new SamsungCamera();

    public void dail(){
        phone.dail();
    }

    public void videoChat(){
        System.out.println("--------> video chat");
        camera.open();
        phone.dail();
    }

    public void hangup(){
        phone.hangup();
    }

    public void takePicture(){
        camera.open();
        camera.takePicture();
    }

    public void closeCamera(){
        camera.close();
    }
}
