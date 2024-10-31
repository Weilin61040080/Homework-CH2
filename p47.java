import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class p47 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Please enter the score for 5 people");
		Integer [] test = new Integer [5];
		
		for(int i = 0; i < test.length; i++) {
			String str = br.readLine();
			test[i] = Integer.parseInt(str);
		}
		
		Arrays.sort(test,Collections.reverseOrder());
		
		for(int i = 0; i < test.length; i++) {
			System.out.println("The score of "+ (i + 1) +"  is " +test[i] + ".");
		}
	}
}
