package baekjoon.chap1;

import java.util.ArrayList;
import java.util.Scanner;

public class Num11719 
{
	public static void main(String[] args) 
	{
        Scanner scan= new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
         
    
        while (scan.hasNextLine())
        {
            String word = scan.nextLine();
            if (word.length()>100) 
            {
                break;
            }
            words.add(word);
        }
        scan.close();
 
        for (int i = 0; i < words.size(); i++) 
        {
            System.out.println(words.get(i));
        }
        
	}
}


