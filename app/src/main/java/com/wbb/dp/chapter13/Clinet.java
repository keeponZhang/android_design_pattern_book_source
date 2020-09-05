package com.wbb.dp.chapter13;

/**
 * @author vico
 * @date 2018-11-20
 */
public class Clinet {
    public static void main(String[] args) {
        //构建游戏对象
        CallOfDuty game=new CallOfDuty();
        //1.打游戏
        game.play();

        Caretaker caretaker=new Caretaker();
        //2.游戏存档
        caretaker.archive(game.createMemoto());
        //3.退出游戏
        game.quit();
        //4.恢复游戏
        CallOfDuty newGame=new CallOfDuty();
        newGame.restore(caretaker.getMemoto());
    }
}
