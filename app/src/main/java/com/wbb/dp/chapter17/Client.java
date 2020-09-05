package com.wbb.dp.chapter17;

/**
 * @author vico
 * @date 2018-12-02
 */
public class Client {
    public static void main(String[] args) {
        //构造主板对象
        MainBoard mediator =new MainBoard();
        //分别构造各个零部件
        CDDervice cd=new CDDervice(mediator);
        CPU cpu=new CPU(mediator);
        GraphicsCard vc=new GraphicsCard(mediator);
        SoundCard sc=new SoundCard(mediator);

        //将各个零部件安装到主板
        mediator.setCDDervice(cd);
        mediator.setCPU(cpu);
        mediator.setGraphicsCard(vc);
        mediator.setSoundCard(sc);

        //完成后就可以开始播放视频了
        cd.load();
    }
}
