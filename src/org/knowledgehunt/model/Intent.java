package org.knowledgehunt.model;

import java.util.ArrayList;
import java.util.List;

public class Intent {
private String intentName;
private List<Utterance> utteranceList;
private List<Slots> slotList;
public String getIntentName() {
	return intentName;
}
public void setIntentName(String intentName) {
	this.intentName = intentName;
}
public List<Utterance> getUtteranceList() {
	return utteranceList;
}
public void setUtteranceList(List<Utterance> utteranceList) {
	this.utteranceList = utteranceList;
}
public List<Slots> getSlotList() {
	return slotList;
}
public void setSlotList(List<Slots> slotList) {
	this.slotList = slotList;
}
public Intent(String intentName) {
	super();
	this.intentName = intentName;
	this.utteranceList=new ArrayList<Utterance>();
	this.slotList=new ArrayList<Slots>();
}
public void addUtterance(Utterance utterance)
{
	this.utteranceList.add(utterance);
}
public void addSlot(Slots slot)
{
	this.slotList.add(slot);
}


}
