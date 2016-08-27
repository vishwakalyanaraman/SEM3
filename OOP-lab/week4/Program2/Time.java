import java.util.Scanner;
import math.abs;
class Time{
	private int hours =0;
	private int minutes =0;
	private int seconds =0;
	
	void input(){
		Scanner sc = new Scanner(System.in);
		hours= sc.nextInt();
		minutes=sc.nextInt();
		seconds=sc.nextInt();
	}
	
	void display(){
		System.out.println(hours+":" +minutes+ ":"+seconds );
	}
	
	Time add(Time d){
		Time sum = new Time();
		int c_hours=hours + d.hours;
		int c_minutes = minutes + d.minutes;
		int c_seconds = seconds + d.seconds;
		sum.seconds = c_seconds;
		sum.minutes=c_minutes;
		sum.hours =c_hours;
		if(c_seconds > 60){
			sum.seconds = c_seconds%60;
			c_minutes += c_seconds/60;
		}
		if(c_minutes >60){
			sum.minutes = c_minutes%60;
			c_hours += c_minutes/60;
		}
		if(c_hours >24){
			sum.hours = c_hours%24;
		}
		
		return sum;
	}
	
	Time subtract(Time d){
		Time diff = new Time();
		int c_hours=math.abs(hours - d.hours);
		int c_minutes =math.abs( minutes- d.minutes);
		int c_seconds = math.abs(seconds - d.seconds);
		sum.seconds = c_seconds;
		sum.minutes=c_minutes;
		sum.hours =c_hours;
		if(c_seconds > 60){
			sum.seconds = c_seconds%60;
			c_minutes += c_seconds/60;
		}
		if(c_minutes >60){
			sum.minutes = c_minutes%60;
			c_hours += c_minutes/60;
		}
		if(c_hours >24){
			sum.hours = c_hours%24;
		}
		
		return diff;
		
		
	}
	
	Time compare(Time d){
		Time big = new Time();
		big.hours = hours;
		big.minutes= minutes;
		big.seconds = seconds;
		int time1 = hours*60*60 + minutes*60 + seconds;
		int time2 = d.hours*60*60 + d.minutes*60 + d.seconds;
		if(time1> time2){
			return big;
		}
		else{
			return big = d;
		}
	}
	public static void main(String args[]){
		Time a = new Time();
		Time b = new Time();
		Time c = new Time();
		Time e = new Time();
		a.input();
		b.input();
		//a.display();
		//b.display();
		
		c=a.add(b);
		c.display();
		c=a.compare(b);
		c.display();
		c=a.subtract(b);
		c.display();
		
	}
}
