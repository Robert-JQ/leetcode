package com.robert.leetcode.twosum;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Robert-JQ
 * @desc 两数之和 https://leetcode-cn.com/problems/two-sum/
 * @date 2019/04/15 11:16
 */
@Slf4j
public class TwoSumTest {

    @Test
    public void twoSumTest() {
        int[] result1 = twoSum1(new int[]{2, 7, 11, 15}, 22);
        log.info("result1:{}, result2:{}", result1[0], result1[1]);

        int[] result2 = twoSum2(new int[]{2, 7, 11, 15}, 22);
        log.info("result1:{}, result2:{}", result2[0], result2[1]);
    }

    /**
     * @desc 解法一：用最暴力的方法穷举尝试
     * @author Robert-JQ
     * @date 2019/4/15 11:25
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

    /**
     * @desc 解法二：使用map求解
     * @author Robert-JQ
     * @date 2022/12/12 23:21
     * @param nums 给定的数组
     * @param target 给定的目标值
     * @return int[]
     */
    private int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++) {
            if (map.containsKey(nums[i])) {
               return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }

}
