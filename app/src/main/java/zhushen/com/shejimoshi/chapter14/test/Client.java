package zhushen.com.shejimoshi.chapter14.test;

/**
 * Created by Zhushen on 2018/5/25.
 */
public class Client {
    public static void main(String[] args){
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
