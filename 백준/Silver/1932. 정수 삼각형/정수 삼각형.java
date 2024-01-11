import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] nums;
	static Integer[][] dp;
	static int N;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		nums = new int[N][N];
		dp = new Integer[N][N];
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < i + 1; j++) {
				nums[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i = 0; i < N; i++) {
			dp[N - 1][i] = nums[N - 1][i];
		}
		System.out.println( find(0,0) );
	}
	private static int find(int depth, int index) {
		if(depth == N - 1)
			return dp[depth][index];
		if(dp[depth][index] == null)
			dp[depth][index] = Math.max(find(depth + 1, index), find(depth + 1, index + 1)) + nums[depth][index];
		
		return dp[depth][index];
	}
}
