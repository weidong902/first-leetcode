//给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。 
//
// 
//
// 说明： 
//
// 
// 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。 
// 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。 
// 
//
// 
//
// 示例： 
//
// 
//输入：
//nums1 = [1,2,3,0,0,0], m = 3
//nums2 = [2,5,6],       n = 3
//
//输出：[1,2,2,3,5,6] 
//
// 
//
// 提示： 
//
// 
// -10^9 <= nums1[i], nums2[i] <= 10^9 
// nums1.length == m + n 
// nums2.length == n 
// 
// Related Topics 数组 双指针 
// 👍 695 👎 0


package leetcode.editor.cn;

//合并两个有序数组

public class P88_MergeSortedArray {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P88_MergeSortedArray().new Solution();
    }

    //力扣代码
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {

            int mindex = m - 1, nindex = n - 1;
            // 合并两个有序数组，从右往左比较两个数组的元素，大的放到nums1数组的尾部，直到其中一个数组遍历完

            for (int mFindex = m + n - 1; mindex >= 0 && nindex >= 0; mFindex--) {
				nums1[mFindex]=nums1[mindex]>nums2[nindex]?nums1[mindex--]:nums2[nindex--];

            }
            // 如果nums1先结束，将nums2中的元素复制到nums1中
			while(nindex>=0){
				nums1[nindex]=nums2[nindex--];
			}

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}