
class MyCircularDeque {

    int[] deq;
    int f, r, count, size;

    public MyCircularDeque(int k) {
        deq = new int[k];

        f = 0;
        r = -1;
        count = 0;
        size = k;
    }

    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }

        if (isEmpty()) {
            f = r = 0;
        } else {
            f = (f - 1 + size) % size;
        }

        deq[f] = value;
        count++;

        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }

        if (isEmpty()) {
            f = r = 0;
        } else {
            r = (r + 1) % size;
        }

        deq[r] = value;
        count++;

        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }

        if (count == 1) {
            f = 0;
            r = -1;
        } else {
            f = (f + 1) % size;
        }

        count--;

        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }

        if (count == 1) {
            f = 0;
            r = -1;
        } else {
            r = (r - 1 + size) % size;
        }

        count--;

        return true;
    }

    public int getFront() {
        if (isEmpty()) {
            return -1;
        }

        return deq[f];
    }

    public int getRear() {
        if (isEmpty()) {
            return -1;
        }

        return deq[r];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }
}


/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
