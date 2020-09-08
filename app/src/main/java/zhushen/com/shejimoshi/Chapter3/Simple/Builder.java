package zhushen.com.shejimoshi.Chapter3.Simple;

/**
 * Created by Zhenshen on 2017/3/1.
 */

public abstract class Builder {
    public abstract void buildBoard(String board);

    public abstract void buildDisplay(String display);

    public abstract void buildOS();

    public abstract Computer create();
}
