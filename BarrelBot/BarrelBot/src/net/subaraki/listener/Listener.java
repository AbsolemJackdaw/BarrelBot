package net.subaraki.listener;

import java.util.LinkedList;

import net.subaraki.commands.CommandAwesome;
import net.subaraki.commands.CommandCompliment;
import net.subaraki.commands.CommandGit;
import net.subaraki.commands.CommandMods;
import net.subaraki.commands.CommandRoll;
import net.subaraki.commands.Commands;

import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.MessageEvent;

@SuppressWarnings("rawtypes")
public class Listener extends ListenerAdapter {

	public static final String initCommand = "barrel,";

	public final LinkedList<Commands> commands = new LinkedList<>();

	public Listener() {
		commands.add(new CommandAwesome());
		commands.add(new CommandGit());
		commands.add(new CommandMods());
		commands.add(new CommandCompliment());
		commands.add(new CommandRoll());
	}

	@SuppressWarnings("unchecked")
	@Override
	public void onMessage(MessageEvent event) throws Exception {

		String cmdName = event.getMessage();
		
		if(event.getMessage().startsWith(initCommand)){

			for(Commands cmd : commands)
			{
				if(cmdName.equalsIgnoreCase(initCommand + cmd.getAlias()))
				{
					cmd.exe(event);
					return;
				}else{
					if(cmdName.contains(initCommand + cmd.getAlias())){
						cmd.secondairyExe(event);
						return;
					}
				}
			}
		}

	}

}
