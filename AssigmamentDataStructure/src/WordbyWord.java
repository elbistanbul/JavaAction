
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


public class WordbyWord {

    
    public static int convert (String str){
 
        int sum = 0;
        for (int i = 0; i < str.length(); i++) 
        sum += str.charAt(i);	
        // Storing the sum of last word 
        //System.out.println(sum);
        return sum;
    }
    
    public static void createArray (){
        ArrayList<Integer> keyWord = new ArrayList<Integer>();
        ArrayList<String> wordList = new ArrayList<String>();
        int count = 0;
        try( Scanner scanner = new Scanner(new FileReader("story.txt"))){
            
            while (scanner.hasNext()){
                String word = scanner.next();
                wordList.add(word);
                keyWord.add(convert(word));
                //System.out.println(word);
                count++; 
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found !!!");
        }
        
        System.out.println(count);
        System.out.println("------");
        System.out.println(keyWord.size());
        System.out.println(keyWord);
        System.out.println(wordList);
        

    }
  
}
