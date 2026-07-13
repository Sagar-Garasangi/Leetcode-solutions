class Solution {
    public int sumSubarrayMins(int[] arr) {

        int n = arr.length;
        int[] previndex = new int[n];
        int[] nextindex = new int[n];

        long sum = 0;
        int MOD = 1_000_000_007;

        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }

            if (!stack.isEmpty())
                previndex[i] = stack.peek();
            else
                previndex[i] = -1;

            stack.push(i);
        }

        stack.clear();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            if (!stack.isEmpty())
                nextindex[i] = stack.peek();
            else
                nextindex[i] = n;

            stack.push(i);
        }

        for (int i = 0; i < n; i++) {
            long left = i - previndex[i];
            long right = nextindex[i] - i;

            long contribution = (long) arr[i] * left * right;

            sum = (sum + contribution) % MOD;
        }

        return (int) sum;
    }
}
