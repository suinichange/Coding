package SwordForOffer.findNumbersWithSum;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        if (array == null || array.length == 0) return null;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int head = 0;
        int tail = array.length - 1;
        /*
        头尾夹逼,两个数离的越远，乘积越小。
        证明：若b>a,且存在a + b = s;则(a - m ) + (b + m) = s
        a*b=(a-m)*(b+m)=ab-bm+am-m^2=ab-(b-a)m-m^2
        */
        while (head < tail) {
            if (array[head] + array[tail] > sum) {
                tail--;
            } else if (array[head] + array[tail] < sum) {
                head++;
            } else {
                arrayList.add(array[head]);
                arrayList.add(array[tail]);
                return arrayList;
            }
        }
        return arrayList;
    }
}
