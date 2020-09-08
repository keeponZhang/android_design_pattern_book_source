package zhushen.com.shejimoshi.Chapter4.example2;

/**
 * Created by Zhenshen on 2017/3/14.
 * 这样设计不好，可能会导致修改用户数据
 * 我以前的想法是把set方法通过其他方法统一起来
 * 现在看来还是太年轻啊
 * 通过原型模式，深浅拷贝，保护原型就行了
 * 防止外部对某个对象修改
 */

public class LoginImpl implements Login {
    @Override
    public void login() {
        User loginUser = new User();
        loginUser.age = 22;
        loginUser.name = "zhushen";
        loginUser.address = new Address("sahnghai","pudong","zhuqiao");

        LoginSession.getLoginSession().setLoginedUser(loginUser);
    }
}
