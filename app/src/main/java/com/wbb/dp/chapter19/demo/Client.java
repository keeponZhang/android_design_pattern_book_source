package com.wbb.dp.chapter19.demo;

/**
 * @author vico
 * @date 2018-12-31
 */
public class Client {
    public static void main(String[] args) {
        //构造一个目录对象表示C盘根目录
        Dir diskC=new Floder("C");

        //C盘根目录下有一个文件ImbaMallLog。txt
        diskC.addDir(new File("ImbaMallLog.txt"));

        //C盘根目录下还有3个子目录Windows、PerfLogs、Program File
        Dir dirWin=new Floder("Windows");

        //Windows目录下有文件explorer.exe
        dirWin.addDir(new File("explorer.exe"));
        diskC.addDir(dirWin);

        //PerfLogs目录
        Dir dirPer=new Floder("PerfLogs");

        //PerfLogs目录下有文件null.txt
        dirPer.addDir(new File("null.txt"));
        diskC.addDir(dirPer);

        //Program File目录
        Dir dirPro=new Floder("Program File");

        //Program File 目录下有文件按ftp.txt
        dirPro.addDir(new File("ftp.txt"));
        diskC.addDir(dirPro);

        //打印出文件结构
        diskC.print();
    }
}
