 // Using Interface and Default Function to Define the specific Features
interface Desktop{
  public static final boolean mouse=true;
  public static final boolean CPU=true;
  
  default void CPUSize(){
        System.out.println("Cpu is Sperate part and It need Space");
  }
  
}

interface AllinOneSystem{
  public static final boolean mouse=true;
  public static final boolean CPU=true;

  default void CPUSize(){
    System.out.println("Cpu is presnt in Compact Form in the system");
  } 
}
class Laptop implements Desktop, AllinOneSystem{
//  @Overrideverride
    public String color;
    public double LaptopSize=15.5; 
    String LaptopType; 
    public Laptop(String color, double LaptopSize, String type){
        this.color=color;
        this.LaptopSize=LaptopSize;
        this.LaptopType=type;
    }
    public void CPUSize(){
        AllinOneSystem.super.CPUSize();
    }

    void laptopDetails(){
        System.out.println("Laptop Color is: "+ color+" with "+ LaptopSize+" Display Size and Standard "+LaptopType+".");
        System.out.print("CPU Details: ");
        this.CPUSize();
    }
}

public class MultipleInheritance {
    
    public static void main(String args[]){
         
        Laptop hpVictus =new Laptop("black",17.5,"Gaming Laptop");
        hpVictus.CPUSize();
        hpVictus.laptopDetails();
    }
}
