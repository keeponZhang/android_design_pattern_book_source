package com.wbb.dp.chapter17;

/**
 * 主板中介者
 * @author vico
 * @date 2018-12-02
 */
public class MainBoard extends Mediator {

    private CDDervice cdDervice;//光驱设备
    private CPU cpu;//CPU
    private SoundCard soundCard;//声卡设备
    private GraphicsCard graphicsCard;//显卡设备

    @Override
    public void changed(Colleague c) {
        //如果是光驱读取了数据
        if (c==cdDervice){
            handleCD((CDDervice) c);
        }
        //如果CPU处理完数据
        else if (c==cpu){
            handleCPU((CPU) c);
        }
    }

    /**
     * 处理光驱读取数据后与其他设备的交互
     * @param cdDervice 光驱设备
     */
    private void handleCD(CDDervice cdDervice){
        cpu.decodeData(cdDervice.read());
    }

    /**
     * 处理CPU读取数据后与其他设备的交互
     * @param cpu CPU
     */
    private void handleCPU(CPU cpu){
        soundCard.soundPlay(cpu.getDataSound());
        graphicsCard.videoPlay(cpu.getDataVideo());
    }

    /**
     * 设置CD设备
     * @param cdDervice CD设备
     */
    public void setCDDervice(CDDervice cdDervice){
        this.cdDervice=cdDervice;
    }

    /**
     * 设置CPU
     * @param cpu CPU
     */
    public void setCPU(CPU cpu){
        this.cpu=cpu;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }
}
