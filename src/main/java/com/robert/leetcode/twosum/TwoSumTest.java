package com.robert.leetcode.twosum;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author Robert-JQ
 * @desc 两数之和 https://leetcode-cn.com/problems/two-sum/
 * @date 2019/04/15 11:16
 */
@Slf4j
public class TwoSumTest {

    @Test
    public void twoSumTest() {
        int[] result = twoSum1(new int[]{2, 7, 11, 15}, 22);
        log.info("result1:{}, result2:{}", result[0], result[1]);
    }

    /**
     * @desc 两数之和解法一：用最暴力的方法穷举尝试
     * @author Robert-JQ
     * @date 2019/4/15 0015 11:25
     * @param nums 给定的数组
     * @param target 给定的目标值
     * @return int[]
     */
    private int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];
        for (int n = 0 ; n < nums.length ; n++) {
            for (int m = 0 ; m < nums.length ; m++) {
                if (n != m && nums[n] + nums[m] == target) {
                    result[0] = n;
                    result[1] = m;
                }
            }
        }
        return result;
    }

}
