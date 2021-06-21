
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PathsfromSourceToTargetNode {

	public static void main(String[] args) {
		/**
		4
		1 3
		2
		3
		-1
		**/

		 Scanner in = new Scanner(System.in);
		    int t = in.nextInt();
		    String[] s = new String[t];
		    in.nextLine();
		    for (int i = 0; i < t; i++) {
		        s[i] = in.nextLine();
		    }
		    int[][] graph = new int[t][];
		    int count=0;
		    for(int i=0;i<t;i++) {
		    	graph[i]=stringArrayToIntArray(s[i].split(" "));
				
		    }
		   System.out.println(allPathsSourceTarget(graph));
		    
	}
	public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> rst = new LinkedList<>();
        List<Integer> path = new LinkedList<>();
        path.add(0);
        dfs(graph, 0, path, rst);
        return rst;
    }
	 private static void dfs(int[][] graph, int index, List<Integer> path, List<List<Integer>> rst) {
	        if (index == graph.length - 1) {
	            rst.add(new LinkedList<>(path));
	            return;
	        }

	        for (int neigh : graph[index]) {
	            path.add(neigh);
	            dfs(graph, neigh, path, rst);
	            // Backtracking
	            path.remove(path.size() - 1);
	        }
	    }

	private static int[] stringArrayToIntArray(String[] numberStrs) {
		
		int[] numbers = new int[numberStrs.length];
		for(int i = 0;i < numberStrs.length;i++)
		{
		   numbers[i] = Integer.parseInt(numberStrs[i]);
		}
		return numbers;
	}
}
