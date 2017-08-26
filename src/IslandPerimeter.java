public class IslandPerimeter {


    public int islandPerimeter(int[][] grid) {
        int islands = 0;
        int neighbours = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    islands++;
                    if (i + 1 < grid.length && grid[i + 1][j] == 1) {//判断下面是否island
                        neighbours++;
                    }
                    if (j + 1 < grid[i].length && grid[i][j + 1] == 1) {//判断右边是否island
                        neighbours++;
                    }
                }
            }
        }
        return islands * 4 - neighbours * 2;
    }

}
