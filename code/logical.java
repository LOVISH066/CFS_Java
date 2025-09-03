class logical{
    public static void main(String[] args)
    {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        System.out.println(a&&b); // false - And operator
        System.out.println(a&&c); // true
        System.out.println(!(a&&c)); // false
        System.out.println(a || b); // true
        System.out.println(a || c); // true
    }
}
