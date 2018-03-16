package assigment2.A2;

import assigment2.A_intro.Reader;
import assigment2.A_intro.Writer;





public class Main {

	public static void main(String args[]){
		Signalled_Queue queue;
		
		queue=new Signalled_Queue();
		
		new Writer(queue);
		new Reader(queue);
	

		
		
		
	}
}
