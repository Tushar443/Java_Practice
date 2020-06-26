
public class Main {
	public static void main(String[] args) {
		LinkList l=new LinkList();
		l.insertData(10);
		l.insertData(20);
		l.insertData(30);
		l.insertAtBeg(40);
		l.insertAtBeg(50);
		l.insertAtBeg(60);
		l.insertMiddeleBefore(2, 60);
		l.insertMiddeleBefore(4, 10);
		l.insertMiddleAfter(100, 2);
		l.insertMiddleAfter(400, 40);
		l.PrintList();
	}
}
