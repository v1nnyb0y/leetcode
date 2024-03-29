package com.leetcode.GraphTheory;

class Solution169
{
    public int closedIsland(int[][] grid)
    {
        // O(n * m) time
        // O(n * m) space
        int count = 0;

        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length; j++)
            {
                // trigger DFS once we visit land
                if(grid[i][j] == 0 && isClosed(grid, i, j))
                    count++;
            }
        }
        return count;
    }

    public boolean isClosed(int[][] grid, int i, int j)
    {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length)
            return false;

        if(grid[i][j] == 1)
            return true;

        // once we visited the land, we change it from land -> water
        grid[i][j] = 1;

        boolean up = isClosed(grid, i+1, j);
        boolean down = isClosed(grid, i-1, j);
        boolean left = isClosed(grid, i, j-1);
        boolean right = isClosed(grid, i, j+1);

        return (up && down && left && right);
    }
}