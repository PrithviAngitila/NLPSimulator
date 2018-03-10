package org.knowledgehunt;

import org.knowledgehunt.model.Intent;
import org.knowledgehunt.model.OutputNode;
import org.knowledgehunt.model.Slots;

public class NLPService {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bot bot=new Bot("Custombot");
        
        Intent flowerIntent=new Intent("FlowerIntent");
        Slots flowerType=new Slots("Flower", "Which tye of flower do u want");
        Slots time=new Slots("Timings","When would you like to receive delivery");
        flowerIntent.addSlot(flowerType);
        flowerIntent.addSlot(time);
        bot.addIntent(flowerIntent);
        
        Intent echoIntent=new Intent("EchoIntent");
        Slots echo=new Slots("echo", "I will repeat what u give as input");
        echoIntent.addSlot(echo);
        
        bot.addIntent(echoIntent);
        
        Simulator simulator=new Simulator(bot);
        simulator.simulate();
	}

}
