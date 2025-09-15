import java.util.Scanner;

class hw2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter brand: ");
        String brand = sc.next();

        switch(brand)
        {
            case "nike":
                System.out.println("nike slogan");
                break;
            case "puma":
                System.out.println("puma slogan");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
