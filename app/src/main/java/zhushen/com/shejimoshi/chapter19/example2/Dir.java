package zhushen.com.shejimoshi.chapter19.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/6/1.
 */
public abstract class Dir {
    protected List<Dir> dirs = new ArrayList<>();
    private String name;

    public Dir(String name) {
        this.name = name;
    }

    public abstract void addDir(Dir dir);

    public abstract  void removeDir(Dir dir);

    public abstract void clear();

    public abstract void print();

    public List<Dir> getFiles() {
        return dirs;
    }

    public String getName() {
        return name;
    }
}
