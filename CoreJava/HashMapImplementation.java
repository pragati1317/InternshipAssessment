import java.util.*; 

public class HashMapImplementation {
    static class HashMap<K,V>{ // generics
      private class Node{
        K key; 
        V value;

        public Node(K key, V value){
            this.key=key; 
            this.value=value; 
        }
    }

    private int n; 
    private int N; 
    private LinkedList<Node> buckets[]; // N=buckets.lebgth

    @SuppressWarnings("unchecked") // Sometimes use of LinkedList Through Warnings, To avoid these Warning use SuppressWarnings

    // constructor to Assign the HashMap array of Linked
    public HashMap(){
        this.N=4; 
        this.buckets=new LinkedList[4]; 
        for(int i=0; i<4; i++){
          this.buckets[i]=new LinkedList<>();
        }
    }
    private int hashFunction(K key){
        return 0;
    }

    public void put(K key , V value){
        int bi=hashFunction(key); 
        int dataIndx=searchInLL(key, bi);  // di=-1

        if(dataIndx==-1){
            // key doesn't exist 
            buckets[bi].add(new Node(key, value)); 
            n++;
        }
        else{
            // key exists
            buckets[bi].get(dataIndx); 
            data.value=value;
        }

        double lambda=(double) n/N; 
        if(lambda>2.0){
            //rehashing
        }
    }

    public boolean containsKey(K key){
       retuan false; 
    }
}

    public static void main (String args[]){

    }
}
