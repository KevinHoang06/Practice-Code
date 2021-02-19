public class CarDealership {
    
    int lambo;
    int bugatti;
    int tesla;
    
    public CarDealership (int numberoflambos, int numberofbugattis, int numberofteslas) {
        numberoflambos = lambo;
        numberofbugattis = bugatti;
        numberofteslas = tesla;
    }

    public static void main (String[] args) {
    CarDealership Kevins = new CarDealership(0, 0, 0);
    
    System.out.println("There are " + Kevins.lambo + " Lamborghinis in the dealership.");
    System.out.println("There are " + Kevins.bugatti + " Bugattis in the dealership.");
    System.out.println("There are " + Kevins.tesla + " Teslas in the dealership.");
    System.out.println("WE ARE SOLD OUT.");
	}
}