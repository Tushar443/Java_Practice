
public class LinkList{
	private Node root;
	
	public LinkList() {
		root=null;
	}
	
	public void insertData(int data) {
		Node node=new Node(data);
		if(root==null) {
			//System.out.println(node.getData());
			root=node;
		}
		else
		{
			Node temp=root;
			while(temp.getNext() !=null) {
				temp=temp.getNext();
			}
			//System.out.println(node.getData());
			temp.setNext(node);
		}
	}
	
	public void insertAtBeg(int data) {
		Node node =new Node(data);
		if(root==null) {
			root=node;
		}
		else
		{
			node.setNext(root);
			root=node;
		}
	}
	
	public void insertMiddeleBefore(int data,int before) {
		Node node =new Node(data);
		if(root.getData()==before) {
			insertAtBeg(data);
		}
		else
		{
			Node temp=root;
			while(temp.getNext().getData() !=before ) {
				temp=temp.getNext();
			}
			node.setNext(temp.getNext());
			temp.setNext(node);
		}
	}
	
	public void insertMiddleAfter(int data ,int after) {
		Node node =new Node(data);
		if(root.getNext()==null) {
			insertData(data);
		}
		else
		{
			Node temp=root;
			while(temp.getData() !=after) {
				temp=temp.getNext();
			}
			node.setNext(temp.getNext());
			temp.setNext(node);
		}
		
	}
	
	public void PrintList() {
		Node temp=root;
		while(temp !=null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
	}
}
