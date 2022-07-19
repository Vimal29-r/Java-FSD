package constructors;
class vehicle{
	int wheels;
	int seats;
	String model;
	vehicle()	
	{
		model="Toyoto";
		seats=5;
		wheels=4;
	}
	vehicle(int w,int s, String m)	
	{
		this.wheels=w;
		this.seats=s;
		this.model=m;
	}
	
}

public class Constructors {
	public static void main(String[] args) {
		
		vehicle obj =new vehicle();	
		System.out.println("Specifications of:"+obj.model);
		System.out.println("Wheels:"+obj.wheels);
		System.out.println("Seats:"+obj.seats);
		vehicle obj2 =new vehicle(2,2,"Bike");
		System.out.println("Specifications of:"+obj2.model);
		System.out.println("Wheels:"+obj2.wheels);
		System.out.println("Seats:"+obj2.seats);
		

}
}