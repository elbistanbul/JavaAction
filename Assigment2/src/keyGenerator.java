
import java.io.FileNotFoundException;
import java.util.Scanner;


public class keyGenerator {
    
    
    public static void Filereader(){
      int count = 0;
        BrentMethod insert = new BrentMethod();
          try{
            Scanner scanner = new Scanner(new java.io.FileReader("story.txt"));
            while (scanner.hasNext()){
                String word = scanner.next();
                word = word.toLowerCase();
                System.out.println(word);
                count++;
                long key = keyGenerator.hashFunc(word);
                System.out.println(key);
                BrentMethod.insert(key);
                
                
            }
             //System.out.println(count);
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found !!!");
        }
        
    }
    
    public static long hashFunc(String x) {
        char ch[];
        ch = x.toCharArray();
        int xlength = x.length();

        int i;
        long sum;
        int a = 2;
        for (sum=1, i=0; i < x.length(); i++){
            sum += ((long)(ch[i])*Math.pow((long)primeNumber(a), 3));
            a = primeNumber(a);
            //System.out.println(mul);
        }
        return (long)(sum);
    }
    
    
        public static int primeNumber(int i){
         int num =0;
        //Empty String
        //String  primeNumbers = "";

        for (i++; i <= 100; i++)
        {
            int counter=0;
            for(num = i; num>=1; num--){
                if(i%num==0)counter = counter + 1;
            }
            
            if (counter ==2) return i;
            
        }
        System.out.println(i);
        return 1;
    }
}
