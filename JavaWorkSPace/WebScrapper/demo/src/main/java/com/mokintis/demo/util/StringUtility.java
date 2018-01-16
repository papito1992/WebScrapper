package com.mokintis.demo.util;
//string related operation
//bus visi static,kad nereiktu kurti objektu kad pasiekti situos metodus
//sitas klase tures utility methods related to stin opperations
public class StringUtility {
    public static String toCommaSeparationString(Object[] items){
        StringBuilder sb= new StringBuilder();
        for (Object item :
                items) {
            sb.append(item).append(",");
        }if (sb.length()>0){
            sb.deleteCharAt(sb.length()-1);//galas
        }
    return sb.toString();}
}
