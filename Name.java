
public class Name {

    private String myFirst = "";
    private String myMiddle = "";
    private String myLast = "";
 
    public Name (String first, String middle, String last) {
       myFirst = fixCase(first);
       myMiddle = fixCase(middle);
       myLast = fixCase(last);
    }
    
    public String lastFirst ( ) {
         return myLast + ", " + myFirst + " " + myMiddle;
    }
    
    public String fullName ( ) {
       return myFirst + " " + myMiddle + " " + myLast;
    }
   
    private String fixCase (String part) {
      part = part.toLowerCase().trim();
      return part.substring(0,1).toUpperCase() + part.substring(1);
    }

    public boolean isSame(Name other){
      return this.myFirst == other.myFirst;
    }
 }