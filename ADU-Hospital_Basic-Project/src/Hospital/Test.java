//Emre BILAL
//151805029

package Hospital;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean mainLoop = true;		
		String namee,name,surname,surnamee,type,TC;
		int DID = 0;
		int AID = 0;
		int day = 0;
		int month = 0;
		int year = 0;

		MyDate aDate = new MyDate(0,0,0);
		Patient p = new Patient("","");
		Doctors dr = new Doctors(0,"","","");
		Analysis a = new Analysis(0,"",aDate,p,dr);
			
		int choice;
		int choice1;
        while(true){
            System.out.println("***ADU HOSPITAL***");
            System.out.print("1.) Add analysis\n");
            System.out.print("2.) Change analysis details\n");
            System.out.print("3.) Show analysis\n");
            System.out.print("4.) Exit\n");
            System.out.print("\nEnter Your Menu Choice: ");

            choice = input.nextInt();       
       
        switch(choice){
        case 1:
        	System.out.print("Enter Analysis ID: ");
        	AID=input.nextInt();
        	a.SetAID(AID);
        	System.out.print("Enter Analysis Type: ");
        	type=input.next();
        	a.SetType(type);
        	System.out.print("Enter Analysis Date\nDay: ");
        	day=input.nextInt();
        	aDate.SetDay(day);
        	System.out.print("Month: ");
        	month=input.nextInt();
        	aDate.SetMonth(month);
        	System.out.print("Year: ");
        	year=input.nextInt();
        	aDate.SetYear(year);
        	System.out.print("Enter Patient Name: ");
        	name=input.next();
        	p.SetName(name);
        	System.out.print("Enter Patient Surname: ");
        	surname=input.next();
        	p.SetSurname(surname);
        	System.out.print("Enter Doctor ID: ");
        	DID=input.nextInt();
        	dr.SetDID(DID);
        	System.out.print("Enter Doctor Name: ");
        	namee=input.next();
        	dr.SetNamee(namee);
        	System.out.print("Enter Doctor Surname: ");
        	surnamee=input.next();
        	dr.SetSurnamee(surnamee);
        	System.out.print("Enter Doctor TC: ");
        	TC=input.next();
        	dr.SetTC(TC);

			break;
        case 2:
        	System.out.print("1-Change AID\n");
        	System.out.print("2-Change Type\n");
        	System.out.print("3-Change Date\n");
        	System.out.print("4-Change Patient\n");
        	System.out.print("5-Change Doctor\n");
        	System.out.print("6-Return Menu\n");
        	System.out.print("\nEnter Choice: ");
        	choice1 = input.nextInt();
        	
        	switch(choice1) {
        	case 1:
        		System.out.print("Enter new AID: ");
        		AID=input.nextInt();
        		a.SetAID(AID);
        		break;
        	case 2:
        		System.out.print("Enter new Type: ");
        		type=input.next();
        		a.SetType(type);
        		break;
        	case 3:
        		System.out.println("Enter new date");
        		System.out.print("Day: ");
        		day=input.nextInt();
        		aDate.SetDay(day);
            	System.out.print("Month: ");
            	month=input.nextInt();
            	aDate.SetMonth(month);
            	System.out.print("Year: ");
            	year=input.nextInt();
            	aDate.SetYear(year);
        		break;
        	case 4:
            	System.out.print("Enter new Patient Name: ");
            	name=input.next();
            	p.SetName(name);
            	System.out.print("Enter new Patient Surname: ");
            	surname=input.next();
            	p.SetSurname(surname);
            	break;
        	case 5:
        		System.out.print("Enter new Doctor ID: ");
            	DID=input.nextInt();
            	dr.SetDID(DID);
            	System.out.print("Enter new Doctor Name: ");
            	namee=input.next();
            	dr.SetNamee(namee);
            	System.out.print("Enter new Doctor Surname: ");
            	surnamee=input.next();
            	dr.SetSurnamee(surnamee);
            	System.out.print("Enter new Doctor TC: ");
            	TC=input.next();
            	dr.SetTC(TC);
        		break;
        	case 6:               
        		break;
        	default:
        		System.out.println("This is not a valid choice! Please Try Again.");
        		break;
        	}
        	
        case 3:
        	a.Show();
        	System.out.println(dr.toString());
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
