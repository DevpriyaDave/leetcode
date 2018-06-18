package Math;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by devpriyadave on 4/14/18.
 */
public class ConstructRectangle {
    public int[] constructRectangle(int area) {
        List<Integer> gcds = new ArrayList<Integer>();
        Integer total = area;
        while(area!=1) {
            if(area%2==0) {
                gcds.add(2);
                area = area/2;
            } else if(area%3==0) {
                gcds.add(3);
                area = area/3;
            } else if(area%5==0) {
                gcds.add(5);
                area = area/5;
            }else if(area%7==0) {
                gcds.add(7);
                area = area/7;
            } else {
                gcds.add(area);
                area = area/area;
            }
        }
        int[] ans = new int[2];
        ans[0] = gcds.get(0);
        ans[1] =  total/ans[0];
        int diff = ans[1] - ans[0];
        while(true) {
            int k = 0;
            int j = 0;
            for(int i=1; i < gcds.size(); i++) {
                int temp2 = ans[1]/gcds.get(i);
                int temp1 = ans[0] * gcds.get(i);
                if(temp2 - temp1 < diff) {
                    k = i;
                }
            }
            ans[1] = ans[1]/gcds.get(k);
            ans[0] *= gcds.get(k);
            gcds.remove(k);
            if(gcds.size()==0) {
                return ans;
            }
        }

    }
}
