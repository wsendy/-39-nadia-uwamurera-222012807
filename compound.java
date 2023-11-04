
  class interest
{
    public void calculate(int p,double r,int n)
    {
int t;
for(t=1;t<=3;t++){
  System.out.println("the compound interest at year "+t +" is :"+p*math.pow((1+r/n),n*t));
  
}
return p*math.pow((1+r/n),n*t);
     
    }
  }
  public class compound{

public static void main(String arg[])
{
interest data=new interest();
double result;
result=data.calculate(500000,0.18,12);
System.out.println("the compound interest is:" +result);
}
    }

        
    