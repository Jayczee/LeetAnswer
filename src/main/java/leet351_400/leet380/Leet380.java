package leet351_400.leet380;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Stack;

/**
 * Author: Jayczee
 * Date: 2025/3/6
 */
public class Leet380 {
    static class RandomizedSet {
        private final Map<Integer, Integer> valMap = new HashMap<>();
        private Stack<Integer> stack = new Stack<>();
        private int index = 0;
        Random random = new Random();

        public RandomizedSet() {

        }

        public boolean insert(int val) {
            if (valMap.containsKey(val)) {
                return false;
            } else {
                stack.push(val);
                valMap.put(val, index);
                index++;
                return true;
            }
        }

        public boolean remove(int val) {
            if (valMap.containsKey(val)) {
                Integer deletedIndex = valMap.get(val);
                int val1 = stack.get(deletedIndex);
                int val2 = stack.getLast();
                stack.set(deletedIndex, val2);
                stack.set(stack.size() - 1, val1);
                valMap.put(val2, deletedIndex);
                stack.pop();
                valMap.remove(val);
                index--;
                return true;
            } else {
                return false;
            }
        }

        public int getRandom() {
            return stack.get(random.nextInt(stack.size()));
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
