package com.robert.leetcode.romantoint;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @desc 罗马数字转整数 https://leetcode.cn/problems/roman-to-integer/
 * @author Robert-JQ
 * @date 2022/12/13 13:06
 */
@Slf4j
public class RomanToIntTest {

    @Test
    public void romanToIntTest() {
        String s = "MCMXCIV";
        log.info("{} romanToInt {}", s, romanToInt1(s));
    }

    /**
     * @desc 解法一：
     * @author Robert-JQ
     * @date 2022/12/13 13:21
     * @param s
     * @return int
     */
    private int romanToInt1(String s) {
        Map<Character, Integer> map = new HashMap<>(7);
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int len = s.length();
        int sum = map.get(s.charAt(len - 1));
        for (int i = len - 2 ; i >= 0; --i) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                sum -= map.get(s.charAt(i));
            } else {
                sum += map.get(s.charAt(i));
            }
        }
        return sum;
    }

}
