class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        // Store the original color of the starting pixel
        int originalColor = image[sr][sc];

        // If the original color is already the new color,
        // no need to do anything.
        if (originalColor == color) {
            return image;
        }

        // Start DFS
        dfs(image, sr, sc, originalColor, color);

        return image;
    }

    public void dfs(int[][] image, int row, int col, int originalColor, int newColor) {

        // Check if row or column is out of bounds
        if (row < 0 || row >= image.length || col < 0 || col >= image[0].length) {
            return;
        }

        // If the current pixel is not the original color,
        // don't continue.
        if (image[row][col] != originalColor) {
            return;
        }

        // Change the color of the current pixel
        image[row][col] = newColor;

        // Visit all 4 neighboring pixels
        dfs(image, row - 1, col, originalColor, newColor); // Up
        dfs(image, row + 1, col, originalColor, newColor); // Down
        dfs(image, row, col - 1, originalColor, newColor); // Left
        dfs(image, row, col + 1, originalColor, newColor); // Right
    }
}