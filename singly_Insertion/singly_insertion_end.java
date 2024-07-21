public class singly_insertion_end {
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
    void insert_end(int value)
    {
        ListNode newNode = new ListNode(value);
        if(head==null)
        {
            head = newNode;
            return;
        }
        ListNode current = head;
        while(current.next!=null)
        {
            current = current.next;
        }
        current.next = newNode;
    }

    void display()
    {
        ListNode current = head;
        while(current!=null)
        {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("Null");
    }

    int length()
    {
        if(head==null)
        {
            return 0;
        }
        ListNode current = head;
        int count = 0;
        while(current!=null)
        {
            count++;
            current = current.next;
        }
        return count;
        
    }

    public static void main(String args[])
    {
        singly_insertion_end sll = new singly_insertion_end();
        sll.insert_end(10);
        sll.insert_end(20);
        sll.display();
    }
}
