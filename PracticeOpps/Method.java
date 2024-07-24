 // 1. Method Overloading : changing no. of Arguments 
 // 2. Method Overloading : changing data Type of arguments 

 class Adder{
    static int add(int a, int b){return a+b;}
   // static double add(int a, int b){return a+b;}
//     Compile by: javac TestOverloading2.java

// stOverloading2.java:3: error: method add(int,int) is already defined in class Adder
        // Just By changing the Method return Type it will give error 

        static double add(double a, double b){ return a+b; } // It is Applicable , It will sucessfully execute
    }
    class TestOverloading2{
    public static void main(String[] args){
    System.out.println(Adder.add(11,11));
    System.out.println(Adder.add(12.0,12.0));
    }}
    