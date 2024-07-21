class singly_deletion_last{
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
    ListNode deletion_last()
    {
        if(head == null || head.next ==null)
        {
            return head;
        }
        ListNode previous=null ;
        ListNode current = head;
        while(current.next!=null)
        {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
       
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
        singly_deletion_last sll = new singly_deletion_last();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        sll.display();
        sll.deletion_last();
        sll.display();
        sll.deletion_last();
        sll.display();


    }
}