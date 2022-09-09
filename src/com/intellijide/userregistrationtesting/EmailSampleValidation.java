package com.intellijide.userregistrationtesting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailSampleValidation {
    public static void main(String[] args) {
        EmailSampleValidation test = new EmailSampleValidation();
        test.emailSamples("abc@yahoo.com");
    }
    boolean emailSamples(String email){
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


