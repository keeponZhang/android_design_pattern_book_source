package com.wbb.dp.chapter18;

/**
 * @author vico
 * @date 2018-12-03
 */
public class Lawyer implements ILawsuit {

    private ILawsuit mLawsuit;//持有一个具体被代理者的引用

    public Lawyer(ILawsuit lawsuit) {
        mLawsuit = lawsuit;
    }

    @Override
    public void submit() {
        mLawsuit.submit();
    }

    @Override
    public void burden() {
        mLawsuit.burden();
    }

    @Override
    public void defend() {
        mLawsuit.defend();
    }

    @Override
    public void finish() {
        mLawsuit.finish();
    }
}
