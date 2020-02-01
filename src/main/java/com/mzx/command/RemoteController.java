package com.mzx.command;

/**
 * @author ZhenXinMa
 * @date 2020/2/1 15:24
 */
public class RemoteController {

    private Command onCommands[];
    private Command offCommands[];

    private Command unDoCommand;

    public RemoteController(){
        onCommands = new Command[5];
        offCommands = new Command[5];
        for(int i = 0;i<5;i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand()    ;
        }
    }

    public void setCommand(int number,Command onCommand,Command offCommand){
        onCommands[number] = onCommand;
        offCommands[number] = offCommand;
    }

    public void onButtonWasPushed(int number){
        onCommands[number].execute();
        // 执行撤销操作
        unDoCommand = onCommands[number];
    }

    public void offButtonWasPushed(int number){
        offCommands[number].execute();
        unDoCommand = offCommands[number];
    }

    public void unDoButtonWasPushed(){
        unDoCommand.undo();
    }

}
