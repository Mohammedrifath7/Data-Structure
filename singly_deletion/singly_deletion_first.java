class singly_deletion_first{
    ListNode head;
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    void display()
    {
        ListNode current = head;
        while(current!=null)
        {
            System.out.print(current.data+ "-->");
            current = current.next;
        }
        System.out.print("Null");

    }
    ListNode deletion_first()
    {
        if(head == null)
        {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }
    int length()
    {
        if(head==null)
        {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while(current!=null)
        {
            count++;
            current = current.next;
        }
        return count;
    }
    public static void main(String[] args) {
        singly_deletion_first sll = new singly_deletion_first();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        sll.display();
        sll.deletion_first();
        sll.display();
        sll.deletion_first();
        sll.display();


    }
}