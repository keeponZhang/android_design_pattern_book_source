package zhushen.com.shejimoshi.Chapter7.example;


/**
 * Created by Zhushen on 2018/5/7.
 */
public class TrafficCalculator {
    public static void main(String[] args){
        TrafficCalculator calculator = new TrafficCalculator();
        calculator.setStrategy(new BusStrategy());
        System.out.println("16 km bus price = " + calculator.calculatePrice(16));
    }


    CalculateStrategy mStrategy;

    public void setStrategy(CalculateStrategy mStrategy) {
        this.mStrategy = mStrategy;
    }

    public int calculatePrice(int km){
        return mStrategy.calculatePrice(km);
    }
}
