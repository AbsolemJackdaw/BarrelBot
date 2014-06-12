package net.subaraki.listener;

import java.util.LinkedList;

import net.subaraki.commands.CommandAwesome;
import net.subaraki.commands.Commands;

import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.MessageEvent;

@SuppressWarnings("rawtypes")
public class Listener extends ListenerAdapter {

	public final String initCommand = "barrel,";

	public final LinkedList<Commands> commands = new LinkedList<>();

	public Listener() {
		commands.add(new CommandAwesome());

	}

	@SuppressWarnings("unchecked")
	@Override
	public void onMessage(MessageEvent event) throws Exception {
		System.out.println("MESSAGE");

		String cmdName = event.getMessage().split(" ")[0];

		if(event.getMessage().startsWith(initCommand)){
			System.out.println(event.getMessage().startsWith(initCommand));

			for(Commands cmd : commands)
			{
				System.out.println(initCommand + cmd.getAlias());

				if(cmdName.equalsIgnoreCase(initCommand + cmd.getAlias()))
				{
					cmd.exe(event);
					return;
				}
			}
		}

	}

}
