
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class HashTable {
    private List<ArrayList<HashEntry>> list = new ArrayList<ArrayList<HashEntry>>();

    public List<ArrayList<HashEntry>> getList() {
        return list;
    }

    public void setList(List<ArrayList<HashEntry>> list) {
        this.list = list;
    }
 
    public void search(String key){
        HashEntry hashEntry = new HashEntry(key);
        long value = hashEntry.getKey();
        
        int i=0, j=0;
        for(ArrayList<HashEntry> entryList : list){
            if(!entryList.isEmpty() && entryList.get(0).getKey() == value){
                for(HashEntry entry : entryList){
                    if(entry.getValue().equals(key)){
                        System.out.println(entry.toString()+ "\n------------");
                        //System.out.println("Index : [" + i + "," + j + "]\n\n");
                        return;
                    }
                    j++;
                }
            }
            i++;
        }
        System.err.println("Word is not found\n\n");
    }
    
    private void insert(HashEntry entry){
        long value = entry.getKey();
        for(ArrayList<HashEntry> entryList : list){
            if(!entryList.isEmpty() && entryList.get(0).getKey() == value){
                for(HashEntry hashEntry : entryList){
                    if(hashEntry.getValue().equals(entry.getValue())){
                        hashEntry.setCount(hashEntry.getCount() + 1);
                        return;
                    }
                }
                entryList.add(entry);
                return;
            }
        }
        ArrayList<HashEntry> newEntrylist = new ArrayList<HashEntry>();
        newEntrylist.add(entry);
        list.add(newEntrylist);
    }

    public void createArray (){
        int countword= 0;
        try{
            Scanner scanner = new Scanner(new FileReader("story.txt"));
            while (scanner.hasNext()){
                String word = scanner.next();
                word = word.toLowerCase();
                HashEntry entry = new HashEntry(word);
                insert(entry);
                countword++;
            }
            System.out.println("Number of Contents:" + countword);
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found !!!");
        }
        
    }
}
