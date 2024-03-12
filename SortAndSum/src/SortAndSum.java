
import java.util.Scanner;
import java.util.Arrays;

class myArray{
    private int n;
    private int sum;
    private double average;
    public myArray(int n){
        this.n = n;
    }
    public void solve(){
        Scanner sc  = new Scanner(System.in);
        int[] a = new int[this.n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }
        Arrays.sort(a);
        this.average = (double) this.sum/n;
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        System.out.println("Sum: "+this.sum);
        System.out.println("Average: "+this.average);
    }
}
public class SortAndSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        myArray x = new myArray(n);
        x.solve();
    }
}