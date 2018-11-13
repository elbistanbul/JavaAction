
import java.util.Scanner;

public class Main {

 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashTable table = new HashTable();
        table.createArray();
        String word;
        while(true){
            System.out.println("SEARCH WORD:");
            word = scanner.nextLine();
            table.search(word);
        }
        
        

        

    }
    
}
