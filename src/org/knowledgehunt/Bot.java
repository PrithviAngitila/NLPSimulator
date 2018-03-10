package org.knowledgehunt;

import java.util.ArrayList;
import java.util.List;

import org.knowledgehunt.model.Intent;

public class Bot {
	
	private String botName;
     private List<Intent> intentList;
	public Bot(String botName) {
		super();
		this.botName = botName;
		this.intentList=new ArrayList<Intent>();
	}
	public void addIntent(Intent intent)
	{
		this.intentList.add(intent);
	}
	public List<Intent> getIntentList() {
		return intentList;
	}
	public void setIntentList(List<Intent> intentList) {
		this.intentList = intentList;
	}

}
