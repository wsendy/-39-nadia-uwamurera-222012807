     class Loans {//class name which is called loans
     public double CalculateLoans (double P, double r, int n, int Y) {//method with arguments which will help to calculate compound interest
          return (P * Math.pow(1 + r / n, n * Y));//return type to calculate compound interest  
     }
}
        public class compound1 {//class name2 which is called compound1
        public static void main(String[] args) {//main function which help in execution
        Loans myLoans = new Loans() ;//creation of object
        double result = myLoans.CalculateLoans (500000, 0.18, 12, 3) ;//calling method to calculate compound interest
       System.out.println("Mr Bob will pay the amount = " + result);//statement to display the amount mr.bob will pay in 3 years.
        }
    }
     

