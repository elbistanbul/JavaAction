
public class BrentMethod {
       
    public static int SIZE = 5000;
    public static long key;
    
    public static long HashTable []= new long[SIZE];
    
    public static int HashKey(long key){
        long hashKey = key % SIZE;
        return (int) hashKey;
    }
    
    public static int incrementKey (long location){
        long incremented_key = (location / SIZE) % SIZE;
        return (int) incremented_key;
    }
    
    public static void insert (long key) {
        
        
        int address = HashKey(key);
        int depth = 0;
        
        while( HashTable[address] != 0){
            address += incrementKey(key);
            depth++;
            return;
        }
        
        if (depth < 2){
            HashTable[address] = key;   
        }
        else {
            address = HashKey(key);
            for (int i = 0; i < depth; i++){
                int address2 = address + incrementKey(HashTable[address]);
                int depth2 = 0;
                 while((depth2 <= i)&& HashTable[address2] != 0){
                     address2 = address + incrementKey(HashTable[address]);
                     depth2++;
                 }
                 if (depth2 <= i){
                     HashTable [address2] = HashTable[address];
                     return;
                 }
                 address = address + incrementKey(key);
            }
            
            HashTable[address] = key;
        }
        for (long a: HashTable) System.out.println(a);
        
}
}
