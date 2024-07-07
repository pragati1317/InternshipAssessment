// newInstance Method is cdeprecated after Java 9 
class Employee{
  int id; 
  String name; 

  Employee(int id, String name){
    this.id=id;
    this.name=name;
  }
}
// only One Class Can be Public { Main file name class can be public }
public class DiffWaysObjects {
  
    public static void main(String[] args){

        try{
       
          Class e=Class.forName("Employee"); 
          @SuppressWarnings("deprecation")
          // newInstance is Deprecated , Hence using a method to handle that deprecated function
          Employee obj=(Employee)e.newInstance();

          System.out.println(obj.name+" "+obj.id);
        }
        catch(ClassNotFoundException e){
           e.printStackTrace();
        }
        catch (InstantiationException e){
            e.printStackTrace();
        }
        catch ( IllegalAccessException e){
          e.printStackTrace();
        }
    }
}
