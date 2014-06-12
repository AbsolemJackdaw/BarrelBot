package net.subaraki.commands;

import org.pircbotx.hooks.Event;
import org.pircbotx.hooks.events.MessageEvent;

@SuppressWarnings("rawtypes")
public interface Commands <E extends Event>{

	public void exe(MessageEvent event) throws Exception;
	public String getAlias();
}
