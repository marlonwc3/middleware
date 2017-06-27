package app;

import java.io.IOException;
import java.net.UnknownHostException;

import distribution.QueueManagerProxy;
import distribution.message.Operation;

public class Producer {

	public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException{
		
		QueueManagerProxy proxy1 = new QueueManagerProxy("queue1");
		QueueManagerProxy proxy2 = new QueueManagerProxy("queue2");
		QueueManagerProxy proxy3 = new QueueManagerProxy("queue3");
		
		while(true){
			Thread.sleep(500);
			//Fila 1
			proxy1.send("topic1", "T�pico 1, Fila 1", Operation.PUBLISH);
			proxy1.send("topic2", "T�pico 2, Fila 1", Operation.PUBLISH);
			proxy1.send("topic3", "T�pico 3, Fila 1", Operation.PUBLISH);
			
			//Fila 2
			proxy2.send("topic11", "T�pico 11, Fila 2", Operation.PUBLISH);
			proxy2.send("topic22", "T�pico 22, Fila 2", Operation.PUBLISH);
			
			//Fila 3
			proxy3.send("topic111", "T�pico 111, Fila 3", Operation.PUBLISH);
		}
		
	}
	
}
