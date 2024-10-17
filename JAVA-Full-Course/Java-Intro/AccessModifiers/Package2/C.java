package AccessModifiers.Package2;

import AccessModifiers.Package1.*;

public class C {

    public String publicMessage = " This is public";
    protected String protectedMessage = " This is protected";   
            String defaultMessage = "This is default";
    private String privateMessage = " This is private";        
}


// public => if public is package 2 it will be visible package 1 also
// protected => it is accessble to a different class in a different package
// private => something that is private it is only visible to the class that contains it self.