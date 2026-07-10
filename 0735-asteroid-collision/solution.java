class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int current : asteroids) {
            boolean alive = true;
            while (alive &&
                   !stack.isEmpty() &&
                   stack.peek() > 0 &&
                   current < 0) {
                int top = stack.peek();
                if (Math.abs(top) < Math.abs(current)) {
                    stack.pop();          
                }
                else if (Math.abs(top) == Math.abs(current)) {
                    stack.pop();             
                    alive = false;
                }
                else {
                    alive = false;
                }
            }

            if (alive) {
                stack.push(current);
            }
        }

        int[] ans = new int[stack.size()];

        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }

        return ans;
    }
}
