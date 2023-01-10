package foor3;

public class Usecar {
	public static void main(String []args) {
	Car c1 = new Car();
	c1.brand = "bmw";
	c1.price = 25000;
	c1.color = "black";
	c1.rating = 5;
	c1.model = "X12";
	
	Car c2 = new Car();
	c2.brand = "audi";
	c2.price = 23000;
	c2.color = "blue";
	c2.rating = 4;
	c2.model = "V20";
	
	Car c3 = new Car();
	c3.brand = "benz";
	c3.price = 28000;
	c3.color = "red";
	c3.rating = 2;
	c3.model = "X12";
	
	Car c4 = new Car();
	c4.brand = "lambo";
	c4.price = 22000;
	c4.color = "yellow";
	c4.rating = 3;
	c4.model = "X12";
	
	Car[] cars = {c1,c2,c3,c4};
	Car temp = cars[0];
	
	
	int max = cars[0].price;
	String maxBrand = "";
	String colour = "";
	float ratings = cars[0].rating;
	String models = cars[0].model;
	
	
	for(int i=0;i<cars.length;i++) {
		if(cars[i].price>=max) {
			Car val=null;
			
			//max = cars[i].price;
			//maxBrand = cars[i].brand;
			//colour = cars[i].color;
			//ratings = cars[i].rating;
			//models = cars[i].model;
		}
		
		
		
		
	}
	
	//System.out.println(val.price+" "+val.brand);
	
	//System.out.println(max+" "+maxBrand+" "+colour+" "+ratings+" "+models);
	int leng =cars[0].brand.length();
	for(int i = 0;i<cars.length;i++) {
		if(cars[i].brand.length()>leng) {
			leng=cars[i].brand.length();
			colour = cars[i].color;
			max = cars[i].price;
			ratings = cars[i].rating;
			models = cars[i].model;
			
			
		}
	}
	System.out.println(leng+" "+colour+" "+max+" "+ratings+" "+models);
	
		
	}
	
	


}
