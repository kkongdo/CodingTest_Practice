import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int[] nums = new int[3];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < nums.length; i++) {
				nums[i] = Integer.parseInt(st.nextToken());
			}
			if(nums[0] == 0 && nums[1] == 0 && nums[2] == 0) {
				break;
			}
			
			Arrays.sort(nums);
			
			if(nums[2] < nums[0] + nums[1]) {
				if(nums[0] == nums[1] && nums[1] == nums[2]) {
					System.out.println("Equilateral");
				}
				else if(nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) {
					System.out.println("Isosceles");
				}
				else {
					System.out.println("Scalene");
				}
			}
			else {
				System.out.println("Invalid");
			}
		}
	}
}