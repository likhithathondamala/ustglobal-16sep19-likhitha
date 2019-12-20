import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;
class Descorder implements Comparator{
	@Override
	public int compare(Object obj1, Object obj2){
		String str1=(String)obj1;
		String str2=(String)obj2;
		int res=str2.compareTo(str1);
		return res;

	}
}
class LengthOrder implements Comparator{
	@Override
	public int compare(Object obj1, Object obj2){
		String str1=(String)obj1;
		String str2=(String)obj2;
		
		return str1.length()-str2.length();

	}
}
class mainclass4{
	public static void main(String[] args) {
		Descorder d1=new Descorder();
	LengthOrder  l1=new LengthOrder();
	TreeSet hs1=new TreeSet(l1);
	hs1.add("dotnet");
	hs1.add("android");
	hs1.add("C");
	hs1.add("erp");
	Iterator i1=hs1.iterator();
	while(i1.hasNext()==true){
		System.out.println(i1.next());

	}
	}
}