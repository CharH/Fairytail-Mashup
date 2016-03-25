/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup.view;

import fairytalemashup.FairytaleMashup;
import java.io.PrintWriter;

/**
 *
 * @author KatieSimons
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = FairytaleMashup.getOutFile();
    private static final PrintWriter logFile = FairytaleMashup.getLogFile();
    public static void display(String className, String errorMessage){
        errorFile.println("------------------------------------"
                + "\n ------ ERROR " + errorMessage             
                + "\n------------------------------------------");
        logFile.println(className + " - " + errorMessage);
    }
    
}
