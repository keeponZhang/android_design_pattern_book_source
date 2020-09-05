package com.wbb.dp.chapter17;

/**
 * @author vico
 * @date 2018-12-02
 */
public class SoundCard extends Colleague {

    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 播放音频
     * @param data 音频数据
     */
    public void soundPlay(String data){
        System.out.println("音频："+data);
    }
}
