import java.security.*;
import java.util.*;

public class Myown
{
    String [] alphabet=new String ["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"];
    private String key;
    public static void main(String args[]) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give a phrase");
        String phrase=sc.nextLine();
        setKey();
        System.out.println(encrypt(phrase));
    }
    public static String encrypt(String word)
    {
        String encrypted;
        int mult=int(0,getKey().indexOf("-"));
        int add=int(getKey().indexOf("-"));
        for(int i=0;i<word.length;i++)
        {
            for(int x=0;x<26;x++)
            {
                if(word.substring(i,i+1)==alphabet[x])
                {
                    encrypted=encrypted+(x*mult+add)+" ";
                }
            }
        }
    }
    public static String decrypt(String word)
    {
        String decrypted;
        int mult=int(0,getKey().indexOf("-"));
        int add=int(getKey().indexOf("-"));
        int space=0;
        String focus=(0,word.indexOf(" "));
        for(int i=0;i<word.length;i++)
        {
            if(word.substring(i,i+1)==" ")
            {
                space++;
            }
        }
        
        for(int i=0;i<space;i++)
        {
            // focus
        }
    }
    public static void setKey()
    {
        int x=(int)(Math.random()*999+1);
        int y=(int)(Math.random()*200+1);
        key=x+"-"+y;
    }
    public static void setExistingKey(String x)
    {
        key=x;
    }
    public static String getKey()
    {
        return key;
    }
    
}