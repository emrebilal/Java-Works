package Hospital;

public class Analysis {

	private int _AID;
	String _type;
	MyDate _aDate;
	private Patient _p;
	private Doctors _dr;
	
	public Analysis(int AID, String type, MyDate aDate, Patient p, Doctors dr)
	{
		_AID = AID;
		_type = type;
		_aDate = aDate;
		_p = p;
		_dr=dr;
	}
	
	public Analysis(int AID, String type, int day, int month, int year, String name, String surname, int DID, String namee, String surnamee, String TC)
	{
		_AID = AID;
		_type = type;
		_aDate = new MyDate(day, month, year);
		_p = new Patient(name, surname);
		_dr=new Doctors(DID, namee, surnamee, TC);
	}
	
	public Patient GetPatient()
	{
		return _p;
	}
	public MyDate GetMyDate()
	{
		return _aDate;
	}
	public Doctors GetDoctors()
	{
		return _dr;
	}
	
	public int GetAID()
	{
		return _AID;
	}
	public String GetType()
	{
		return _type;
	}
	public void SetAID(int AID)
	{
		_AID=AID;
	}
	public void SetType(String type)
	{
		_type=type;
	}
	
	public void Show()
	{
		System.out.println("Analysis ID: "+_AID);
		System.out.println("Analysis Type: "+_type);
		_aDate.display();
		_p.Display();	
	}
	
	
	
}
