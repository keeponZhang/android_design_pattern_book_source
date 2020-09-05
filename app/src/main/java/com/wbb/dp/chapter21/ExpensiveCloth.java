package com.wbb.dp.chapter21;

/**
 * @author vico
 * @date 2019-01-03
 */
public class ExpensiveCloth extends PersonCloth {

    public ExpensiveCloth(Person mPerson) {
        super(mPerson);
    }

    private void dressShirt(){
        System.out.println("穿件短袖");
    }

    private void dressLeather(){
        System.out.println("穿件皮衣");
    }

    private void dressJean(){
        System.out.println("穿条牛仔裤");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShirt();
        dressLeather();
        dressJean();
    }
}
