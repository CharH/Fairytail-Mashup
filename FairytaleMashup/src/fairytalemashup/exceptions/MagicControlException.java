/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup.exceptions;

/**
 *
 * @author charlottehuyett
 */
public class MagicControlException extends Exception{

    public MagicControlException() {
    }

    public MagicControlException(String message) {
        super(message);
    }

    public MagicControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public MagicControlException(Throwable cause) {
        super(cause);
    }

    public MagicControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
