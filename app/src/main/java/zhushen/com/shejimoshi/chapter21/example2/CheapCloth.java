package zhushen.com.shejimoshi.chapter21.example2;

/**
 * Created by Zhushen on 2018/8/20.
 */
public class CheapCloth extends PersonCloth {
    public CheapCloth(Person mPerson) {
        super(mPerson);
    }

    public void dressShort(){
        System.out.println("dress short");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShort();
    }
}
