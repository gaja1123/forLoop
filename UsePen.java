package foor3;

public class UsePen {
	public static void main(String []args) {
		Pen p1 = new Pen();
		p1.brand = "cello";
		p1.price = 25;
		p1.color = "black";
		
		
		Pen p2 = new Pen();
		p2.brand = "camel";
		p2.price = 20;
		p2.color = "blue";
		
		Pen p3= new Pen();
		p3.brand = "razor";
		p3.price= 20;
		p3.color = "blue";
		
		Pen p4= new Pen();
		p4.brand = "camalin";
		p4.price= 15;
		p4.color = "red";
		
		Pen[] pens = {p1,p2,p3,p4};
		for(int i = 0;i<pens.length;i++) {
			
		for(int i=0;i<pens.length;i++) {
			if(i%2==0) {
			System.0t.println(pens[i].brand+" "+pens[i].price+" "+pens[i].color);
			}
			}
		}
		
			
				
	}
}
