package com.wbb.dp.chapter23;

/**
 * @author weibb
 * @date 2019/1/8
 * email: weibb@chingo.cn
 */
public interface Phone {
    //打电话
    public void dail();
    //挂断
    public void hangup();
}

class PhoneImpl implements Phone{

    @Override
    public void dail() {
        System.out.println("打电话");
    }

    @Override
    public void hangup() {
        System.out.println("挂断");
    }
}
