/*
 * Problem 2
Movie Theatre Management System, where you can create two classes one is main another one is movie, 
movie class can have two methods setMovie,getMovie where you can create movieName,movieStartTime,movieEndTime,
MovieTicketPrice as instance variables

 */


package Lab.java;

class movie{
	String movieName,starttime,endtime,TicketPrice;
	void setMovie(String mname,String stime,String endtime,String TicketPrice){
		movieName=mname;
		starttime=stime;
		this.endtime=endtime;
		this.TicketPrice=TicketPrice;
	}
	void getMovie(){
		System.out.println("MovieName="+movieName+" \nStart time="+starttime+" \nEndtime="+endtime +" \nTicketPrice="+TicketPrice);
	}

}

public class MainMovie{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		movie movie=new movie();
		movie.setMovie("Kantara", "1:50pm", "4:15pm","250");
		movie.getMovie();
	}
}
