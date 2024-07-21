class singly_insertion{
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
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("Null");

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
        singly_insertion sll = new singly_insertion();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        sll.head.next = second;
        second.next = third;
        sll.display();
        System.out.println(sll.length());

    }
}