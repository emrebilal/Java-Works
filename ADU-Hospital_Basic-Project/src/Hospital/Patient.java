package Hospital;

public class Patient {
	
	private String _name;
	private String _surname;
	
	public Patient(String name, String surname)
	{
		_name = name;
		_surname = surname;
	}
			
	public String GetName()
	{
		return _name;
	}
	public String GetSurname()
	{
		return _surname;
	}
	
	public void SetName(String name)
	{
		_name = name;
	}
	public void SetSurname(String surname)
	{
		_surname = surname;
	}
	
	public void Display()
    {
        System.out.println("Patient Name: " + _name);
        System.out.println("Patient Surname: " + _surname);
    }
	
	
	
	
	
	
	
	
}
