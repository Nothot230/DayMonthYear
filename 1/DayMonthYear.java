public class DayMonthYear {
    private String day, month, year;
    private int numberofday, numofmonth;


    public void  setDay(String day){
        this.day = day;
    }
    public String getDay(){
        return day;
    }

    public void setMonth(String month){
        this.month = month;
    }
    public String getMonth(){
        return month;
    }

    public void setYear(String year){
        this.year = year;
    }
    public String getYear(){
        return year;
    }

    public void show(){
        System.out.println("Year: ");
        System.out.println("Month: ");
        System.out.println("Day: ");
    }

    
    public int calculateAmountofDay(String d, String m, String y){
        m = m.toLowerCase();
        Integer numd, numy;
        numd = Integer.parseInt(d);
        numy = Integer.parseInt(y);
        String[] mm = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
        int mtoint=0;
        int monthtoday = 0;
        boolean leap;
        for(int i = 1; i <= mm.length-1; i++){
            if(m.equals(mm[i])){
                mtoint = i+1;
                
            }
        }
        if(numy % 4 == 0 && numy % 100 != 0 || numy % 400 == 0){
            leap = true;
        }else{
            leap = false;
        }
        for(int i = 1;i < mtoint;i++){
            if(i % 2 != 0){
                monthtoday += 31;
            }
            if(i % 2 == 0 && i != 2){
                monthtoday += 30;
            }
            if(i == 2 && leap == true){
                monthtoday += 29;
            }
            if(i == 2 && leap == false){
                monthtoday += 28;
            
            }
    
        }

        

        int totalday = monthtoday + numd;

        return totalday;
        
    }

    public int calculateAmountofMonth(String d, String m, String y){
        m = m.toLowerCase();
        String[] mm = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
        int mtoint=0;
        for(int i = 1; i <= mm.length-1; i++){
            if(m.equals(mm[i])){
                mtoint = i+1;
                
            }
        }
        return mtoint;
    }
}
