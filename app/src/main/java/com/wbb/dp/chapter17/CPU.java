package com.wbb.dp.chapter17;

/**
 * @author vico
 * @date 2018-12-02
 */
public class CPU extends Colleague {

    private String dataVideo, dataSound; //视频和音频数据


    public CPU(Mediator mediator) {
        super(mediator);
    }

    /**
     * 获取视频数据
     *
     * @return 视频数据
     */
    public String getDataVideo() {
        return dataVideo;
    }

    /**
     * 获取音频数据
     * @return 音频数据
     */
    public String getDataSound(){
        return dataSound;
    }

    /**
     * 解码数据
     * @param data 音视频数据
     */
    public void decodeData(String data){
        //分割音、视频数据
        String[] tmp=data.split(",");

        //解析音视频数据
        dataVideo=tmp[0];

        dataSound=tmp[1];

        //告诉中介者自身状态改变
        mediator.changed(this);
    }
}
