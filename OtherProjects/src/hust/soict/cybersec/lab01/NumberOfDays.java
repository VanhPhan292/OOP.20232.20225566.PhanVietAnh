package hust.soict.cybersec.lab01;



import java.util.Scanner;

class dateTime{
    private int month;
    private int year;

    public dateTime(int month, int year) {
        this.month = month;
        this.year = year;
    }
    private int setNumOfDays(){
        int buffer  = 0;
        if ((this.year%4==0&&this.year%400!=0)||(this.year%100==0)){
            buffer +=1;
        }
        switch(this.month){
            case 1 -> {
                return 31;
            }
            case 2 -> {
                return 28 +buffer;
            }
            case 3 -> {
                return 31;
            }
            case 4 -> {
                return 30;
            }
            case 5 -> {
                return 31;
            }
            case 6 -> {
                return 30;
            }
            case 7 -> {
                return 31;
            }
            case 8 -> {
                return 31;
            }
            case 9 -> {
                return 30;
            }
            case 10 -> {
                return 31;
            }
            case 11 -> {
                return 30;
            }
            case 12 -> {
                return 31;
            }
        }
        return 0;
    }
    public void getNumOfDays(){
        System.out.println(this.setNumOfDays());
    }
}
public class NumberOfDays {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int month  = cin.nextInt();
        int year = cin.nextInt();
        dateTime dt = new dateTime(month,year);
        dt.getNumOfDays();
    }
}