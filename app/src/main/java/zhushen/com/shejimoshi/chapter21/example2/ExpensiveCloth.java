package zhushen.com.shejimoshi.chapter21.example2;

/**
 * Created by Zhushen on 2018/8/20.
 */
public class ExpensiveCloth extends PersonCloth {
    public ExpensiveCloth(Person mPerson) {
        super(mPerson);
    }

    private void dressShirt(){
        System.out.println("dress shirt");
    }

    private void dressLeather(){
        System.out.println("dress leather");
    }

    private void dressJean(){
        System.out.println("dress jean");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShirt();
        dressLeather();
        dressJean();
    }
}
