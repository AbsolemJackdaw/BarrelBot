package net.subaraki.commands;

import org.pircbotx.hooks.events.MessageEvent;

@SuppressWarnings("rawtypes")
public class CommandGit implements Commands<MessageEvent>{

	@Override
	public void exe(MessageEvent event) throws Exception {
		event.getChannel().send().message(event.getUser().getNick() + ": " + "https://github.com/ArtixAllMighty");
	}
	
	@Override
	public void secondairyExe(MessageEvent event) throws Exception {
	}

	@Override
	public String getAlias() {
		return " git";
	}

}
