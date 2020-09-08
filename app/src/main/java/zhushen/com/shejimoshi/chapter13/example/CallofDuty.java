package zhushen.com.shejimoshi.chapter13.example;

/**
 * Created by Zhushen on 2018/5/14.
 */
public class CallofDuty {
    private int mCheckPoint = 1;
    private int mLifeValue = 100;
    private String mWeapon = "Desert Eagle";

    public void play(){
        System.out.println("play game :" + String.format("round %d",mCheckPoint) + "playing");
        mLifeValue -= 10;
        System.out.println("progress up");
        mCheckPoint ++;
        System.out.println("reach" + String.format("round %d",mCheckPoint));
    }

    public void quit(){
        System.out.println("---------------");
        System.out.println("before quit attribute = " + this.toString());
        System.out.println("quit game");
        System.out.println("---------------");
    }

    public Memoto createMemoto(){
        Memoto memoto = new Memoto();
        memoto.mCheckPoint = mCheckPoint;
        memoto.mLifeValue = mLifeValue;
        memoto.mWeapon = mWeapon;
        return memoto;
    }

    public void restore(Memoto memoto){
        this.mCheckPoint = memoto.mCheckPoint;
        this.mLifeValue = memoto.mLifeValue;
        this.mWeapon = memoto.mWeapon;
        System.out.println("restore attribute = " + this.toString());
    }

    @Override
    public String toString() {
        return "CallofDuty [mCheckPoint =" +mCheckPoint
                +  ",mLifeValue = "+mLifeValue
                +  ",mWeapon = "+mWeapon +"]";
    }
}
