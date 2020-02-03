package com.mzx.mediator;

/**
 *  同事的具体实现类 闹钟
 */
public class Alarm extends Colleague {

	public Alarm(Mediator mediator, String name) {
		super(mediator, name);
		mediator.Register(name, this);
	}

	public void SendAlarm(int stateChange) {
		SendMessage(stateChange);
	}

	@Override
	public void SendMessage(int stateChange) {
		// TODO Auto-generated method stub
		this.GetMediator().GetMessage(stateChange, this.name);
	}

}
