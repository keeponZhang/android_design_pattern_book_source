package zhushen.com.shejimoshi.Chapter3.Simple;

/**
 * Created by Zhenshen on 2017/3/1.
 */

public abstract class Computer {
    protected String mBoard;
    protected String mDisplay;
    protected String mOS;

    protected Computer() {
    }

    public void setmBoard(String mBoard) {
        this.mBoard = mBoard;
    }

    public void setmDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }

    public void setmOS() {
    }

    @Override
    public String toString() {
        return "Computer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOS='" + mOS + '\'' +
                '}';
    }
}
