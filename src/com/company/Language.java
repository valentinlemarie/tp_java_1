package com.company;

public enum Language {

        FR(1, "FRENCH"), ES(2, "SPANISH"), EN(3, "ENGLISH"), DE(4, "GERMAN");


        int code;
        String label;

        Language(int id, String value) {
            code = id;
            label = value;
        }

        public String toString(){
            return code+" - "+label;
        }

}
