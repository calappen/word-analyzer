/** This Class is designed to handle the storage of history reports **/ 

package myPackage;

import java.util.ArrayList;

public class reportsHandler
{
    private ArrayList<reportObject> reports = new ArrayList<reportObject>(); 
    
    /** Adds a new analysis file content as a report object to the list of reports **/
    public void addReport(String name, String date, String content, String directory)
    {
        reportObject report = new reportObject(name, date, content, directory);
        reports.add(report);
    }
    
    /** Constructs the text to be displayed in the HistoryReportFrame **/
    public String displayReports()
    {
        String display = ""; 
        String newLine = "___________________________________________________________________________________________________________\r\n";
        
        for(int i=0; i<reports.size(); i++)
        {
            display += reports.get(i).displayReportObject();
            display += newLine; 
        }
        
        return display;
    }
    
    /** Passes the report array for faster access **/
    public ArrayList<reportObject> getReportsArray()
    {
        return reports; 
    }
}

