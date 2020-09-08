package zhushen.com.shejimoshi.Chapter7;

/**
 * Created by Zhushen on 2018/5/7.
 */
public class PriceCalculator {
    private static final int BUS = 1;
    private static final int SUBWAY = 2;
    private static final int TAXI = 3;

    public static void main(String[] args){
        PriceCalculator calculator = new PriceCalculator();
        System.out.println("16 km bus price = " + calculator.calculatePrice(16,BUS));
        System.out.println("16 km subway price = " + calculator.calculatePrice(16,SUBWAY));
        System.out.println("16 km TAXI price = " + calculator.calculatePrice(16,TAXI));
    }


    private int busPrice(int km){
        int extraTotal = km -10;
        int extraFactor = extraTotal/5;
        int fraction = extraTotal%5;
        int price = 1 + extraFactor *1;
        return fraction>0?++price:price;
    }

    private int subwayPrice(int km){
        if(km<=6){
            return 3;
        }else if(km>6&&km<=12){
            return 4;
        }else if(km>12&&km<=22){
            return 5;
        }else if(km>22&&km<=32){
            return 6;
        }
        return 7;
    }

    int calculatePrice(int km,int type){
        if(type ==BUS){
            return busPrice(km);
        }else if(type == SUBWAY){
            return subwayPrice(km);
        }else if(type == TAXI){
            return taxiPrice(km);
        }
        return 0;
    }


    private int taxiPrice(int km){
        return  km*2;
    }
}
