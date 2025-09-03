class ope {
    public static void main(String[] args)
    {
        int a = 5;
        int b = 7;
        int res = a++ + ++b - --a + b++ - a++;
        //        5.   + 8 -  5   + 8.  -  5 = 11 ans
        System.out.println(res);
    }    
}
