package com.wbb.dp.chapter23;

/**
 * @author weibb
 * @date 2019/1/8
 * email: weibb@chingo.cn
 */
public interface Camera {
    public void open();
    public void takePicture();
    public void close();
}

class SamsungCamera implements Camera{

    @Override
    public void open() {
        System.out.println("打开相机");
    }

    @Override
    public void takePicture() {
        System.out.println("拍照");
    }

    @Override
    public void close() {
        System.out.println("关闭相机");
    }
}
