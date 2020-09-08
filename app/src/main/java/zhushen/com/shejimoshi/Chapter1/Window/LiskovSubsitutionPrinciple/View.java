package zhushen.com.shejimoshi.Chapter1.Window.LiskovSubsitutionPrinciple;

public abstract class View{
    public abstract void draw();
    public void measure(int width,int height){
        //测量视图大小
    }
}
