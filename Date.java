//PROGRAMMED BY : A.T.BALAJI
//ROLL NO		: 2015103053



public class Date {
	int day,year,month;
	public Date(){
		day=0;
		year=0;
		month=0;
	}
	public Date(int a,int b,int c)	{
		month=a;
		day=b;
		year=c;
	}
public void setMonth(int a){
	month=a;
}
public void setDay(int a){
	day=a;
}
public void setYear(int a){
	year=a;
}
public int getMonth(){
	return month;
}
public int getDay(){
	return day;
}
public int getYear(){
	return year;
}
public void displayDate(){
	System.out.println("Date in MDY format "+ getMonth()+"/"+getDay()+"/"+getYear());
}

}
