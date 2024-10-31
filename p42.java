import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

public class p42 {
	public static void main(String[] args){
		int [] test = {80, 60, 22, 50, 75};
		
		for(int i = 0; i < 5; i++) {
			System.out.println("The score of the "+ (i + 1) +" person  is " +test[i] + ".");
		}
	}
}
