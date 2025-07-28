public int[] makeMiddle(int[] nums) {
    int mid = nums.length / 2;
    // mid is the index just after the middle pair
    return new int[] { nums[mid - 1], nums[mid] };
}
