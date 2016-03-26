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
 * @author charlottehuyett
 */
public class ErrorView {
    private static final PrintWriter ERROR_FILE = FairytaleMashup.getOutFile();
    private static final PrintWriter LOG_FILE = FairytaleMashup.getLogFile();
    
    public static void display(String className, String errorMessage){
        ERROR_FILE.println(
            "-----------------------------------"
           +"\n- ERROR - "+ errorMessage
           +"\n-----------------------------------");
        //log error
        LOG_FILE.println(className + " - " + errorMessage);
    }
}

