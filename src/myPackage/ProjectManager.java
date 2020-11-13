/** This Class is designed to manage the Word Analyzer Project, which frames to show up and which to remain invisible **/ 

package myPackage;

public class ProjectManager {
    
    private static WordAnalyzerFrame introFrame; 
    private static HelpFrame helpFrame;
    private static HistoryReportFrame reportFrame;
    
    public static void main(String[] args) {
        introFrame = new WordAnalyzerFrame();
        helpFrame = new HelpFrame();
        
        introFrame.setVisible(true);
    }
    
    /** Enables the WordAnalyzer Frame that is the main frame **/ 
    public static void enableIntroFrame()
    {
        introFrame.setVisible(true);
        helpFrame.setVisible(false);
        reportFrame.setVisible(false);
    }
    
    /** Enables the HelpFrame **/ 
    public static void enableHelpFrame()
    {
        helpFrame.setVisible(true);
        introFrame.setVisible(false);
        reportFrame.setVisible(false);
    }
    
    /** Enables the HelpFrame **/ 
    public static void enableReportFrame(reportsHandler reports)
    {        
        /** reportFrame has to be reinitialized every time to pass the new reports ArrayList **/ 
        reportFrame = new HistoryReportFrame(reports);

        reportFrame.setVisible(true);
        introFrame.setVisible(false);
    }     
}
