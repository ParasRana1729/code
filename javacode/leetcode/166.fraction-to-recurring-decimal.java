/*
 * @lc app=leetcode id=166 lang=java
 *
 * [166] Fraction to Recurring Decimal
 */

// @lc code=start
class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator>denominator) return String.valueOf(numerator/denominator);
        return "";
    }
}
// @lc code=end

