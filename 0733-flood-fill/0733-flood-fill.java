class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] visited = new boolean[image.length][image[0].length];
        dfs(image, sr, sc, color, image[sr][sc], visited);
        return image;
    }

    public void dfs(int[][] image, int sr, int sc, int newColor, int baseColor, boolean[][] visited) { 
        // 1. base condition 
        if(sc < 0 || sc >= image[0].length || sr < 0 || sr >= image.length || image[sr][sc] != baseColor || visited[sr][sc]){ 
            return;
        }
        //mark the node as visited
        visited[sr][sc] = true;
        
        //color curr node as newColor
        image[sr][sc] = newColor;
        //traverse all adj nodes 
        dfs(image, sr + 1, sc, newColor, baseColor, visited);
        dfs(image, sr, sc + 1, newColor, baseColor, visited);
        dfs(image, sr - 1, sc, newColor, baseColor, visited);
        dfs(image, sr , sc - 1, newColor, baseColor, visited);
    }
}