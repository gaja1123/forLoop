package foor3;

public class UseBike {
	public static void main(String []args) {
		Bike b1 = new Bike();
		b1.brand = "yamaha";
		b1.price = 50000;
		b1.model= "r15";
		b1.color= "black";
		
		Bike b2 = new Bike();
		b2.brand = "honda";
		b2.price = 25000;
		b2.model = "hornet";
		b2.color= "white";
		
		
		Bike[] bikes = {b1,b2};		
		Bike temp =bikes[0];
				
	//Enhanced	loop:
		
		for(Bike a :bikes) {
			if(a.price>=temp.price&&a.color.equals("black")) {
				
				temp=a;
				
				
				System.out.println(temp.price+" "+temp.model);
			}
		}
			
	//Normal loop	
			
		
		for(int i=0;i<bikes.length;i++) {
			if(bikes[i].price>=temp.price&&bikes[i].color.equals("black")) {
				temp=bikes[i];
				System.out.println(temp.price+" "+temp.model);
				
			}
		}
		
		
		
	}

}
