package com.mzx.command;

import lombok.AllArgsConstructor;

/**
 * @author ZhenXinMa
 * @date 2020/2/1 15:23
 */
@AllArgsConstructor
public class LightOffCommand implements Command {

    private LightReceiver receiver;

    @Override
    public void execute() {
        receiver.off();
    }

    @Override
    public void undo() {
        receiver.on();
    }
}
