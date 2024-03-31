import java.time.Duration;
import java.time.Instant;
public class classwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Instant start = Instant.now();
 System.out.println("Start");
// -----------------[ IGNORE ABOVE ]----------------------    


// Create an empty string. 
StringBuilder dot = new StringBuilder();
int iteration = 0;
// Write a loop that will run 10000 times.
while(iteration != 500000) {
	//dot +=".";
	dot.append(".");
	if (iteration % 100 == 0) {
		//dot += "\r\n";
		dot.append("\r\n");
	}
	iteration++;
}
// Each time through, append a "." to the end of the string.
// Every 100 times, append a line feed (\r\n) to the string
// so that our display scrolls down when we output it.
//System.out.println(dot);	
System.out.println(dot.toString());
// After creating your string, output the value to the screen.

// Make note of how long it takes to run.
// Modify the loop so that it will run 100000 times.
// How long did it take to run this time? Why?
			
// -----------------[ IGNORE BELOW ]----------------------    
 Instant finish = Instant.now();
 System.out.printf("Elapsed: %1.3f seconds\r\n", 
 Duration.between(start, finish).toMillis() / 1000f);
System.out.println("Complete");
		  }
		
		
	}


