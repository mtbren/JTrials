package com;

/**
 * Created by Amit on 3/20/2018.
 */
public enum Size {
    SMALL("S"),MEDIUM("M"),LARGE("L"),X_LARGE("XL");
    private String abbreviation;
    private Size(String sz){
        abbreviation=sz;
    }
    public String getAbbreviation(){
        return this.abbreviation;
    }
}
