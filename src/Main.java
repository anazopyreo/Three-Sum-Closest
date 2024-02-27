public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Solution solution = new Solution();
        int[] nums1 = {-1,2,1,-4};
        int target1 = 1;
        int output1 = 2;
        System.out.println(solution.threeSumClosest(nums1, target1) == output1);

        int[] nums2 = {0,0,0};
        int target2 = 1;
        int output2 = 0;
        System.out.println(solution.threeSumClosest(nums2, target2) == output2);

        int[] nums3 = {4,0,5,-5,3,3,0,-4,-5};
        int target3 = -2;
        int output3 = -2;
        System.out.println(solution.threeSumClosest(nums3, target3) == output3);

    }
}