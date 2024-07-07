import java.lang.CloneNotSupportedException;
import java.lang.Cloneable;
    
 class CreateObjectExample3 implements Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // invokes the clone() method of the super class
        return super.clone();
    }
    // Declaring and initializing string 
    String name="GameOnBaby"; 
    int score; 

    CreateObjectExample3(int score, String name){
           this.score=score; 
           this.name=name; 
    }
}

public class ObjectUsingClone{

   public static void main(String[] args){
        // creating an object of the class
        CreateObjectExample3 obj1 = new CreateObjectExample3(45,"LetsStart");

        try {
            CreateObjectExample3 obj2 = (CreateObjectExample3) obj1.clone();
            // Print statements to verify cloning
            System.out.println("Object 1: " + obj1.name);
            System.out.println("Object 2 (Cloned): " + obj2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
