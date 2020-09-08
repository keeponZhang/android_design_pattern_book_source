package zhushen.com.shejimoshi.chapter19.example2;

/**
 * Created by Zhushen on 2018/6/1.
 */
public class Client {
    public static void main(String[] args){
        Dir diskC = new Folder("C");

        diskC.addDir(new File("ImbaMallLog.txt"));

        Dir dirWin = new Folder("Windows");
        dirWin.addDir(new File("explorer.exe"));
        diskC.addDir(dirWin);

        Dir dirPer = new Folder("PerfLogs");
        dirPer.addDir(new File("null.txt"));
        diskC.addDir(dirPer);

        Dir dirPro = new Folder("Program File");
        dirPro.addDir(new File("ftp.txt"));
        diskC.addDir(dirPro);

        diskC.print();
    }
}
