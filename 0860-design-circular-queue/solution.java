class MyCircularQueue {
    int [] q;
    int f,r,size,capacity;

    public MyCircularQueue(int k) {
        q=new int[k];
         f=0;
        r=-1;
        size=k;
        capacity=0;
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        r=(r+1)%size;
        q[r]=value;
        capacity++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        f=(f+1)%size;
        capacity--;
        return true;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return q[f];
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return q[r];
        
    }
    
    public boolean isEmpty() {
        if(capacity==0){
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public boolean isFull() {
        if(size==capacity){
            return true;
        }
        else{
            return false;
        }
        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
