package com.wbb.dp.chapter18;

/**
 * 诉讼接口类
 * @author vico
 * @date 2018-12-03
 */
public interface ILawsuit {
    //提交申请
    void submit();

    //进行举证
    void burden();

    //开始辩护
    void defend();

    //诉讼完成
    void finish();
}
