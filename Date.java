public class Date {
    private int year;
    private int month;
    private int day;

    public Date(){
        this.year = 2000;
        this.month = 1;
        this.day = 1;
    }

    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    //setters
    public void setYear(int year){
        this.year=year;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setDay(int day){
        this.day=day;
    }
    
    //getters
    public int getYear(){
        return this.year;
    }
    public int getMonth(){
        return this.month;
    }
    public int getDay(){
        return this.day;
    }

    //To String
    public String toString(){
        return "Date is : "+this.getDay()+" / "+this.getMonth()+" / "+this.getYear();
    }
}
