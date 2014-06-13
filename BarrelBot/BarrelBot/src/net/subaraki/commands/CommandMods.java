package net.subaraki.commands;

import net.subaraki.Utils;

import org.pircbotx.hooks.events.MessageEvent;

@SuppressWarnings("rawtypes")
public class CommandMods implements Commands<MessageEvent>{

	@Override
	public void exe(MessageEvent event) throws Exception {
	
		event.getChannel().send().message("RpgInventory, Better Breeds(with Chicken), GraveStones,-Die Classy, Toolbelts, TelePads, Noted Items");
		
	}

	@Override
	public String getAlias() {
		return " mods";
	}

	@Override
	public void secondairyExe(MessageEvent event) throws Exception {
		
		String s = Utils.getStrippedCommand(event, " mods ");
		
		switch (s.toLowerCase()) {
		case "rpgi":
			event.getChannel().send().message("https://github.com/ArtixAllMighty/rpginventory");
			break;

		case "rpg inventory":
			event.getChannel().send().message("https://github.com/ArtixAllMighty/rpginventory");
			break;
		
		case "telepads":
			event.getChannel().send().message("https://github.com/ArtixAllMighty/Telepads");
			break;
			
		case "gravestones":
			event.getChannel().send().message("https://github.com/ArtixAllMighty/Gravestones-DieClassy");
			break;
			
		case "noted items":
			event.getChannel().send().message("https://github.com/ArtixAllMighty/Noted-Items");
			break;
			
		case "better breeding":
			event.getChannel().send().message("https://github.com/Chicken9000/betterbreeding");
			break;
		default:
			break;
		}
		
	}

}
