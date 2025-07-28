public int[] fix23(int[] nums) {
    // Check if index 0 is 2 and index 1 is 3
    if (nums[0] == 2 && nums[1] == 3) {
        nums[1] = 0;
    }
    // Check if index 1 is 2 and index 2 is 3
    if (nums[1] == 2 && nums[2] == 3) {
        nums[2] = 0;
    }
    return nums;
}
