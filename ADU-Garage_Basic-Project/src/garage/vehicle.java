
package garage;
import java.util.Scanner;

public class vehicle {
	
	private String _brand;
	private String _model;
	private String _type;
	private int _hp;
	private int _door;
	
	Scanner input = new Scanner(System.in);
	
	//Constructor
	public vehicle (String brand, String model, String type, int hp, int door)
	{
		this._brand=brand;
		this._model=model;
		this._type=type;
		this._hp=hp;
		this._door=door;
	}	
	//Getters
	public String getBrand() {
		return this._brand;
	}
	public String getModel() {
		return this._model;
	}
	public String getType() {
		return this._type;
	}
	public int getHp() {
		return this._hp;
	}
	public int getDoor() {
		return this._door;
	}
	//Setters
	public void setBrand(String brand) {
		while(!brand.equalsIgnoreCase("mercedes") && !brand.equalsIgnoreCase("volvo") && !brand.equalsIgnoreCase("tofas")) 
		{
			System.out.println("Please enter valid brand:");
			brand = input.next();
		}
		this._brand=brand;
	}
	public void setModel(String model) {
		if(_brand.equalsIgnoreCase("mercedes")) {
			while(!model.equalsIgnoreCase("C180") && !model.equalsIgnoreCase("E200"))
			{
				System.out.println("Please enter valid model for mercedes:");
				model = input.next();
			}
		}
		else if(_brand.equalsIgnoreCase("volvo")) {
			while(!model.equalsIgnoreCase("S40") && !model.equalsIgnoreCase("S60"))
			{
				System.out.println("Please enter valid model for volvo:");
				model = input.next();
			}
		}
		else if(_brand.equalsIgnoreCase("tofas")) {
			while(!model.equalsIgnoreCase("dogan") && !model.equalsIgnoreCase("sahin"))
			{
				System.out.println("Please enter valid model for tofas:");
				model = input.next();
			}
		}
		this._model=model;
	}
	public void setType(String type) {
		while(!type.equalsIgnoreCase("sedan") && !type.equalsIgnoreCase("coupe"))
		{
			System.out.println("Please enter valid type(sedan or coupe):");
			type = input.next();
		}
		this._type=type;
	}
	public void setHp(int hp) {
		while (hp<50 || hp>200)
		{
			System.out.println("Please enter valid hp(50-200):");
			hp = input.nextInt();			
		}
		this._hp=hp;
	}
	public void setDoor(int door) {
		while (door!=2 && door!=4)
		{
			System.out.println("Please enter valid door(2 or 4):");
			door = input.nextInt();			
		}
		this._door=door;
	}
	
	public String toString()
    {
        return "Brand: " + _brand + "\nModel: " + _model + 
               "\nType: " + _type + "\nHp: " + _hp + "\nNumber of door: " + _door;
    }
}
