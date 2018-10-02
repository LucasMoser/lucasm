
public class Main {
	
	public static void main(String[] args) {
		
		Queue<Patient> queue = new Queue<Patient>();
		
		
		for(int i = 0; i < 5; i++) {	
			queue.enqueue(new Patient("Patient"+i));
		}
	
		queue.out();
		
	}
	
	

}
