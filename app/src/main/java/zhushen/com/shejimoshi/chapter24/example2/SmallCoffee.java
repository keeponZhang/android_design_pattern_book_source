package zhushen.com.shejimoshi.chapter24.example2;

/**
 * Created by Zhushen on 2018/12/11.
 */
public class SmallCoffee extends Coffee {
    public SmallCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("small " + impl + "coffee");
    }
}
