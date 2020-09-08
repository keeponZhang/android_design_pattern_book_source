package zhushen.com.shejimoshi.Chapter3.Simple;

/**
 * Created by Zhenshen on 2017/3/1.
 */

public class MacbookBuilder extends Builder {
    private Computer mComputer = new Macbook();

    @Override
    public void buildBoard(String board) {
        mComputer.setmBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        mComputer.setmDisplay(display);
    }

    @Override
    public void buildOS() {

    }
//
//    @Override
//    public void buildOS(String OS) {
//        mComputer.setmOS(OS);
//    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
