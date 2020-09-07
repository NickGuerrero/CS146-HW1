import java.io.*;

/**
 * Greeting Homework Assignment
 * 
 * Very straightfoward program that parses through a text file, and prints
 * the text. A message can be added by changing the message variable here
 * and adding the appropriate @ symbol to place it dynamically. Other
 * symbols are used to help the image look nicer.
 * 
 * External Sources: Java 7 Documentation for FileReader
 * 
 * @author Nicolas Guerrero
 */

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
        
        // Interpret and read the text file
        FileReader reader = new FileReader("dragon.txt");
        int ch = reader.read();
        while(ch != -1){
            switch((char) ch){
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
                    System.out.print((char) ch);
                    break;
            }
            ch = reader.read();
        }
        reader.close();
    }
}