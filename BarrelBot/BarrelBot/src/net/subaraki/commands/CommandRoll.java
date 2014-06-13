package net.subaraki.commands;

import net.subaraki.Utils;

import org.pircbotx.hooks.events.MessageEvent;

@SuppressWarnings("rawtypes")
public class CommandRoll implements Commands<MessageEvent>{

	@Override
	public void exe(MessageEvent event) throws Exception {
		event.getChannel().send().action("rolls");
	}

	@Override
	public void secondairyExe(MessageEvent event) throws Exception {
		String s = Utils.getStrippedCommand(event, " roll");
		event.getChannel().send().action("rolls"+ s);

	}

	@Override
	public String getAlias() {
		return " roll";
	}
	
	
}
