 class obj
{
    public double compute(double p,int t,double r)
    {

    return p*t*r;
         
    }

}
public class simple{


    public static void main(String a[])
    {
        obj interest=new obj();
        double p=100000;
        int t=5;
        double r=0.05;

        double result=interest.compute(p,t,r);
        System.out.println("the simple interest after "+ t +" years = "+result);
    }
}
    
    
