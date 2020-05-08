package softwarequality;

public class HW4 {
  int year,month,day;
  public String nextDate(int y,int m,int d) throws Exception {
    year = y;
    month = m;
    day = d;
    int Ytype = -1; //1秥0キ
    
    //玡竚矪瞶
    if(month>=12 || month<=0) {
      throw new Exception("Month Error");
    }
    if(day>=31 || day<=0) {
      throw new Exception("Day Error");
    }
    
    //耞
    if(year>=1812 && year<=2012) {
      if(y==1900 || y%4!=0) {
        Ytype = 0;
      }
      else if(year!=1900 && year%4==0) {
        Ytype = 1;
      }
      //る耞
      if(month!=2) {    //ぃ琌る
        //ら计31る
        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
          //ぱ计耞
          if(day<=30) {
            Day_Plus();
          }
          else if(day==31 && month==12){
            Reset_day();
            Reset_month();
            year+=1;
          }
          else if(day==31 && month<=12) {
            Month_Plus();
            Day_Plus();
          }
        }
        else{           //ら计30る
          //ぱ计耞
          if(day<=29) {
            Day_Plus();
          }
          else if(day==30) {
            Month_Plus();
            Reset_day();
          }
        }
      }
      else if(month==2 && Ytype==1) {   //る秥
        //ぱ计耞
        if(day>29) {
          throw new Exception("Error of Month=2 and day>29,must be day<=29");
        }
        else if(day==29) {
          Reset_day();
          Month_Plus();
        }
        else if(day>=1 && day<=28){
          Day_Plus();
        }
      }
      else if(month==2 && Ytype==0) {   //るぃ秥
      //ぱ计耞
        if(day>28) {
          throw new Exception("Error of Month=2 and day>29,must be day<=28");
        }
        else if(day==28) {
          Reset_day();
          Month_Plus();
        }
        else if(day>=1 && day<=27){
          Day_Plus();
        }
      }
    }
    else {
      throw new Exception("Year Over");
    }
    
    assert year<=2012 && year>=1812:"Year Error";
    assert month<=12 && month>=1:"Month Error";
    assert day<=31 && day>=1:"Day Error";
    
    return Integer.toString(year)+"/"+Integer.toString(month)+"/"+Integer.toString(day);
  }

  public void Reset_day() {
    day=1;
  }
  
  public void Reset_month() {
    month=1;
  }
  
  public void Month_Plus() {
    month+=1;
  }
  
  public void Day_Plus() {
    day+=1;
  }
  
}
