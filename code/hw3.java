import java.util.Scanner;

class hw3 {
    public static void main(String[] args) {
        // checking prime number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();

        // calculating factorial
        int fact = 1;
        for(int i = num; i > 0; i--){
            fact = fact * i; // 
        }
        System.out.println(fact);



    }
}
