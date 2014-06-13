package net.subaraki;

import org.pircbotx.hooks.events.MessageEvent;

import net.subaraki.listener.Listener;

@SuppressWarnings("rawtypes")
public class Utils {

	public static String getStrippedCommand(MessageEvent event, String reg){
		String cmdname = Listener.initCommand + reg;
		String s = event.getMessage().replace(cmdname, "");

		return s;
	}

	public static String getUserName(MessageEvent event){
		return event.getUser().getNick();
	}
}
