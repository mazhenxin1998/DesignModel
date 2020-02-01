package com.mzx.command;

/**
 * @author ZhenXinMa
 * @date 2020/2/1 15:32
 */
public class Client {
    public static void main(String[] args) {

        LightReceiver receiver = new LightReceiver();

        Command onCommand = new LightOnCommand(receiver);
        Command offCommand = new LightOffCommand(receiver);

        RemoteController controller = new RemoteController();
        controller.setCommand(0,onCommand,offCommand);

        System.out.println("按下第0组的开按钮");
        controller.onButtonWasPushed(0);
        System.out.println("按下第0组的关按钮");
        controller.offButtonWasPushed(0);
        System.out.println("执行撤销操作");
        controller.unDoButtonWasPushed();
    }
}
