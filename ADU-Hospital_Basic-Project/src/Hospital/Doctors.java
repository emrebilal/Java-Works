package Hospital;

public class Doctors {
	
	private int _DID;
	private String _namee;
	private String _surnamee;
	private String _TC;

	//Constructor
	public Doctors(int DID, String namee, String surnamee, String TC)
	{
		_DID = DID;
		_namee = namee;
		_surnamee = surnamee;
		_TC = TC;
	}
	
	//Getters
	public int GetDID() {
		return _DID;
	}	
	public String GetNamee() {
		return _namee;
	}
	public String GetSurnamee() {
		return _surnamee;
	}
	public String GetTC() {
		return _TC;
	}
	
	//Setters
	public void SetDID(int DID)
	{
		_DID = DID;
	}
	public void SetNamee(String namee)
	{
		_namee = namee;
	}
	public void SetSurnamee(String surnamee)
	{
		_surnamee = surnamee;
	}
	public void SetTC(String TC)
	{
		_TC = TC;
	}
	
	//
	public String toString()
    {
        return "Doctor ID: " + _DID + "\nDoctor Name: " + _namee + 
               "\nDoctor Surname: " + _surnamee + "\nDoctor TC: " + _TC;
    }
	
}
