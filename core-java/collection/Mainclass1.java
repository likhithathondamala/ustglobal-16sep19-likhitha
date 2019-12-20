import java.util.Vector;
class Mainclass1
{
	public static void main(String[] args) {
		System.out.println("program starts...");
		Vector alist = new Vector();
		alist.add(10);
		alist.add(null);
		alist.add(10);
		alist.add(20);
		alist.add(30);
		alist.add(40);
		alist.add(null);
		for(int i=0;i<alist.size();i++){
			System.out.println(alist.get(i));

		}
System.out.println("program ends...");
	}
}