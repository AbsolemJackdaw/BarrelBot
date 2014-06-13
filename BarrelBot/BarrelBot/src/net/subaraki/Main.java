package net.subaraki;

import java.io.IOException;

import net.subaraki.listener.Listener;

import org.pircbotx.Configuration;
import org.pircbotx.PircBotX;
import org.pircbotx.exception.IrcException;

public class Main {

	public static PircBotX bot;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws IOException, IrcException {

		Configuration config = new Configuration.Builder()
		.setName("BarrelBot")
		.setVersion("1.0")
		.setServerHostname("irc.esper.net")
		.setServerPort(6667)
		.setLogin("BarrelBot")
		.addAutoJoinChannel("#Subaraki")
		.addAutoJoinChannel("#SpeakEasy")
		.setNickservPassword("secrets")
		.setAutoNickChange(true)
		.setCapEnabled(true)
		.setMessageDelay(400)
		.addListener(new Listener())
		.buildConfiguration();

		bot = new PircBotX(config);
		bot.startBot();

	}
}
