
abstract class ClockType
{
	
	private int hour, minute, second;
	
	public ClockType()
	{
		hour = minute = second = 0;
	}
	
	public void setTime(int h, int m, int s)
	{
		hour = (h>=0 && h < 24) ? h : 0;
		minute = (m>=0 && m < 60) ? m : 0;
		second = (s>=0 && s < 60) ? s : 0;
	}
	
	public String toString()
	{
		return hour + ":" + minute + ":" + second;
	}
}

class Clock extends ClockType
{
	public String toString()
	{
		return "Normal Clock: " + super.toString();
	}
	
}

class EnhancedClock extends ClockType
{
	private int milisecond;
	
	public void setTime(int h, int m, int s, int mili)
	{
		setTime(h,m,s);
		milisecond = (mili >= 0 && mili < 1000 )? mili : 0;
	}
	
	public String toString()
	{
		return "Enhanced Clock: " + super.toString() + ":" + milisecond;
	}
}


class Main
{
	public static void main(String arg[])
	{
		ClockType aClock;
		EnhancedClock EC;
		
		aClock = new Clock();
		
		EC = new EnhancedClock();
		
		aClock.setTime(5,45,0);
		EC.setTime(5,45,0,900);
		
		System.out.println(EC);
		System.out.println(aClock);
		
		
	}
}
