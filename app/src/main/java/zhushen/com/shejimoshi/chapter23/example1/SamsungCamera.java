package zhushen.com.shejimoshi.chapter23.example1;

/**
 * Created by Zhushen on 2018/11/22.
 */
public class SamsungCamera implements Camera {
    @Override
    public void open() {
        System.out.println("open camera");
    }

    @Override
    public void takePicture() {
        System.out.println("takePicture");

    }

    @Override
    public void close() {
        System.out.println("close camera");

    }
}
