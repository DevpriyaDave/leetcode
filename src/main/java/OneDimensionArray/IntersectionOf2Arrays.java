package OneDimensionArray;

import java.util.*;

/**
 * Created by devpriyadave on 4/11/18.
 */
public class IntersectionOf2Arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
            return new int[]{};
        }
        List<Integer> soltuion = new ArrayList<Integer>();
        List<Integer> set = new ArrayList<Integer>();
        if(nums1.length > nums2.length) {
            for(int i : nums1) {
                set.add(new Integer(i));
            }

            for(int i : nums2) {
                Integer temp = new Integer(i);
                if(set.contains(temp)) {
                    soltuion.add(temp);
                    set.remove(temp);
                }
            }
        } else {
            for(int i : nums2) {
                set.add(new Integer(i));
            }
            for(int i : nums1) {
                Integer temp = new Integer(i);
                if(set.contains(temp)) {
                    soltuion.add(temp);
                    set.remove(temp);
                }
            }
        }
        int[] ans = new int[soltuion.size()];
        int k = 0;
        for(Integer i : soltuion) {
            ans[k] = i.intValue();
            k++;
        }
        return ans;

    }

    public int[] intersection2(int[] nums1, int[] nums2) {
        int ans[];
        List<Integer> arr = new ArrayList<Integer>();
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
            return new int[]{};
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        if (nums1.length >= nums2.length) {
            ans = new int[nums2.length];
            int k = 0;
            for (int i : nums1) {
                Integer o = new Integer(i);
                map.put(o, 0);
            }

            for (int i : nums2) {
                Integer o = new Integer(i);
                if (map.containsKey(o)) {
                    arr.add(o);
                    map.remove(o);
                    k++;
                }

            }
        } else {
            ans = new int[nums1.length];
            int k = 0;
            for (int i : nums2) {
                Integer o = new Integer(i);
                map.put(o, 0);
            }
            for (int i : nums1) {
                Integer o = new Integer(i);
                if (map.containsKey(o)) {
                    arr.add(o);
                    map.remove(o);
                    k++;
                }

            }
        }
        int k = 0;
        ans = new int[arr.size()];
        for(Integer o : arr) {
            ans[k++] = o.intValue();
        }
        return ans;
    }

}
