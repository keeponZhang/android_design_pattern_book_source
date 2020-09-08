package zhushen.com.shejimoshi.chapter13.example;

/**
 * Created by Zhushen on 2018/5/14.
 */
public class Caretaker {
    Memoto memoto;

    public void archive(Memoto memoto){
        this.memoto = memoto;
    }

    public Memoto getMemoto() {
        return memoto;
    }
}
