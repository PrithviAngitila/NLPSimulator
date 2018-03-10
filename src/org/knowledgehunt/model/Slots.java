package org.knowledgehunt.model;

import java.util.ArrayList;
import java.util.List;

public class Slots {
	
	private String slotName;
	public Slots(String slotName, String prompt) {
		super();
		this.slotName = slotName;
		this.prompt = prompt;
		this.slotValues = new ArrayList<String>();
	}
	private String prompt;
	private List<String> slotValues;
	public String getSlotName() {
		return slotName;
	}
	public void setSlotName(String slotName) {
		this.slotName = slotName;
	}
	public String getPrompt() {
		return prompt;
	}
	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}
	public List<String> getSlotValues() {
		return slotValues;
	}
	public void addSlotValue(String slotValue) {
		this.slotValues.add(slotValue);
	}
	
	

}
