import java.util.ArrayList;
class Mainclass
{
	public static void main(String[] args) {
		System.out.println("program starts...");
		ArrayList alist =new ArrayList();
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