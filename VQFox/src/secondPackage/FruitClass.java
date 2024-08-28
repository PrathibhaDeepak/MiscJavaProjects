package secondPackage;

public class FruitClass {

	public static void main(String[] args) {
		CarClass Audi = new CarClass();
		
		System.out.println(Audi.model);
		System.out.println(Audi.cost);
		
		
		Audi.startCar();
		Audi.stopCar();

	}

}
