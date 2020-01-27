package com.mzx.bridge;

/**
 * @author ZhenXinMa
 * @date 2020/1/27 20:17
 */
public class Client {
    public static void main(String[] args) {

        Phone p1 = new FolderPhone(new HuaWei());
        p1.open();
        p1.call();
        p1.close();

        Phone p2 = new UpRightPhone(new XiaoMi());
        p2.open();
        p2.call();
        p2.close();

    }
}
