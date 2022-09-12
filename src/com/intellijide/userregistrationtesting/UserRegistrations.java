package com.intellijide.userregistrationtesting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.intellijide.userregistrationtesting.UserRegistrationvalidation.UserRegistration.firstNameValidation;

@FunctionalInterface
interface UserRegistrationvalidation<T> {
    boolean validation(T parameter);

    public class UserRegistration{
        public static boolean firstNameValidation(String firstName){
            UserRegistrationvalidation<String> obj = (fun) ->{
                Pattern pattern1 = Pattern.compile("^[A-Z][a-z]{2,}");
                Matcher matcher1 = pattern1.matcher(fun);
                if(matcher1.matches()){
                    System.out.println(true);
                }else{
                    System.out.println(false);
                }
                return matcher1.matches();
            };
            return obj.validation(firstName);
        }
    }
    public static boolean lastNameValidation(String lastName){
        UserRegistrationvalidation<String> obj = (fun) ->{
            Pattern pattern2 = Pattern.compile("^[A-Z][a-z]{2,}");
            Matcher matcher2 = pattern2.matcher(fun);
            if(matcher2.matches()){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
            return matcher2.matches();
        };
        return obj.validation(lastName);
    }
    public static boolean emailValidation(String email){
        UserRegistrationvalidation<String> obj = (fun) ->{
            Pattern pattern3 = Pattern.compile("^(abc)[.]?[a-z]*[@](bl)[.](co)[.]?[a-z]*$");
            Matcher matcher3 = pattern3.matcher(fun);
            if(matcher3.matches()){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
            return matcher3.matches();
        };
        return obj.validation(email);
    }
    public static boolean mobNumberValidation(String mobNumber){
        UserRegistrationvalidation<String> obj = (fun) ->{
            Pattern pattern4 = Pattern.compile("^[0-9]{2,}[\s][6-9][0-9]{9}$");
            Matcher matcher4 = pattern4.matcher(fun);
            if(matcher4.matches()){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
            return matcher4.matches();
        };
        return obj.validation(mobNumber);
    }
    public static boolean passwordValidation(String password){
        UserRegistrationvalidation<String> obj = (fun) ->{
            Pattern pattern5 = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=[^@#!$%^&+=]*[@#!$%^&+=][^@#!$%^&+=]*$)(?=.*[0-9]).{8,}$");
            Matcher matcher5 = pattern5.matcher(fun);
            if(matcher5.matches()){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
            return matcher5.matches();
        };
        return obj.validation(password);
    }

    public static void main(String[] args) {

        firstNameValidation("Aniket");
        lastNameValidation("Shelar");
        mobNumberValidation("8292938293");
        emailValidation("abc.xyz@bl.co.in");
        passwordValidation("Abcd@1234");
    }
}
