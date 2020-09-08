package zhushen.com.shejimoshi.chapter24.example2;

/**
 * Created by Zhushen on 2018/12/11.
 */
public class LarageCoffee extends Coffee {
    public LarageCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("large " + impl + "coffee");
    }
}
