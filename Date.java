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

    public String findTommorrow() {
        int tempyear = this.getYear();
        int tempmonth = this.getMonth();
        int tempday = this.getDay();
        
    
        boolean leapYear;
        if ((tempyear % 400) == 0) {
            leapYear=true;
        } else if ((tempyear % 100) == 0) {
            leapYear=false;
        } else if ((tempyear % 4) == 0) {
            leapYear=true;
        } else {
            leapYear=false;
        } 

        switch (tempmonth) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (tempday == 31) {
                    tempday = 1;
                    tempmonth = (tempmonth % 12) + 1;
                    if (tempmonth == 1)
                        tempyear ++;
                } else {
                    tempday++;
                }
                break;
            case 4: case 6: case 9: case 11:
                if (tempday == 30){
                    tempday = 1;
                    tempmonth ++;
                }
                else{
                    tempday++;
                }
                break;
            case 2:
                if (leapYear && tempday ==29){
                    tempday = 1;
                    tempmonth++;
                }
                else if(!leapYear && tempday == 28){
                    tempday = 1;
                    tempmonth++;
                }
                else {
                    tempday++;
                }
                break;
            default:
                tempday++; 
                break;
        }
        return "Date is : "+tempday+" / "+ tempmonth +" / "+tempyear +" leapyear ="+leapYear;
    }
}
