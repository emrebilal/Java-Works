//Emre BILAL
//151805029

package garage;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean mainLoop = true;
		String brand, model, type;
		int hp=0;
		int door=0;
		
		vehicle car = new vehicle(" "," "," ", 0, 0);
		
		int choice;
		int choice1;
        while(true){
            System.out.println("***ADU CSE GARAGE***");
            System.out.print("1.) Enter a new car \n");
            System.out.print("2.) Change car status\n");
            System.out.print("3.) Display car info\n");
            System.out.print("4.) Exit\n");
            System.out.print("\nEnter Your Menu Choice: ");

            choice = input.nextInt();       
       
        switch(choice){
        case 1:
        	System.out.print("Enter brand: ");
        	brand=input.next();
        	car.setBrand(brand);
        	
        	System.out.print("Enter model: ");
        	model=input.next();
        	car.setModel(model);
        	
        	System.out.print("Enter type: ");
        	type=input.next();
        	car.setType(type);
        	
        	System.out.print("Enter hp: ");
        	hp=input.nextInt();
        	car.setHp(hp);
        	
        	System.out.print("Enter number of door: ");
        	door=input.nextInt();
        	car.setDoor(door);
        	
        	break;
        case 2:
        	System.out.print("1-Change hp\n");
        	System.out.print("2-Return Menu\n");
        	System.out.print("\nEnter Choice: ");
        	choice1 = input.nextInt();
        	
        	switch(choice1) {
        	case 1:
        		System.out.print("Enter new hp: ");
        		hp=input.nextInt();
        		car.setHp(hp);
        		break;
        	case 2:               
        		break;
        	default:
        		System.out.println("This is not a valid choice! Please Try Again.");
        		break;
        	}
        case 3:
        	System.out.println(car.toString());
        	break;
        case 4:
        	System.out.println("Exiting Program...");
            System.exit(0);
            break;
        default :
            System.out.println("This is not a valid Menu Option! Please Select Another");
            break;
        }
        }
        
	}
}
