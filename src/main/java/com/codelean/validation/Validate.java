package com.codelean.validation;

public class Validate {
    public boolean checkSize(int min,int max, int length){
        if(length>max){
            return false;
        }else if(length<min){
            return false;
        }else
            return true;
    }
    public boolean checkMail(String mail){
        String typeMail = "^[\\w-_\\.+]*[\\w-_\\.]\\ @([\\w]+\\.)+[\\w]+[\\w]$";
        if(mail.matches(typeMail)){
            return true;
        }else
            return false;
    }

}
