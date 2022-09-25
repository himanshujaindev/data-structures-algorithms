package QuickCode;

import java.util.ArrayList;
import java.util.List;

class MyCircularQueue {
    int[] queue;
    int start = 0, end = -1, size = 0; // and points to last inserted element
    int maxCapacity;

    public MyCircularQueue(int k) {
        queue = new int[k];
        maxCapacity = k;
        return;
    }
    
    public boolean enQueue(int value) {
        if(isFull()) {
            return false;
        }

        size++;
        end = (end + 1) % maxCapacity;
        queue[end] = value;
        
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) {
            return false;
        }

        size--;
        start = (start + 1) % maxCapacity;
        return true;
    }
    
    public int Front() {
        if(isEmpty()) {
            return -1;
        }

        return queue[start];
    }
    
    public int Rear() {
        if(isEmpty()) {
            return -1;
        }

        return queue[end];
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==maxCapacity;
    }
}

public class leetcode {

    public static int concatenatedBinary(int n) {
        long res = 0;
        long MOD = (long) Math.pow(10, 9) + 7;
        for (int i = 1; i <= n; i++) {
            int no_digits = Integer.toBinaryString(i).length();
            res = (long) (res * Math.pow(2, no_digits) + i) % MOD;
        }

        return (int) res;
    }

    public static void main(String[] args) {

        int res = concatenatedBinary(12);
        System.out.println(res);
    }
}
