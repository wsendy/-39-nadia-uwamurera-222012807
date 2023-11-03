public class sum
{
    public  static int addnumber(int num1,int num2)//method help for re-usability
    {
return(num1+num2);
    }

public static void main(String a[])
{
    int number1=5;
    int number2=7;
    int summation=addnumber(number1,number2);
    System.out.println("the sum of "+number1+" and "+number2+" is "+summation);
}
}
