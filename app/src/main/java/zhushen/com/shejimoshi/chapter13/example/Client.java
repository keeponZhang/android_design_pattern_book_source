package zhushen.com.shejimoshi.chapter13.example;

/**
 * Created by Zhushen on 2018/5/14.
 */
public class Client {
    public static void main(String[] args){
        CallofDuty game = new CallofDuty();
        game.play();

        Caretaker caretaker = new Caretaker();
        caretaker.archive(game.createMemoto());
        game.quit();

        CallofDuty newGame = new CallofDuty();
        newGame.restore(caretaker.getMemoto());
    }
}
