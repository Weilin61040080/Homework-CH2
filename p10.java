import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10 {
	public static void main(String[] args) throws IOException {
        System.out.println("input");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		if (num == 1) {
			System.out.println("input is 1");
		}
		else {
		    System.out.println("no 1");
		}
	}
}
