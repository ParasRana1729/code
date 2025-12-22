/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start

// Moore's Voting Algo
class Solution {
    public int majorityElement(int[] nums) {
        int counter = 0;
        int ele = 0;
        for(int i = 0; i < nums.length; i++){
            if(counter == 0){
                counter = 1;
                ele = nums[i];
            }
            else if (ele == nums[i]){
                counter++;
            }
            else{
                counter--;
            }
        }
        return ele;
    }
}
// @lc code=end

