package zhushen.com.shejimoshi.chapter24.example2;

/**
 * Created by Zhushen on 2018/12/11.
 */
public class Client {
    public static void main(String[] args){
        Ordinary implOrdinary = new Ordinary();
        Sugar implSugar = new Sugar();

        LarageCoffee larageCoffeeOrdinary = new LarageCoffee(implOrdinary);
        larageCoffeeOrdinary.makeCoffee();

        SmallCoffee smallCoffeeOrdinary = new SmallCoffee(implOrdinary);
        smallCoffeeOrdinary.makeCoffee();

        LarageCoffee larageCoffeeSugar = new LarageCoffee(implSugar);
        larageCoffeeSugar.makeCoffee();

        SmallCoffee smallCoffeeSugar = new SmallCoffee(implSugar);
        smallCoffeeSugar.makeCoffee();

    }
}
