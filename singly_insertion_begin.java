public class singly_insertion_begin {
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
    void insert_begin(int value)
    {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
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
        singly_insertion_begin sll = new singly_insertion_begin();
        sll.insert_begin(20);
        sll.insert_begin(10);
        sll.display();
        System.out.println(sll.length());
    }
}
