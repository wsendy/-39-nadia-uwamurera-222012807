 class obj//this class name1 called obj
{
    public double compute(double p,int t,double r)//method which help to calculate simple interest
    {

    return p*t*r;//return type to calculate simple interest
         
    }

}//close of class1
public class simple{//class name2


    public static void main(String a[])//main function which help in execution
    {
        obj interest=new obj();//creation of object
        double p=100000;//initialization of variables
        int t=5;
        double r=0.05;

        double result=interest.compute(p,t,r);//calling method to calculate simple interest
        System.out.println("the simple interest after "+ t +" years = "+result);//statement to display simple interest of 5 years.
    }
}
    
    
