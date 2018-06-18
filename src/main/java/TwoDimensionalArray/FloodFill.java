package TwoDimensionalArray;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by devpriyadave on 4/18/18.
 */
public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        Queue<Index> queue = new LinkedList<Index>();
        int oldColor = image[sr][sc];
        image[sr][sc] = newColor;
        queue.add(new Index(sr,sc));
        while(queue.size()!=0) {
            Index in = queue.poll();
            int r = in.r;
            int c = in.c;
            if(r+1 < image.length && image[r+1][c] == oldColor)  {
                image[r+1][c] = newColor;
                queue.add(new Index(r+1,c));
            }
            if(r-1 < image.length && image[r-1][c] == oldColor) {
                image[r-1][c] = newColor;
                queue.add(new Index(r-1,c));
            }
            if(c-1 < image[0].length && image[r][c-1] == oldColor) {
                image[r][c-1] = newColor;
                queue.add(new Index(r,c-1));
            }
            if(c+1 < image[0].length && image[r][c+1] == oldColor) {
                image[r][c-1] = newColor;
                queue.add(new Index(r,c+1));
            }
        }

        return image;

    }


    class Index {
        int r;
        int c;
        Index(int row, int col) {
            r = row;
            c = col;
        }
    }
}
