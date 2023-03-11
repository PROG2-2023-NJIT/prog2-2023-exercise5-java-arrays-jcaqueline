package prog2.exercise5.flight.booking.system;



import java.time.LocalDate;
import java.time.Period;
import java.util.Random;










public class FlightBooking {
    static String flightCompany ="Flights-of-Fancy";
    static String flightID = " FOF0345IN";
    public static TripSource tripSource;
    public static SourceAirport sourceAirport;
    static TripDestination tripDestination;
    public static DestinationAirport destinationAirport;
    static LocalDate departureDate;
    static LocalDate returnDate;
    public static int childPassengers ;
    public static int adultPassengers ;
    public static int totalPassengers;
    public static double departingTicketPrice;
    public static double returnTicketPrice;
    private static BookingClass bookingClass;
    public static double totalTicketPrice;
    private static String[] passengerFullName = new String[3];
    private static String[] passengerGender = new String[3];
    private static int[] passengerAge = new int[3];
    public static String ticketNumber;
    public static TripType tripType;
    public static Object getBookingClass;
    public static double price;
    public static double price2;
    public static double price3;
    public static int po;
    public static String yy;
    public static String x;
    public static String y;
    public static int asd;
    public String gety(){
        return FlightBooking.y;
    }
   public void sety(String kk){
    FlightBooking.y = kk;
   }
    
    public String getyy(){
        return FlightBooking.yy;
    }
    public void setyy(String z){
        FlightBooking.yy = z;
    }
    public double getprice(){
        return FlightBooking.price;
    }
    public void setprice(double q){
       FlightBooking.price = q;
        
    }
    public double getprice2(){
        return FlightBooking.price2;
    }
    public void setprice2(double p){
       FlightBooking.price2 = p; 
    }
    public int getpo(){
        return FlightBooking.po;
    }
    public void setpo(int g){
        FlightBooking.po = g;
    }
    enum BookingClass{
    FIRST,Business,Economy;
    String BookingClass;
    }
    public void setBookingClass(String str){
    {
       if(str.equals("1"))
       FlightBooking.bookingClass = BookingClass.FIRST;
       if(str.equals("2"))
       FlightBooking.bookingClass = BookingClass.Business;
       if(str.equals("3"))
       FlightBooking.bookingClass = BookingClass.Economy;
    }
    }
    public BookingClass getBookingClass(){
        return bookingClass;
    }

    enum TripSource{
    NANJING, BEIJING, SHANGHAI, Oulu, Helsinki, Paris;
    }
    public void setTripSource(String str3){
       if(str3.equals("1"))
       FlightBooking.tripSource = TripSource.NANJING;
       if(str3.equals("2"))
       FlightBooking.tripSource = TripSource.BEIJING;
       if(str3.equals("3"))
       FlightBooking.tripSource = TripSource.Oulu;
       if(str3.equals("4"))
       FlightBooking.tripSource = TripSource.Helsinki;
    }
    public TripSource getTripSource(){
        return tripSource;
    }
    enum SourceAirport{
        Nanjing_Lukou_International_Airport,
         Beijing_Capital_International_Airport,
          Shanghai_Pudong_International_Airport,
           Oulu_Airport, Helsinki_Airport,Paris_Charles_de_Gaulle_Airport
    }
    public void setSourceAirport(String str3){
        if(str3.equals("1"))
        FlightBooking.sourceAirport = SourceAirport.Nanjing_Lukou_International_Airport;
        if(str3.equals("2"))
        FlightBooking.sourceAirport = SourceAirport.Beijing_Capital_International_Airport;
        if(str3.equals("3"))
        FlightBooking.sourceAirport = SourceAirport.Oulu_Airport;
        if(str3.equals("4"))
        FlightBooking.sourceAirport = SourceAirport.Helsinki_Airport;
    }
    public SourceAirport getsourceAirport(){
        return sourceAirport;
    }
    enum DestinationAirport{
        Nanjing_Lukou_International_Airport,
         Beijing_Capital_International_Airport,
          Shanghai_Pudong_International_Airport,
           Oulu_Airport, Helsinki_Airport,Paris_Charles_de_Gaulle_Airport
    }
    public void setDestinationAirport(String str2, String str3){
        if(str3.equals("1"))
        FlightBooking.destinationAirport = DestinationAirport.Nanjing_Lukou_International_Airport;
        if(str3.equals("2"))
        FlightBooking.destinationAirport = DestinationAirport.Beijing_Capital_International_Airport;
        if(str3.equals("3"))
        FlightBooking.destinationAirport = DestinationAirport.Oulu_Airport;
        if(str3.equals("4"))
        FlightBooking.destinationAirport = DestinationAirport.Helsinki_Airport;
    }
    public DestinationAirport getDestinationAirport(){
        return destinationAirport;
    }


    enum TripType {
        ONE_WAY,RETURN
    }
    public void setTripType(String str2){
       if(str2.equals("1"))
       FlightBooking.tripType = TripType.ONE_WAY;
       if(str2.equals("2")){
        FlightBooking.tripType = TripType.RETURN;
       }
    }
    public TripType getTripType(){
        return tripType;
    }
    enum TripDestination{
        Nanjing, BEIJING, Shanghai, Oulu, Helsinki, Paris
    }
    public void setTripDestination(String str2, String str3){
        if(str3.equals("1"))
        FlightBooking.tripDestination = TripDestination.Nanjing;
        if(str3.equals("2"))
        FlightBooking.tripDestination = TripDestination.BEIJING;
        if(str3.equals("3"))
        FlightBooking.tripDestination = TripDestination.Oulu;
        if(str3.equals("4"))
        FlightBooking.tripDestination = TripDestination.Helsinki;
     }
     public TripDestination getTripDestination(){
         return tripDestination;
     }
  

    public FlightBooking(int size) {
        FlightBooking.asd = size;
    }
    

    public void setPassengerFullName(int i, String name){
       passengerFullName[i] = name;
    }

    public String getPassengerFullName(int j){
         return passengerFullName[j];
    }
    public void setPassengerGender(int i, String Gender){
        passengerGender[i] = Gender;
     }
 
     public String getPassengerGender(int j){
          return passengerGender[j];
     }
     public void setPassengerAge(int i, int Age){
        passengerAge[i] = Age;
     }
 
     public int getPassengerAge(int j){
          return passengerAge[j];
     }

    public String getFlightCompany(){
        return flightCompany;
    } 
  
    public LocalDate getDepartingDate(){
        return FlightBooking.departureDate;
    }
    public void setDepartureDate(LocalDate sskk1){
        FlightBooking.departureDate = sskk1;
    }

    public LocalDate getReturnDate(){
        return FlightBooking.returnDate;
    }
    public void setReturnDate(LocalDate b){
        Period next = Period.between(departureDate,b);
        LocalDate sskk5 = b.plusDays(1);
        LocalDate sskk6 = b.plusDays(2);
        if(next.getDays() == 0){
            FlightBooking.returnDate = sskk6;
        }
        
        if(0< next.getDays() && next.getDays() <2){
            FlightBooking.returnDate = sskk5;
        }
        if(next.getDays() >2){
            FlightBooking.returnDate = b;
        }
    }

    public int getAdultPassengers(){
        return adultPassengers;
    }

    public int getChildrenPassengers(){
        return childPassengers;
    }

    public int getTotalPassengers(){
        return totalPassengers;
    }
    public void setTotalPassengers(int childPassengers,int adultPassengers){
       FlightBooking.totalPassengers = childPassengers+adultPassengers;
    }

    public void setTotalTicketPrice( ){
       
            if(tripType.equals(TripType.RETURN)){
                FlightBooking.totalTicketPrice = departingTicketPrice+returnTicketPrice;}
                if(tripType.equals(TripType.ONE_WAY)){
                    FlightBooking.totalTicketPrice = departingTicketPrice;  
                    }
    }
    public double getTotalTicketPrice(){
        
        return totalTicketPrice;
    }

    public double getDepartingTicketPrice(){
        return departingTicketPrice;
    }
    public void setDepartingTicketPrice(int childPassengers, int adultPassengers){
        if(tripSource.equals(TripSource.NANJING)&&tripDestination.equals(TripDestination.BEIJING)||tripSource.equals(TripSource.BEIJING)&&tripDestination.equals(TripDestination.Nanjing)||tripSource.equals(TripSource.Helsinki)&&tripDestination.equals(TripDestination.Oulu)||tripSource.equals(TripSource.Oulu)&&tripDestination.equals(TripDestination.Helsinki)){
           double price = 345; if(bookingClass.equals(BookingClass.FIRST)){
            double price2 = 250; FlightBooking.departingTicketPrice = (childPassengers + adultPassengers) * (price+price2);
         }
         if(bookingClass.equals(BookingClass.Business)){
            double price2 = 150; FlightBooking.departingTicketPrice = (childPassengers + adultPassengers) * (price+price2);
         }
         if(bookingClass.equals(BookingClass.Economy)){
            double price2 = 50;FlightBooking.departingTicketPrice = (childPassengers + adultPassengers) * (price+price2);  }
          }
          if(tripSource.equals(TripSource.NANJING)&&tripDestination.equals(TripDestination.Helsinki)||tripSource.equals(TripSource.NANJING)&&tripDestination.equals(TripDestination.Oulu)||tripSource.equals(TripSource.BEIJING)&&tripDestination.equals(TripDestination.Helsinki)||tripSource.equals(TripSource.BEIJING)&&tripDestination.equals(TripDestination.Oulu)||tripSource.equals(TripSource.Helsinki)&&tripDestination.equals(TripDestination.BEIJING)||tripSource.equals(TripSource.Helsinki)&&tripDestination.equals(TripDestination.Nanjing)||tripSource.equals(TripSource.Oulu)&&tripDestination.equals(TripDestination.BEIJING)||tripSource.equals(TripSource.Oulu)&&tripDestination.equals(TripDestination.Nanjing)){
           double price = 375;if(bookingClass.equals(BookingClass.FIRST)){
            double price2 = 250; FlightBooking.departingTicketPrice = (childPassengers + adultPassengers) * (price+price2);
         }
         if(bookingClass.equals(BookingClass.Business)){
            double price2 = 150; FlightBooking.departingTicketPrice = (childPassengers + adultPassengers) * (price+price2);
         }
         if(bookingClass.equals(BookingClass.Economy)){
            double price2 = 50;FlightBooking.departingTicketPrice = (childPassengers + adultPassengers) * (price+price2);  }
          }
      
    }

    public double getReturnTicketPrice(){
        return returnTicketPrice;
    }
    public void setReturnTicketPrice(){
    FlightBooking.returnTicketPrice = departingTicketPrice;
       
    }
    public String getTicketNumber(){
        if(tripType.equals(TripType.ONE_WAY)&&bookingClass.equals(BookingClass.FIRST)){
            x = "11F";
        }
        if(tripType.equals(TripType.ONE_WAY)&&bookingClass.equals(BookingClass.Business)){
            x = "11B";
        }
        if(tripType.equals(TripType.ONE_WAY)&&bookingClass.equals(BookingClass.Economy)){
            x = "11E";
        }
        if(tripType.equals(TripType.RETURN)&&bookingClass.equals(BookingClass.FIRST)){
            x = "22F";
        }
        if(tripType.equals(TripType.RETURN)&&bookingClass.equals(BookingClass.Business)){
            x = "22B";
        }
        if(tripType.equals(TripType.RETURN)&&bookingClass.equals(BookingClass.Economy)){
            x = "22E";
        }
        if(tripSource.equals(TripSource.NANJING)&&tripDestination.equals(TripDestination.BEIJING)||tripSource.equals(TripSource.BEIJING)&&tripDestination.equals(TripDestination.Nanjing)||tripSource.equals(TripSource.Helsinki)&&tripDestination.equals(TripDestination.Oulu)||tripSource.equals(TripSource.Oulu)&&tripDestination.equals(TripDestination.Helsinki)){
            y = "DOM";
          }
          if(tripSource.equals(TripSource.NANJING)&&tripDestination.equals(TripDestination.Helsinki)||tripSource.equals(TripSource.NANJING)&&tripDestination.equals(TripDestination.Oulu)||tripSource.equals(TripSource.BEIJING)&&tripDestination.equals(TripDestination.Helsinki)||tripSource.equals(TripSource.BEIJING)&&tripDestination.equals(TripDestination.Oulu)||tripSource.equals(TripSource.Helsinki)&&tripDestination.equals(TripDestination.BEIJING)||tripSource.equals(TripSource.Helsinki)&&tripDestination.equals(TripDestination.Nanjing)||tripSource.equals(TripSource.Oulu)&&tripDestination.equals(TripDestination.BEIJING)||tripSource.equals(TripSource.Oulu)&&tripDestination.equals(TripDestination.Nanjing)){
             y = "INT";
          }


        String kk =creatTnumber(4);
        FlightBooking.ticketNumber = x + kk + y ;
        return FlightBooking.ticketNumber;
    }
    public void setTicketNumber(int a){
        if(tripType.equals(TripType.ONE_WAY)&&bookingClass.equals(BookingClass.FIRST)){
            x = "11F";
        }
        if(tripType.equals(TripType.ONE_WAY)&&bookingClass.equals(BookingClass.Business)){
            x = "11B";
        }
        if(tripType.equals(TripType.ONE_WAY)&&bookingClass.equals(BookingClass.Economy)){
            x = "11E";
        }
        if(tripType.equals(TripType.RETURN)&&bookingClass.equals(BookingClass.FIRST)){
            x = "22F";
        }
        if(tripType.equals(TripType.RETURN)&&bookingClass.equals(BookingClass.Business)){
            x = "22B";
        }
        if(tripType.equals(TripType.RETURN)&&bookingClass.equals(BookingClass.Economy)){
            x = "22E";
        }
        if(tripSource.equals(TripSource.NANJING)&&tripDestination.equals(TripDestination.BEIJING)||tripSource.equals(TripSource.BEIJING)&&tripDestination.equals(TripDestination.Nanjing)||tripSource.equals(TripSource.Helsinki)&&tripDestination.equals(TripDestination.Oulu)||tripSource.equals(TripSource.Oulu)&&tripDestination.equals(TripDestination.Helsinki)){
            y = "DOM";
          }
          if(tripSource.equals(TripSource.NANJING)&&tripDestination.equals(TripDestination.Helsinki)||tripSource.equals(TripSource.NANJING)&&tripDestination.equals(TripDestination.Oulu)||tripSource.equals(TripSource.BEIJING)&&tripDestination.equals(TripDestination.Helsinki)||tripSource.equals(TripSource.BEIJING)&&tripDestination.equals(TripDestination.Oulu)||tripSource.equals(TripSource.Helsinki)&&tripDestination.equals(TripDestination.BEIJING)||tripSource.equals(TripSource.Helsinki)&&tripDestination.equals(TripDestination.Nanjing)||tripSource.equals(TripSource.Oulu)&&tripDestination.equals(TripDestination.BEIJING)||tripSource.equals(TripSource.Oulu)&&tripDestination.equals(TripDestination.Nanjing)){
             y = "INT";
          }


        String kk =creatTnumber(4);
        FlightBooking.ticketNumber = x + kk + y ;
    }
    
   
    public String toString(){
        return "Dear " + passengerFullName + ". Thank you for booking your flight with " + 
        flightCompany + ". Following are the details of your booking and the trip:" + "\n" + 
        "Ticket Number: " +  ticketNumber + "\n" + 
        "From " + tripSource + " to " + tripDestination + "\n" +
        "Date of departure: " + departureDate + "\n" +
        "Date of return: " + returnDate + "\n" +
        "Total passengers: " + totalPassengers + "\n" +
        "Total ticket price in Euros: " + totalTicketPrice;
       }


    public void gety(String kk) {
    }
    public static String creatTnumber(int n){
        String codes="";
        Random r=new Random();
        for(int i=0;i<4;i++){
            int num=r.nextInt(3);
			switch(num) {
			case 0:
            codes+=r.nextInt(10);
			break;
			case 1:
            char ch1=(char)(r.nextInt(26)+65);
				codes+=ch1;
				break;
			case 2:
            char ch2=(char)(r.nextInt(26)+97);
				codes+=ch2;
				break;
			}
		}
		return codes;
	}

    
   
       
}


