
class inhert2 {

    public static void main(String args[]) {
        A ob= new A();
        ob.sub();
        ob.mult();
        ob.add();
        ob.divide();
        ob.show();
        
        
    }
}
class D{
    int a=50;
    int b=30;
public void mult(){
System.out.println("The multiplication is "+a*b);
}

}

class C extends D{
public void add(){
System.out.println("The addition is "+(a+b));
}

}

class B extends C{
public void divide(){
System.out.println("The division is "+a/b);
}
}
interface E{
void show();
}
class A extends B implements E{

    public void show(){
        System.out.println("This is what we create in bit");
    }
    public void sub(){
    
    int su=a-b;
    System.out.println("the substraction is "+su);
    }
}
//the substraction is 20
//The multiplication is 1500
//The addition is 80
//The division is 1
//This is what we create in bit
