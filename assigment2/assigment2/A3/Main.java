package assigment2.A3;

import assigment2.A_intro.Reader;
import assigment2.A_intro.Writer;



public class Main {

	public static void main(String args[]){
		Signalled_2Readers_Queue queue;
		
		queue=new Signalled_2Readers_Queue();
		
		new Writer(queue);
		new ReaderIdentified(queue,1);
		new ReaderIdentified(queue,0);
	
		
	}
}
