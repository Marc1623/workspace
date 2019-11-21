package main;

public class TwosComplement {

    public static void main(String[] args) {
       boolean isOk = addOverflow(2147483646,5);
       System.out.println(2147483646+32);
       System.out.println(isOk);
    }
    public static boolean addOverflow(int x, int y){

        boolean testPass = false;
        int t;
        try
        {
            t=x+y;
            t=x-y;
            t=y+x;
            t=y-x;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Bouu");
            throw e; // rethrowing the exception
        }

        return true;
    }

}
