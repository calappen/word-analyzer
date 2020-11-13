/** This Class is designed to handle file analysis process **/ 

package myPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;


public class fileHandler
{
    private File analyzedFile;
    private static List<String> analyzedText = new ArrayList<String>(); 
    private Scanner text;
    
    /** Constructor: passes the file to be analyzed **/ 
    public fileHandler(File file)
    {
        analyzedFile = file; 
    }
    
    /** Saves the file content into the String list to be processed **/
    public void saveText() throws FileNotFoundException 
    {
        analyzedText.removeAll(analyzedText);
	text = new Scanner(analyzedFile);
 	while(text.hasNextLine()) 
        {
            analyzedText.add(text.nextLine());
        }
    }
    
    public int countLines()
    {
        return analyzedText.size(); 
    }
    
    public int countBlankLines()
    {
        int count =0; 
        for(String str : analyzedText)
        {
            if(str.equals(""))
            {
                count++; 
            }
        }
        return count; 
    }
 
    public int countWords()
    {
        int count = 0;
        for(String word : analyzedText) 
        {
            if(!word.isEmpty())
            {
            	count += word.split(" ").length;
            }
        }
        return count; 
    }
    
    public int countChar()
    {
        int count = 0;
        for(String word : analyzedText) 
        {
            if(!word.isEmpty())
            {
                for(char c: word.toCharArray())
                {
                    count++; 
                }
            	
            }
        }
        return count; 
    }
    
    public int countSpaces()
    {
        int count = 0;
        for(String word : analyzedText) 
        {
            for(char c: word.toCharArray())
            {
                if(c == ' ')
                {
                    count++;
                }
            }
            
        }
        return count; 
    }
    
    public int countSentences()
    {
        int count = 0;
        for(String word : analyzedText) 
        {
            for(char c: word.toCharArray())
            {
                if(c == '.' || c == '?' || c == '!')
                {
                    count++;
                }
            }
            
        }
        return count; 
    }
    
    public int wordsAve()
    {
        int count = countWords();
        int countLines = countLines() - countBlankLines(); //Only the lines that has words in 
        
        return (count / countLines); //needs actual integer value, not double
    }
    
    public int charAve()
    {
        int count = countChar() - countSpaces(); //all char without spaces 
        int countLines = countLines() - countBlankLines(); //Only the lines that has words in 
        
        return (count / countLines); //needs actual integer value, not double
    }
    
    public static List<String> removePunctuations() throws FileNotFoundException 
    {
        String tempText;
        List<String> newText = new ArrayList<String>();
        ListIterator listIterator = analyzedText.listIterator();

        while(listIterator.hasNext()) 
        {
                tempText = listIterator.next().toString();
                
                for(char c: tempText.toCharArray())
                {
                    if(!Character.isLetterOrDigit(c) && c != ' ')
                    {
                       tempText = tempText.replace(c, '\0'); 
                    }
                }
                newText.add(tempText);
        }
        
        return newText;
    }
    
    public String displayAfterRemovedPunctuations() throws FileNotFoundException
    {
        String textString = "";
        
        List<String> newText = removePunctuations();
        
        for(int i=0; i<newText.size(); i++)
        {
            textString += newText.get(i) + "\n";
        }
        
        return textString; 
    }
    
    public static int lexicalDensity() throws FileNotFoundException {
        int count = 0;
        boolean hasBlankLine = false;
        Set<String> uniqueWords = new HashSet<String>();
        List<String> text = removePunctuations();
        //text.replaceAll(String::toLowerCase);

        for(String s : text) {
                if(s.isEmpty()) {
                        hasBlankLine = true;
                }

                String[] words = s.split("[\\s\\t]");

                for (String word : words) {
                    uniqueWords.add(word);
                }
        }

        count = uniqueWords.size();

        if(hasBlankLine == true && count != 0) {
                count--;
        }

        return count;
    }

    public int aveWordLength()
    {
        return countChar() / countWords(); 
    }
    
    public String mostCommon() throws FileNotFoundException, IOException
    {
        Map<String, Integer> stringsCount = new HashMap<>();
        List<String> analyzedTextRemovedPunctuations = removePunctuations();       
        
        for(String line : analyzedTextRemovedPunctuations)
        {   
            String[] words = line.split(" ");
            for(String word: words)
            {
                Integer c = stringsCount.get(word);
                if(c == null) 
                {
                    c = new Integer(0);
                }
                c++;
                stringsCount.put(word,c);
            }
        }
        
        Map.Entry<String,Integer> mostRepeated = null;
        for(Map.Entry<String, Integer> e: stringsCount.entrySet())
        {
            if(mostRepeated == null || e.getKey() != " " || e.getKey() != "\n" || mostRepeated.getValue() <= e.getValue()) //First time - removes NullPointerException  
            {
                mostRepeated = e;
            }
        }
        
        if(mostRepeated != null)
        {
            return mostRepeated.getKey();
        }
        
        return ""; 
    }
}
