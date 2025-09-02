import java.util.Scanner;

class input {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Name");
        String Fname = sc.next();

        System.out.println();
        System.out.println("Enter Second Name");
        String Sname = sc.next();

        //concating string 
        String fullName = Fname + " "+ Sname;
        System.out.println(fullName);
        
    }    
    
}
