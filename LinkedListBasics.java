class ListNode 
{
    int val;
    ListNode next;

    ListNode(int val)
    {
        this.val=val;
        this.next=null;
    }

}

public class LinkedListBasics
{
    public static void main(String[] arg)
    {
        ListNode first = new ListNode(1);
        ListNode second= new ListNode(2);
        ListNode third = new ListNode(3);

        first.next = second;
        second.next = third;

        PrintList(first);



    }
    static void PrintList(ListNode head)
    {
        ListNode current = head;
        while(current!=null)
        {
            System.out.print(current.val +"->");
            current=current.next;

        }
        System.out.println("null");
    }
}
