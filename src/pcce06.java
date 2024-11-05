public class pcce06 {
    static class Solution {
        public int solution(int storage, int usage, int[] change) {
            int total_usage = 0;
            for(int i = 0; i < change.length; i++) {
                // 10%, -10% 등 비율이니까 100에다가 더한 후, 100으로 나누어 주었다.
                usage = usage * (100 + change[i]) / 100;
                total_usage += usage;
                if(total_usage > storage) {
                    return i;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int storage1 = 5141;
        int usage1 = 500;
        int[] change1 = {10, -10, 10, -10, 10, -10, 10, -10, 10, -10};
        System.out.println("Test Case 1: " + sol.solution(storage1, usage1, change1)); // Expected output: -1

        int storage2 = 1000;
        int usage2 = 2000;
        int[] change2 = {-10, 25, -33};
        System.out.println("Test Case 2: " + sol.solution(storage2, usage2, change2)); // Expected output: 1
    }
}
