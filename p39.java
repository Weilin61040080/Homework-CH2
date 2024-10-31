import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p39 {
	public static void main(String[] args){
		int [] test = new int [5];
		
		test[0] = 80;
		test[1] = 60;
		test[2] = 22;
		test[3] = 50;
		test[4] = 75;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("The score of the "+ (i + 1) +" person  is " +test[i] + ".");
		}
	}
}
