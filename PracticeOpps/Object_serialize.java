// Now what is deserialize , serialize
// ----> Serialize is a machanism of converting the state of an Object into a Bute stream. Deserialize is the reverse process of serialize.
// Serialize --> Object to ByteStream 

// To create a Object with Serialization 
// Implementing Serializable Interface
import java.io.*; 

public class Object_serialize  {
// implements Serializable {
    
    private String name; 
    Object_serialize(String name){
        this.name=name; 
    }
    public static void main(String[] args){
        
        try{
            //  Object_serialize obj1=new Object_serialize("ProgressiveArt"); 

            //  FileOutputStream f=new FileOutputStream("ouput.txt"); 
            //  ObjectOutputStream oos=new ObjectOutputStream(f); 
            //  oos.writeObject(obj1); 
            //  oos.close(); 

            //  f.close();
            Object_serialize obj1;

            FileInputStream f=new FileInputStream("PracticeOpps/ouput.txt"); 

            ObjectInputStream oos =new ObjectInputStream(f); 
            obj1= (Object_serialize)oos.readObject();
            System.err.println(obj1 + " Here is our Deserialized Object");
          
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}







