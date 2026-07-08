class CountOfDigits{
    static int cod(int n){
        if(n<10)
            return 1;
        return 1+cod(n/10);
    }
    public static void main(String args[])
    {
        int number= 12345;
        System.out.println("Count of digits ="+cod(number));
    }
}