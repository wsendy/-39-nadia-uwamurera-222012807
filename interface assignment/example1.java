class tt{
    public static void main(String args[]){
        A myobj=new A();
        myobj.substract();
        myobj.getdata();
        myobj.multiply();
        myobj.addition();
        myobj.interf();
    }
}

class D{
    int a=5;
    int b=10;

    public void addition(){
        int result=a+b;
        System.out.println(result);
    }
}

class C extends D{
    public static void getdata(){
        System.out.println(" this is bit class");
    }
}
class B extends C{
    public static void multiply(){
        int c=5;
        int d=20;
        int result=d*c;
    }   
}

interface E{
    void interf();
}

class A extends B implements E{
    public void substract(){
        System.out.println(a-b);
    }


    public void interf(){
        System.out.println("we are experts in programming");
    }
}
//the output of this program will be like
//-5
//this is bit class
//15
//we are experts in programming
