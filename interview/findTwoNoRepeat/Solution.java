package interview.findTwoNoRepeat;

public class Solution {

    public static void main(String[] args) {
        //testing data
        int[] arr = new int[]{1, 2, 33, 4, 4, 1, 3, 3};
        //num1,num2分别为长度为1的数组。传出参数
        //将num1[0],num2[0]设置为返回结果
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        findTwoNoRepeat(arr, num1, num2);
        System.out.println(num1[0] + " " + num2[0]);
    }

    public static void findTwoNoRepeat(int[] array, int[] num1, int[] num2) {
        if (array == null || array.length == 0) return;
        int length = array.length;
        //数组所有值的异或值即出现一次的两个数字的异或值
        int result = 0;
        for (int i = 0; i < length; i++) result = result ^ array[i];
        //根据异或值的中为1的最低位，按m位为1和为0将数组分为两个数组，此时只出现一次的两个数就被分到了不同的组
        int index = findLowOne(result);
        for (int i = 0; i < length; i++) {
            if (isOne(array[i], index)) {
                num1[0] ^= array[i];
            } else {
                num2[0] ^= array[i];
            }
        }
    }

    //找到最低位为1的值
    public static int findLowOne(int n) {
        int index = 0;
        while ((index & 1) == 0) {
            index++;
            n = n >> 1;
        }
        return index;
    }

    //判断数字二进制值的index位置是否为1
    public static boolean isOne(int num, int index) {
        num = num >> index;
        if ((num & 1) == 1) return true;
        return false;
    }


}
