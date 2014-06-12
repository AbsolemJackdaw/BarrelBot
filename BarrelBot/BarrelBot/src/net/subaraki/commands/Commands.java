package net.subaraki.commands;

import org.pircbotx.hooks.events.MessageEvent;

@SuppressWarnings("rawtypes")
public interface Commands <E extends MessageEvent>{

	public void exe(MessageEvent event) throws Exception;
	public String getAlias();
}
