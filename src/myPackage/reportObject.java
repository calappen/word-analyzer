/** This Class is designed to create a single history report object **/ 

package myPackage;

public class reportObject
{
    private String name;
    private String date; 
    private String content; 
    private String directory; 
    
    /** Constructor: creates a single report object **/
    public reportObject(String fileName, String fileDate, String fileContent, String fileDirectory)
    {
        name = fileName; 
        date = fileDate;
        content = fileContent;
        directory = fileDirectory; 
    }
    
    public String getName()
    {
        return name; 
    }
    
    public String getDate()
    {
        return date; 
    }
    
    public String getContent()
    {
        return content; 
    }

    public String getDirectory()
    {
        return directory; 
    }
    
    /** Constructs the display text for a single report object **/
    public String displayReportObject()
    {
        String display = "";
        
        display += "\r\nFile Name: \t" + getName() + "\r\n";
        display += "File Date: \t" + getDate() + "\r\n";
        display += "File Directory: \t" + getDirectory() + "\r\n";
        display += "File Content: \r\n\r\n" + getContent() + "\r\n";
            
        return display;
    }
}

