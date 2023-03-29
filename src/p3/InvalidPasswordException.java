
package p3;


public class InvalidPasswordException extends Exception {

    public InvalidPasswordException() {
        super("Invalid password:password cannot be null or an empty string.\n");
    }
    
    public InvalidPasswordException(String errorMsg) {
        super(errorMsg);
    }
    
}
