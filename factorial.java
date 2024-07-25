import java.util.*;

public class factorial {
    
    public static void main(String[] args) {
        int fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        for (int i = N; i >= 1; i--){
    fact=fact*i;
} 
    System.out.println("Factorial is = "+fact);
}
}


