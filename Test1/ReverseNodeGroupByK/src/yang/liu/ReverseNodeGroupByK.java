package yang.liu;

class NodeList{
	int value;
	NodeList next;
	NodeList(int value)
	{
		this.value=value;
		this.next=null;
	}
	NodeList(int value,NodeList next)
	{
		this.value=value;
		this.next=next;
	}
}
/*  reverse every k nodes of a linked list.
If the list size is not a multiple of k, then leave the remainder nodes as is.
split linked list into several groups by k,reverse each group and combine each group together */
public class ReverseNodeGroupByK {
	
	// reverse each group
	public static NodeList reverse (NodeList start,NodeList end) {  
		
		
		NodeList last=start.next;
		NodeList currentNode=last.next;
		
		while(currentNode!=end)
		{
			last.next=currentNode.next;
			currentNode.next=start.next;
			start.next=currentNode;
			currentNode=last.next;
		}
		
		return last;
	   
	}  
	
	public static NodeList ReverseNodeGroupByK(NodeList head,int k){
		if(head==null || head.next==null || k<=1)
			return head;
		
		NodeList currentNode=head;
	 
		int count=0;
		NodeList dummy=new NodeList(-1);
		NodeList previousNode=dummy;
		dummy.next = head;
		while(currentNode!=null)
		{
			count++;
			if(count%k==0) //when count%k==0,we find a group 
			{
				
				previousNode=reverse(previousNode,currentNode.next);
				currentNode=previousNode.next;
					
				
			}
			else
				currentNode=currentNode.next;
		}
		
		
		return dummy.next;
		
		
	}
	
	public static void main(String [] args)
	{
		int number;  //number of Node
		number=8;
		//number=1;
		//number=0;
		NodeList head=null;
		NodeList next=null;
		//Initialize NodeList using number
		for(int i=1;i<=number;i++)
		{
			if(head==null){
				head=new NodeList(i);
				next=head;
			}
			else{
				next.next=new NodeList(i);
			    next=next.next;}
		}
        int k;
       // k=-1;
      //  k=0;
        k=3;
		head=ReverseNodeGroupByK( head,k);
		
		while(head!=null)
		{
			System.out.println(head.value);
			head=head.next;
		}
	}

}
