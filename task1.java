import java.util.Scanner;
public class task1{
         public static void main(String[] args) {
                 Scanner input = new Scanner(System.in);
                 System.out.print("the start number is: ");int start = input.nextInt();
                 System.out.print("the end number is: ");int end = input.nextInt();
                 if (start <= end){
                     int sum = 0;
                     for (int counter = start;counter <= end;counter++){
                         sum = counter+counter++;
                     }
                     System.out.printf("the total is %d", sum);
                 }
                 else {
                     System.out.print("the start number is larger than the end number");
                 }
         }
}
