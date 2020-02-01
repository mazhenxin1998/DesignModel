package com.mzx.command;

import lombok.AllArgsConstructor;

/**
 * @author ZhenXinMa
 * @date 2020/2/1 15:21
 */
@AllArgsConstructor
public class LightOnCommand implements Command {

    private LightReceiver receiver;

    @Override
    public void execute() {
        receiver.on();
    }

    @Override
    public void undo() {
        receiver.off();
    }
}
