// Now what is deserialize , serialize
// ----> Serialize is a machanism of converting the state of an Object into a Bute stream. Deserialize is the reverse process of serialize.
// Serialize --> Object to ByteStream 

// To create a Object with Serialization 
// Implementing Serializable Interface
import java.io.*; 

public class Object_deserialize implements Serializable {
    
    private String name; 
    Object_deserialize(String name){
        this.name=name; 
    }
    public static void main(String[] args){
        
        try{
             Object_deserialize obj1=new Object_deserialize("ProgressiveArt"); 

             FileOutputStream f=new FileOutputStream("ouput.txt"); 
             ObjectOutputStream oos=new ObjectOutputStream(f); 
             oos.writeObject(obj1); 
             oos.close(); 

             f.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}







