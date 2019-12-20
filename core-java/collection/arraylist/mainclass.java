import java.util.ArrayList;
class shoes{
	int size;
	String color;
	String brand;
	double price;
	public shoes(int size,String color,String brand,double price){
		this.size=size;
		this.color=color;
		this.brand=brand;
		this.price=price;

	}
	@Override
	public String toString(){
		return size+" "+color+" "+brand+" "+price;
	}

	}
	class mobile{
		String brand;
		String model;
		String color;
		int ram;
		double price;
		public mobile(String brand,String model,String color,int ram,double price){
		this.brand=brand;
		this.model=model;
		this.color=color;
		this.ram=ram;
		this.price=price;
}
    @Override
     public String toString(){
		return brand+" "+model+""+color+" "+ram+" "+price;
	}

	}

	class Mainclass{
		public static void showCart(ArrayList cart) {
			for(int i=0;i<cart.size();i++){
				System.out.println(cart.get(i));
			}
		}	
		
	
		public static void main(String[] args) {
          mobile m1=mobile("vivo","y83","black",8,14000);
          shoes s1= shoes(9,"cream","paragon",500);
          mobile m2=mobile("vivo","y83","black",8,14000);
           shoes s2= shoes(9,"cream","paragon",500);
           ArrayList cart =new ArrayList();
           cart.add(m1);
           cart.add(s1);
           cart.add(m2);
           cart.add(s2);
           showCart(cart);

			
		}
	}
																																																																																																																																																																																																																																									

																																																																																																																																																																																																																																																																													c