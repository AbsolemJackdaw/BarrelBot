package net.subaraki.commands;

import java.util.Random;

import net.subaraki.Utils;

import org.pircbotx.hooks.events.MessageEvent;

@SuppressWarnings("rawtypes")
public class CommandCompliment implements Commands<MessageEvent>{

	String[] compliments1 = new String[]{"beautiful","nice","sweet","pretty","soft"};
	String[] compliments2 = new String[]{"hair","legs","eyes","jugs","smile","personality","stuff"};

	String[] compliments = new String[]{"you look pretty today.", "do I smell new perfume ?","did your cuteness factor raise over the night?"
			, "I love how you always smile at me.","tell another joke! They're always so funny !","You are like a spring flower; beautiful and vivacious.",
			"I like your Facebook status.","You have a good taste in websites.","Your mouse told me that you have very soft hands.","I appreciate you more than Santa appreciates chimney grease."
			,"I wish I was your mirror.","Have you been working out?","You are so charming.","Your smile is breath taking.","You make my data circuits skip a beat.",
			"I feel the need to impress you."};

	@Override
	public void exe(MessageEvent event) throws Exception {
		String name = event.getUser().getNick();

		String s = getCompliment(name);

		event.getChannel().send().message(s);

	}

	@Override
	public void secondairyExe(MessageEvent event) throws Exception {

		String s = Utils.getStrippedCommand(event, " compliment ");
		String name = Utils.getUserName(event);

		int rand = new Random().nextInt(event.getChannel().getUsers().size()-1);

		if(s.equalsIgnoreCase("someone")){
			name = event.getChannel().getUsers().asList().get(rand).getNick();
		}else{
			name = s;
		}

		String text = getCompliment(name);

		event.getChannel().send().message(text);
	}

	@Override
	public String getAlias() {
		return " compliment";
	}

	private String getCompliment(String name){

		int rand = new Random().nextInt(2);

		int r1 = new Random().nextInt(compliments1.length);
		int r2 = new Random().nextInt(compliments2.length);

		String compl1 = compliments1[r1];
		String compl2 = compliments2[r2];

		String fullText = name + ", you have "+ compl1 + " "+ compl2;
		
		if(rand == 0){
			fullText = name + ", "+ compliments[new Random().nextInt(compliments.length)];
		}

		return fullText;
	}

}
