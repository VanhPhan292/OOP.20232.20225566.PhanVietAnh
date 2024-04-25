package hust.soict.cybersec.lab01;
import java.util.Scanner;

class Star{
    private int n;

    public Star(int n) {
        this.n = n;
    }
    private void printSpace(int sp){
        for(int i=0;i<n-sp-1;i++){
            System.out.print(" ");
        }
    }
    private void printStar(int st){
        for(int i=0;i<2*st+1;i++){
            System.out.print("*");
        }
    }
    public void print(){
        for(int i=0;i<this.n;i++){
            this.printSpace(i);
            this.printStar(i);
            this.printSpace(i);
            System.out.println("");
        }
    }
}
public class DisplayTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Star st = new Star(n);
        st.print();
    }
}