package zhushen.com.shejimoshi.chapter8.example.state;

/**
 * Created by Zhushen on 2018/5/8.
 */
public interface TVState {
    void nextChannel();
    void prevChannel();
    void turnUp();
    void turnDown();
}
