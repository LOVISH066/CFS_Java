package Typesofvar;

public class Instancedemo {

    // here variables arrre instance variable
    String name = "Lovish";

    public static void main(String[] args) {
        // creating object to acces name or instance variable
        Instancedemo obj1 = new Instancedemo();
        System.out.println(obj1.name);

        obj1.name = "vsfvs";
        System.out.println(obj1.name);
        System.out.println("...................................");

        Instancedemo obj2 = new Instancedemo();
        System.out.println(obj2.name);

        // here isntance store the copy of instance vaairbale or for evry object we have separete copy


    }
}
