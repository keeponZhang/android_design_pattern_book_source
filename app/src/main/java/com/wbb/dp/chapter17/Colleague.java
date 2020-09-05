package com.wbb.dp.chapter17;

/**
 * 抽象同事
 *
 * @author vico
 * @date 2018-12-02
 */
public abstract class Colleague {
    protected Mediator mediator;//每一个同事都该知道其中介者

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
