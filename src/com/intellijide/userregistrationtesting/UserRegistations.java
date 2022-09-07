package com.intellijide.userregistrationtesting;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistations {
    public static void main(String[] args) {
        UserRegistations user = new UserRegistations();
        user.firstName("Aniket");
        user.lastName("Shelar");
        user.email("abc.xyz@bl.co.in");
        user.phoneNumber("91 9175115715");
        user.password("Abc12233");
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
    public boolean phoneNumber(String mobNumber) {
        Pattern pattern4 = Pattern.compile("^[0-9]{2,}[\s][6-9][0-9]{9}$");
        Matcher matcher4 = pattern4.matcher(mobNumber);
        if (matcher4.matches()){
            System.out.println(true);
        }else{
            System.out.println(false);
            System.out.println("Enter Mobile Number in valid format");
        }
        return matcher4.matches();
    }
    public boolean password(String password) {
        Pattern pattern5 = Pattern.compile("[A-za-z0-9]{8,}");
        Matcher matcher5 = pattern5.matcher(password);
        if (matcher5.matches()){
            System.out.println(true);
        }else{
            System.out.println(false);
            System.out.println("Enter Password in valid format");
        }
        return matcher5.matches();
    }
}
