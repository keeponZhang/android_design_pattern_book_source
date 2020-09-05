package com.wbb.dp.chapter19.demo;

import java.util.Iterator;
import java.util.List;

/**
 * @author vico
 * @date 2018-12-31
 */
public class Floder extends Dir {

    public Floder(String name) {
        super(name);
    }

    @Override
    public void addDir(Dir dir) {
        dirs.add(dir);
    }

    @Override
    public void rmDir(Dir dir) {
        dirs.remove(dir);
    }

    @Override
    public void clear() {
        dirs.clear();
    }

    @Override
    public void print() {
        System.out.println(getName()+"(");
        Iterator<Dir> iter=dirs.iterator();
        while (iter.hasNext()){
            Dir dir=iter.next();
            dir.print();
            if (iter.hasNext()){
                System.out.print(", ");
            }
        }
        System.out.print(")");
    }

    @Override
    public List<Dir> getFiles() {
        return dirs;
    }
}
