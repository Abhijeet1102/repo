import java.util.*;
public class repo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
         int n = sc.nextInt();  
         String type = (n % 2 == 0) ? "Even" : "Odd";
         System.out.println("The number is : " + type);
        // int i=1;
        // while(i<=n){
        //     System.out.println(i);
        //     i++;
            
        // }
    }
}
