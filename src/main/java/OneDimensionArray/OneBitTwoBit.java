package OneDimensionArray;

/**
 * Created by devpriyadave on 4/8/18.
 */
public class OneBitTwoBit {

    public boolean isOneBitCharacter(int[] bits) {

        int ones = 1;
        if(bits.length == 1 || (bits.length >1 && bits[bits.length - 2] == 0)) {
            return true;
        }
        for(int i = bits.length - 3; i>=0; i--) {
            if(bits[i]==0) {
                if(ones%2!= 0) {
                    return false;
                } else {
                    return true;
                }

            } else {
                ones++;
            }
        }
        return ones%2!=0? false : true;
    }

    public static void main(String[] args) {
        OneBitTwoBit oneBitTwoBit= new OneBitTwoBit();
        boolean ans = oneBitTwoBit.isOneBitCharacter(new int[]{1,0,1,1,0});
        System.out.println(ans);
    }

}
