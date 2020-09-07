/**
 *
 *
 *
 */

import java.io.*;
public class GreetingHomework{
    public static void main(String[] args) throws IOException{
        // Prepare for the message
        String greeting = "Hello class";
        int offset = greeting.length();
        StringBuilder tab = new StringBuilder();
        StringBuilder fSlash = new StringBuilder();
        StringBuilder bSlash = new StringBuilder();
        while(offset > 0){
            tab.append(" ");
            fSlash.append("\\");
            bSlash.append("/");
            offset--;
        }
        
        FileReader reader = new FileReader("dragon.txt");
        
        // Set up a buffer loop
        int num = reader.read();
        char ch = (char) num;
        String newline;
        
        while(num != -1){
            switch(ch){
                case '@':
                    System.out.print(greeting);
                    break;
                case ':':
                    System.out.print(fSlash);
                    break;
                case ';':
                    System.out.print(bSlash);
                    break;
                case 't':
                    System.out.print(tab);
                    break;
                default:
                    System.out.print(ch);
                    break;
            }
            num = reader.read();
            if(num > 0){
                ch = (char) num;
            }
        }
        reader.close();
        System.out.println("Status: Okay");
    }
}