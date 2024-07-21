class singly_deletion_middle{
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
    void deletion_middle(int position)
    {
        if(position==1)
        {
            head = head.next;
        }
        else{
            int count=1;
            ListNode previous  = head;
            while(count<position-1)
            {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;

        }
       
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
        singly_deletion_middle sll = new singly_deletion_middle();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        sll.display();
        sll.deletion_middle(3);
        sll.display();
        sll.deletion_middle(2);
        sll.display();


    }
}