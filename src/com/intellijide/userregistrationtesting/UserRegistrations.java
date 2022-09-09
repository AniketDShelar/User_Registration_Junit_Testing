package com.intellijide.userregistrationtesting;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrations{
    public static void main(String[] args) throws Exception {
        UserRegistrations user = new UserRegistrations();
            user.firstName("aniket");
            user.lastName("Shelar");
            user.email("abc.xyz@bl.co.in");
            user.phoneNumber("91 9175115715");
            user.password("Abcd@3432");
            user.emailSamples("abc@yahoo.com");
    }
    public boolean firstName(String firstName){
        Pattern pattern1 = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher1 = pattern1.matcher(firstName);
        try{
        if (matcher1.matches())
            System.out.println(true);
        } catch (Exception e) {
            System.out.println("Invalid Input "+e.getMessage());
        }
        return matcher1.matches();
    }
    public boolean lastName(String lastName){
        Pattern pattern2 = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher2 = pattern2.matcher(lastName);
        try{
            if (matcher2.matches()){
                System.out.println(true);
            }
        } catch (Exception e) {
            System.out.println("Invalid Input "+e.getMessage());
        }
        return matcher2.matches();
    }
    public boolean email(String email){
        Pattern pattern3 = Pattern.compile("^(abc)[.]?[a-z]*[@](bl)[.](co)[.]?[a-z]*$");
        Matcher matcher3 = pattern3.matcher(email);
        try{
            if (matcher3.matches()){
                System.out.println(true);
            }
        } catch (Exception e) {
            System.out.println("Invalid Input "+e.getMessage());
        }
        return matcher3.matches();
    }
    public boolean phoneNumber(String mobNumber) throws Exception{
        Pattern pattern4 = Pattern.compile("^[0-9]{2,}[\s][6-9][0-9]{9}$");
        Matcher matcher4 = pattern4.matcher(mobNumber);
        try{
            if (matcher4.matches()){
                System.out.println(true);
            }
        } catch (Exception e) {
            System.out.println("Invalid Input "+e.getMessage());
        }
        return matcher4.matches();
    }
    public boolean password(String password) throws Exception {
        Pattern pattern5 = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=[^@#!$%^&+=]*[@#!$%^&+=][^@#!$%^&+=]*$)(?=.*[0-9]).{8,}$");
        Matcher matcher5 = pattern5.matcher(password);
        try{
            if (matcher5.matches()){
                System.out.println(true);
            }
        } catch (Exception e) {
            System.out.println("Invalid Input "+e.getMessage());
        }
        return matcher5.matches();
    }
    public boolean emailSamples(String email) {
        Pattern pattern6 = Pattern.compile("[a-zA-Z0-9]*[-]*[.]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
        Matcher matcher6 = pattern6.matcher(email);
        if (matcher6.matches()){
            System.out.println(true);
        }else{
            System.out.println(false);
            System.out.println("Enter Email Id in valid format");
        }
        return matcher6.matches();
    }
}
