package interview.findOneNoRepeat;

public class Solution {


    public static void main(String[] args) {
        //testing data
        int[] arr = new int[]{1, 2, 3, 4, 4, 32, 1, 2, 3};
        int result = findOneNoRepeat(arr);
        System.out.print(result);
    }

    //运用异或的性质，两个相同数字异或为0，一个数和0异或还是它本身。
    public static int findOneNoRepeat(int[] arr) {
        if (arr == null || arr.length == 0) return -1;
        int result = 0;
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            result = result ^ arr[i];
        }
        return result;
    }

}
