package zhushen.com.shejimoshi.chapter21.example2;

/**
 * Created by Zhushen on 2018/8/20.
 */
public abstract class PersonCloth extends Person {
    protected Person mPerson;

    public PersonCloth(Person mPerson) {
        this.mPerson = mPerson;
    }

    @Override
    public void dressed() {
        mPerson.dressed();
    }
}
