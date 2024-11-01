import java.util.*;

public class hashing {
    public static char maxfrequency(String str){
        str=str.toLowerCase(); // pure string ko lowercase mein convert kardiya taki barobar count mile
        HashMap<Character,Integer>map=new HashMap<>(); // ek hash map banaya 
        String vowels="aeiou";// string mein vowels store kiya 
        for (char vowel : vowels.toCharArray()) { //jo vowels string mein the unko character mein convert kardiya
            map.put(vowel,0); //hashmap mein vowels ko store karke value 0 kardiya sab character ka 
        }
        for (char ch : str.toCharArray()) { //input string ko character mein convert kardiya 
            if (map.containsKey(ch)) { // hashmap mein vowels sein compare karke rahe hai 
                map.put(ch,map.get(ch)+1); //if match then vo vowel ko store karke uske value ko +1 kardega
            }
        }

        char maxVowel=' ';
        int maxCount=0;
        
        for(Map.Entry<Character, Integer> count:map.entrySet()){ // for each used for iterating every key value of hashmap 
            if (count.getValue() > maxCount) { // 
                maxCount = count.getValue() ;
                maxVowel = count.getKey();
            }
        }

        return maxCount >0 ? maxVowel : ' ';

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        char result = maxfrequency(s);

        if (result != ' ') {
            System.out.println("highest frequency :"+result);
        } else {
            System.out.println("there are no vowel in the string");
        }
        
    }
}
