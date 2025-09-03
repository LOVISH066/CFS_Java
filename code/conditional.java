class conditional {
    public static void main(String[] args) {
        int a = 11;
        int b = 20;
        b=(a==11)? 30:40;
        System.out.println(b);// 30-true

        b=(a!=10)? 30:40; // true 30
        System.out.println(b);
    }
}
