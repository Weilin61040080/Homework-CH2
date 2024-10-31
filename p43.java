import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

public class p43 {
	public static void main(String[] args){
		int [] test = {80, 60, 22, 50, 75};
		
		for(int i = 0; i < test.length; i++) {
			System.out.println("The score of the "+ (i + 1) +" person  is " +test[i] + ".");
		}
		System.out.println("The number of exam is:" + test.length + " .");
	}
}
