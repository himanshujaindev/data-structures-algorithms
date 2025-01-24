
import java.util.LinkedList;
import java.util.Queue;

class Solution {

    /*
    BFS - Queue
    o(m*n); o(m*n)
     */
    public int orangesRotting(int[][] grid) {

        // create visited; initialze queue with all rotten oranges
        int m = grid.length;
        int n = grid[0].length;
        int[] row = new int[]{0, 0, 1, -1};
        int[] col = new int[]{1, -1, 0, 0};
        int[][] visited = new int[m][n];
        Queue<int[]> queue = new LinkedList<>();
        int freshOranges = 0;
        int timeRotAllOranges = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j, 0});
                    visited[i][j] = 2;
                }

                if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }

        int currentFreshOranges = 0;
        while (!queue.isEmpty()) {
            int[] oranges = queue.poll();
            int r = oranges[0];
            int c = oranges[1];
            int t = oranges[2];

            timeRotAllOranges = Math.max(timeRotAllOranges, t);

            for (int i = 0; i < 4; i++) {
                int newRow = r + row[i];
                int newCol = c + col[i];

                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && grid[newRow][newCol] == 1 && visited[newRow][newCol] != 2) {
                    visited[newRow][newCol] = 2;
                    currentFreshOranges++;
                    // System.out.println(newRow + " " + newCol + " " + (t + 1));
                    queue.add(new int[]{newRow, newCol, t + 1});
                }
            }
        }

        return freshOranges == currentFreshOranges ? timeRotAllOranges : -1;
    }
}

public class leetcode {

    public static void main(String[] args) {
        Solution sc = new Solution();
        System.out.println(sc.orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}}));
    }
}
