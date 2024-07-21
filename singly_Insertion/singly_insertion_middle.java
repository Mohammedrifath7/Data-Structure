public class singly_insertion_middle {
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
    void insert_middle(int value,int position)
    {
        ListNode newNode = new ListNode(value);
        if(position==1)
        {   
            newNode.next = head;
            head = newNode;
        }
        else{
            int count =1;
            ListNode previous = head;
            while(count<position-1)
            {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            newNode.next = current;
            previous.next = newNode;
        }

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
        singly_insertion_middle sll = new singly_insertion_middle();
        sll.insert_middle(10,1);
        sll.insert_middle(20,2);
        sll.insert_middle(40,3);
        sll.insert_middle(50,4);
        sll.insert_middle(30,3);

        sll.display();
    }
}
