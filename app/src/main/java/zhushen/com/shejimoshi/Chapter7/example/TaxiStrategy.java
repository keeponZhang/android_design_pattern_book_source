package zhushen.com.shejimoshi.Chapter7.example;

/**
 * Created by Zhushen on 2018/5/7.
 */
public class TaxiStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        return km * 2;
    }
}
