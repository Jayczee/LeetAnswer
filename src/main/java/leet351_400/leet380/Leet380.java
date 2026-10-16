package leet351_400.leet380;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Author: Jayczee
 * Date: 2025/3/6
 */
public class Leet380 {
    static class RandomizedSet {
        Map<Integer, Integer> map = new HashMap<>();
        int index = -1;
        int[] arr = new int[200001];
        Random rand = new Random();
        public RandomizedSet() {

        }

        public boolean insert(int val) {
            if (map.containsKey(val)) return false;
            else {
                index++;
                arr[index] = val;
                map.put(val, index);
            }
            return true;
        }

        public boolean remove(int val) {
            if (map.containsKey(val)) {
                int actualKey = map.get(val);
                arr[actualKey] = arr[index];
                map.put(arr[index], actualKey);
                index--;
                map.remove(val);
                return true;
            }
            return false;
        }

        public int getRandom() {
            return arr[rand.nextInt(0, index + 1)];
        }
    }

    public static void main(String[] args) {
        RandomizedSet set = new RandomizedSet();
        set.insert(0);
        set.insert(1);
        set.remove(0);
        set.insert(2);
        set.remove(1);
        System.out.println(set.getRandom());
        System.out.println(set.getRandom());
        System.out.println(set.getRandom());
        System.out.println(set.getRandom());
    }
}
