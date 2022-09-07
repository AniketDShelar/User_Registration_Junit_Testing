package com.intellijide.userregistrationtesting;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistations {
    public static void main(String[] args) {
        UserRegistations user = new UserRegistations();
        user.firstName("Aniket");
        user.lastName("Shelar");
        user.email("abc.xyz@bl.co.in");
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
    public boolean lastName(String lastName) {
        Pattern pattern2 = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher2 = pattern2.matcher(lastName);
        if (matcher2.matches()){
            System.out.println(true);
        }else{
            System.out.println(false);
            System.out.println("Enter Last Name in valid format, first letter should be capital case and remaining in small case");
        }
        return matcher2.matches();
    }
    public boolean email(String email) {
        Pattern pattern3 = Pattern.compile("^(abc)[.]?[a-z]*[@](bl)[.](co)[.]?[a-z]*$");
        Matcher matcher3 = pattern3.matcher(email);
        if (matcher3.matches()){
            System.out.println(true);
        }else{
            System.out.println(false);
            System.out.println("Enter Email Id in valid format");
        }
        return matcher3.matches();
    }
}
