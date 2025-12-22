/*
 * @lc app=leetcode id=151 lang=java
 *
 * [151] Reverse Words in a String
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.trim();
        String[] arr = s.split("\\s+");
        for(int i = arr.length-1; i>=0; i--){
            if(arr[i].isEmpty()){
                continue;
            }
            sb.append(arr[i]);
            if(i!=0) sb.append(" ");
        }
        return sb.toString().trim();
    }
}
// @lc code=end

