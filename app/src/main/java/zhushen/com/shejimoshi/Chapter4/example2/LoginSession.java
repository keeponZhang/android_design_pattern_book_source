package zhushen.com.shejimoshi.Chapter4.example2;

/**
 * Created by Zhenshen on 2017/3/14.
 */

public class LoginSession {
    static LoginSession loginSession = null;

    private User loginedUser;
    private UserV2 userV2;
    private LoginSession(){

    }

    public static LoginSession getLoginSession(){
        if(loginSession == null){
            loginSession = new LoginSession();
        }
        return loginSession;
    }

    public UserV2 getUserV2() {
        return userV2.clone();
    }

    public void setUserV2(UserV2 userV2) {
        this.userV2 = userV2;
    }

    public User getLoginedUser() {
        return loginedUser;
    }

    public void setLoginedUser(User loginedUser) {
        this.loginedUser = loginedUser;
    }
}
