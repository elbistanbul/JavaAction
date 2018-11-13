
public class HashEntry {
    private long key;
    private String value;
    private int count;
    private static final int HASHSIZE = 5000;

    public HashEntry(String value) {
        this.value = value;
        this.key = hashFunc(value);
        this.count = 1;
    }

    public long getKey() {
        return (long)key;
    }

    public void setKey(long key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Search : " + value + "\n" +
                "Key : " + key + "\n" +
                "Count : " + count;
    }

    long hashFunc(String x) {
        char ch[];
        ch = x.toCharArray();
        int xlength = x.length();

        int i;
        long mul;
        int a = 2;
        for (mul=1, i=0; i < x.length(); i++){
            mul += ((long)(ch[i])*Math.pow((long)primeNumber(a), 3));
            a = primeNumber(a);
            //System.out.println(mul);
        }
        return (long)(mul);
    }

    public static int primeNumber(int i){
         int num =0;
        //Empty String
        //String  primeNumbers = "";

        for (i++; i <= 100; i++)
        {
            int counter=0;
            for(num = i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                return i;
            }
        }
        System.out.println(i);
        return 1;
    }
}

