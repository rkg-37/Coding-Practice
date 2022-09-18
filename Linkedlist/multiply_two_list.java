import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}

class MultiplyTwoLL{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Node head=null;
			Node phead=null;
			int n=sc.nextInt();
			while(n-->0){
				int n1=sc.nextInt();
				if(head==null)
				    head=new Node(n1);
			    else{
				    addHead(head,n1);
			    }
			}
			int m=sc.nextInt();
			while(m-->0){
				int n1=sc.nextInt();
				if(phead==null)
				    phead=new Node(n1);
			    else{
				    addPhead(phead,n1);
			    }
		    }
            multiply_two_list g=new multiply_two_list();

            System.out.println(g.multiplyTwoLists(head,phead));
		}
	}
    public static void addHead(Node node,int a) {
          if (node == null)
            return;
		if(node.next==null)
			node.next=new Node(a);
		else
			addHead(node.next,a);
	}
	public static void addPhead(Node node,int a){
		if (node == null)
            return;
		if(node.next==null)
		    node.next=new Node(a);
	    else
		    addPhead(node.next,a);
	}   
}
	
	
// } Driver Code Ends   


class multiply_two_list{
  /*You are required to complete this method */
   public long multiplyTwoLists(Node l1,Node l2){
       long m = 1000000007;
       Node curr = l1;
       long a = 0;
       while(curr!=null){
           a = ((a%m) * (10%m))%m +  curr.data;
           curr = curr.next;
       }
       curr = l2;
       long b = 0;
       while(curr!=null){
           b = ((b%m) * (10%m))%m  +   curr.data;
           curr = curr.next;
       }
       long res = ((a%m)*(b%m))%m;
       return res;
   }
}

//{ Driver Code Starts
