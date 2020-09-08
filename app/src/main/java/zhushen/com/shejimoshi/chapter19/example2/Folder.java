package zhushen.com.shejimoshi.chapter19.example2;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Zhushen on 2018/6/1.
 */
public class Folder extends Dir {

    public Folder(String name) {
        super(name);
    }

    @Override
    public void addDir(Dir dir) {
        dirs.add(dir);
    }

    @Override
    public void removeDir(Dir dir) {
        dirs.remove(dir);
    }

    @Override
    public void clear() {
        dirs.clear();
    }

    @Override
    public void print() {
        System.out.println(getName() + "(");
        Iterator<Dir> iterator = dirs.iterator();
        while (iterator.hasNext()){
            Dir dir = iterator.next();
            dir.print();
            if(iterator.hasNext()){
                System.out.print(",\n");
            }
        }
        System.out.print(")");
    }

    @Override
    public List<Dir> getFiles() {
        return dirs;
    }
}
