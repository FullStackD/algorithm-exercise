import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = getGreaterNum(nums1[i], nums2);
        }
        return res;
    }

    private int getGreaterNum(int num, int[] nums2) {
        int i = 0;
        while (i < nums2.length) {
            if (nums2[i] != num)
                i++;
            else
                break;
        }
        while (i < nums2.length) {
            if (nums2[i] > num) {
                return nums2[i];
            }
            i++;
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        NextGreaterElementI n = new NextGreaterElementI();
        int[] res = n.nextGreaterElement(nums1, nums2);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public int[] nextGreaterElement2(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }
        for (int i = 0; i < nums1.length; i++) {
            Integer tmp = map.get(nums1[i]);
            nums1[i] = tmp == null ? -1 : tmp;
        }
        return nums1;
    }

}
