 import java.util.Scanner;//this is for importing scanner
 class dowhileloop2//this is class name which is called dowhileloop2.
{
    public static void main(String arg[])////this is  main function in java programming which help ststement to be executed.
    {
        Scanner m=new Scanner(System.in);//this is statement which allowing user to enter any number
        int i;// variable declaration
        do {//staement which command to excute these statements
            System.out.println("enter a number between 1 and 20:");//this is statement which will help to display this words into quotations
            i=m.nextInt();//for INCREMENT
        }
        while(i<1 || i>20);//this is loop  which help to  repeat the statement under do.
        System.out.println(i+"  is between 1 and 20");//this is statement which will display this things in bracket.if number is between 1 and 20
    }
}