package p3;

public class Password {

    private String passwordStr;
    int digit = 0;
    int letter = 0;

    public Password(String passwordStr) throws InvalidPasswordException{
         
           
            
        if(passwordStr==null || 
           passwordStr.isEmpty() || 
           passwordStr.equals(""))
        {
            throw new InvalidPasswordException();
        }else{
          
            for (int i = 0; i < passwordStr.length(); i++) {
               char ch = passwordStr.charAt(i);
               if(Character.isDigit(ch)){
                   digit++;
               }else if(Character.isLetter(ch)){
                   letter++;
               }
  
            }//for
            
            int alphNum = digit + letter;
                String errorMsg="";
                
                if(digit ==0)
                    errorMsg += "Your password Should have at least 1 digit.\n";
                if(letter == 0)
                    errorMsg += "Your password Should have at least 1 letter.\n";
                if(alphNum < 7)
                    errorMsg += "Your password Should have at least 7 alpha-numeric characters.\n";
                if(!errorMsg.equals(""))
                    throw new InvalidPasswordException(errorMsg);
                
            
        }//else
    }

}
