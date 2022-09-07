package com.intellijide.userregistrationtesting;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistations {
    public static void main(String[] args) {
        UserRegistations user = new UserRegistations();
        user.firstName("Aniket");
    }
    public boolean firstName(String firstName) {
        Pattern pattern1 = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher1 = pattern1.matcher(firstName);
        if (matcher1.matches()){
            System.out.println(true);
        }else{
            System.out.println(false);
            System.out.println("Enter Name in valid format, first letter should be capital case and remaining in small case");
        }
        return matcher1.matches();
    }
}
