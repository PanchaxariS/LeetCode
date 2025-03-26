var rotate = function(nums, k) {
    let temp = new Array(nums.length);
    k = k % nums.length; // Handle cases where k > nums.length

    // Store rotated values in temp
    for (let i = 0; i < nums.length; i++) {
        temp[(i + k) % nums.length] = nums[i];
    }

    // Copy temp back to nums
    for (let i = 0; i < nums.length; i++) {
        nums[i] = temp[i];
    }
};
