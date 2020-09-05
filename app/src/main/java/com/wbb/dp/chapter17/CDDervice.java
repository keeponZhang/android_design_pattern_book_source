package com.wbb.dp.chapter17;

/**
 * @author vico
 * @date 2018-12-02
 */
public class CDDervice extends Colleague {

    private String data;//视频数据

    public CDDervice(Mediator mediator) {
        super(mediator);
    }

    /**
     * 读取视频数据
     * @return 视频数据
     */
    public String read(){
        return data;
    }

    /**
     * 加载视频数据
     */
    public void load(){
        //实际情况中视频数据与音频数据都在一个数据流中
        data="视频数据，音频数据";

        //通知中介者 也就是主板数据改变
        mediator.changed(this);
    }
}
