package zhushen.com.shejimoshi.chapter14.example2;

import java.util.List;

/**
 * Created by Zhushen on 2018/5/16.
 */
public class Boss {
    public static void main(String[] args){
        CompanyMin min = new CompanyMin();
        List minList = min.getList();
        for(int i = 0;i<minList.size();i++){
            System.out.println(minList.get(i).toString());
        }
        check(min.iterator());



        CompanyHui hui = new CompanyHui();
        Employee[] huiArray = hui.getArray();
        for (Employee e:huiArray) {
            System.out.println(e.toString());
        }
        check(hui.iterator());
    }

    private static void check(Iterator iterator){
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
