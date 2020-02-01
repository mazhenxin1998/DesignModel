package com.mzx.command;

/**
 * @author ZhenXinMa
 * @date 2020/2/1 15:19
 *
 *       命令模式   该接口是命令的一个集合
 */
public interface Command {

    void execute();

    void undo();

}
