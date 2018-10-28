package ID_905_SortArrayByParity;

public class Solution {
    public int[] sortArrayByParity(int[] A) {
        int n = A.length;
        //特殊值处理，空数组直接返回
        if (n == 0) return A;
        //左右指针交换法，左指针找奇数，又指针找偶数
        int left = 0;
        int right = n - 1;
        while (true) {
            //找奇数
            if (left < right && A[left] % 2 == 0) left++;
            //
            if (left < right && A[right] % 2 != 0) right--;
            if (right == left) break;
            //交换奇数，偶数
            int temp = A[left];
            A[left] = A[right];
            A[right] = temp;
        }
        return A;
    }

}
