public int[] midThree(int[] nums) {
    int mid = nums.length / 2;  // middle index
    return new int[] { nums[mid - 1], nums[mid], nums[mid + 1] };
}
