package tp2.java;

public class PlusGrandRectangleUn {
    public static int[] trouver(int[][] mat) {
        if (mat == null || mat.length == 0) return null;
        int n = mat.length;
        int m = mat[0].length;
        int[] h = new int[m];
        int bestArea = 0;
        int[] bestCoords = null;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) h[c] = (mat[r][c] == 1) ? h[c] + 1 : 0;
            java.util.Deque<Integer> st = new java.util.ArrayDeque<>();
            for (int i = 0; i <= m; i++) {
                int curH = (i == m) ? 0 : h[i];
                while (!st.isEmpty() && curH < h[st.peek()]) {
                    int height = h[st.pop()];
                    int left = st.isEmpty() ? 0 : st.peek() + 1;
                    int right = i - 1;
                    int area = height * (right - left + 1);
                    if (area > bestArea) {
                        bestArea = area;
                        int top = r - height + 1;
                        int bottom = r;
                        bestCoords = new int[]{top, left, bottom, right};
                    }
                }
                st.push(i);
            }
        }
        return bestCoords;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1,0,1,1,1},
            {1,0,1,1,0},
            {1,1,1,1,0},
            {1,0,0,1,1}
        };
        int[] coords = trouver(mat);
        if (coords == null) {
            System.out.println("Aucun");
        } else {
            System.out.println(coords[0] + " " + coords[1] + " " + coords[2] + " " + coords[3]);
        }
    }
}
