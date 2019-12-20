import java.util.HashSet;
import java.util.Iterator;
 class Mainclass1{
 	public static void main(String[] args) {
 		HashSet hs1 =new HashSet();
 		hs1.add (10);
 		hs1.add(null);
 		hs1.add(20);
 		hs1.add(10);
 		hs1.add(40);
 		hs1.add(null);

 		Iterator i1 = hs1.iterator();
 		 while(i1.hasNext()==true){
 		 	System.out.println(i1.next());
          
 		 }
 		 
 	}
 }