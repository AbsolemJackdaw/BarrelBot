package net.subaraki.commands;

import org.pircbotx.hooks.events.MessageEvent;

@SuppressWarnings("rawtypes")
public class CommandAwesome implements Commands<MessageEvent> {

	@Override
	public void exe(MessageEvent event) throws Exception {
		String s = "You are ! :D";
		
		event.getUser().send().message(s);
		event.getChannel().send().message(s);
		System.out.println("passed");
	}

	@Override
	public String getAlias() {
		
		return " who's awesome?";
	}

}
