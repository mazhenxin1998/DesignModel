package com.mzx.bridge;

/**
 * @author ZhenXinMa
 * @date 2020/1/27 20:16
 */
public class UpRightPhone extends Phone {

    public UpRightPhone(Brade brade) {
        super(brade);
    }

    @Override
    public void call() {
        System.out.println("旋转手机");
        super.call();
    }

    @Override
    public void open() {
        System.out.println("旋转手机");
        super.open();
    }

    @Override
    public void close() {
        System.out.println("旋转手机");
        super.close();
    }
}
