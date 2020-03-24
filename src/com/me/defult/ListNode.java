package com.me.defult;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        ListNode x=this;
        while (true) {

            if (x.next != null) {
                stringBuilder.append(x.val + ",");
                x = x.next;
            } else {
                stringBuilder.append(x.val + "]");
                break;
            }
        }
        return stringBuilder.toString();
    }
}
