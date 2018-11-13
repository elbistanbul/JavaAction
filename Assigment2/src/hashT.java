//
//public class hashT {
//   public static int size = 5000;
//    public int key ;
//    public String word;
//    public int count;
//
// hashT[] hashT = new hashT[size];
//
//
//        int counter = 0;
//        int i = 1;
//        int j = 1;
//
//        int new_key = getHashKey(word);
//        System.out.println(new_key);
//        int previous_key = new_key;
//        try{
//            while(hashT[new_key].word != null){
//                if(hashT[new_key].word == word) {
//                    counter = counter + 1;
//                }
//                j = j + 1;
//                new_key = new_key + ((new_key / size) % size);
//            }
//            int new_increment = i + j;
//            int increment_key = previous_key;
//            int increment_j = 1;
//
//            if(j != 1) {
//                while (hashT[increment_key].word != null) {
//
//                    increment_j = increment_j + 1;
//                    increment_key = hashT[previous_key].key + (hashT[previous_key].key / size) % size;
//
//                }
//                int old_increment = i + increment_j;
//                if(new_increment <= old_increment){
//                    hashT[new_key].key = new_key;
//                    hashT[new_key].word = word;
//                    hashT[new_key].count = counter;
//                }
//                else{
//                    hashT[increment_key].key = hashT[previous_key].key;
//                    hashT[increment_key].word = hashT[previous_key].word;
//                    hashT[increment_key].count = hashT[previous_key].count;
//                    hashT[previous_key].key = previous_key;
//                    hashT[previous_key].word = word;
//                    hashT[previous_key].count = counter;
//
//                }
//            }
//            else {
//                hashT[new_key].key = new_key;
//                hashT[new_key].word = word;
//                hashT[new_key].count = counter;
//            }
//            //hashT[1].key = getHashKey(word);
//
//            //hashTable[hash[1].key] = hash[1];
//        }catch (NullPointerException exx){
//            exx.printStackTrace();
//        }
//    
//    
//}
