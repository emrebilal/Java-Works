package Hospital;

public class MyDate {

	int _day;
	int _month;
	int _year;
	
	public MyDate(int day, int month, int year)
	{
		_day = day;
		_month = month;
		_year = year;
	}
	
	public int GetDay() {
		return _day;
	}
	public int GetMonth() {
		return _month;
	}
	public int GetYear() {
		return _year;
	}
	
	public void SetDay(int day) {
		_day=day;
	}
	public void SetMonth(int month) {
		_month=month;
	}
	public void SetYear(int year) {
		_year=year;
	}
	
	public void display() {
		System.out.println("Analysis Date: "+_day+"."+_month+"."+_year);
	}
	
}
