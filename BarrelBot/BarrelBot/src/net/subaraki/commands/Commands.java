package net.subaraki.commands;

import org.pircbotx.hooks.events.MessageEvent;

@SuppressWarnings("rawtypes")
public interface Commands <E extends MessageEvent>{

	public void exe(E event) throws Exception;
	
	public void secondairyExe(E event) throws Exception;
	
	public String getAlias();
}
