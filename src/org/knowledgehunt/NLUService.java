package org.knowledgehunt;

import java.util.HashMap;
import java.util.Map;

import org.knowledgehunt.model.Intent;

public class NLUService {
	
	private Map<String,String> map;
	private Bot bot;
	public NLUService(Bot bot) {
		super();
		this.bot=bot;
		// TODO Auto-generated constructor stub
		map=new HashMap<String,String>();
		map.put("order Flowers", "FlowerIntent");
		map.put("orderflowers", "FlowerIntent");
		map.put("i would like order flowers","FlowerIntent");
		map.put("echo me", "EchoIntent");
		map.put("simulate me", "EchoIntent");
	}

	public Intent getIntent(String utterance)
	{
		
				for(Intent intent:this.bot.getIntentList())
				{
					if(intent.getIntentName().equalsIgnoreCase(map.get(utterance)))
					{
						return intent;
					}
				}
				return null;
				
	}

}
