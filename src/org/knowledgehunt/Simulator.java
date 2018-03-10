package org.knowledgehunt;

import java.util.List;

import org.knowledgehunt.model.Intent;
import org.knowledgehunt.model.OutputNode;
import org.knowledgehunt.model.Slots;

public class Simulator {
	
	private NLUService nluService;
	private NLPStack nlpStack;
	private Bot bot;
	public Simulator(Bot bot) {
		super();
		// TODO Auto-generated constructor stub
		this.bot=bot;
		this.nluService=new NLUService(bot);
		this.nlpStack=new NLPStack();
		
	}
 public void executeIntent(Intent intent)
 {
	 executeSlots(intent.getIntentName(),intent.getSlotList());
	 
 }
 public void executeSlots(String intent,List<Slots> slotList){
	 
	 for(Slots slot:slotList)
	 {
		 processSlot(intent,slot);
	 }
	 
 }
 public void processSlot(String intent,Slots slot)
 {
	 String response=OutputNode.getInputFromUser(slot.getPrompt());
	 Intent intentReceived=nluService.getIntent(response);
	 if(intentReceived!=null)
	 {
		 
		 nlpStack.pushToStack(intentReceived);
		 execute();
	 }
	 slot.addSlotValue(response);
	 
 }
	
	public void execute()
	{
		while(!nlpStack.isEmpty())
		{
			Intent intent=nlpStack.popFromStack();
			executeIntent(intent);
			for(Slots slot:intent.getSlotList())
			{
				System.out.println(slot.getSlotName()+":"+slot.getSlotValues());
			}
			
		}
	}
	public void simulate()
	{
		OutputNode.displayToUser("Hello welcome to world of AI");
         String input=OutputNode.getInputFromUser();
         Intent obtainedintent= nluService.getIntent(input);
         if(obtainedintent!=null)
         { 
        	 nlpStack.pushToStack(obtainedintent);     
        	 execute();
         }
         else
         {
        	 OutputNode.displayToUser("No matching intent found");
         }
          
        
	}

}
