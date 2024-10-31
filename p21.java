import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p21 {
	public static void main(String[] args) throws IOException {
        System.out.println("Which way do you want to choose?");
		System.out.println("only input integer");

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		char ans = (res == 1) ? 'A':'B';
		
		System.out.println("choose  " + ans + "  way");
	}
}
