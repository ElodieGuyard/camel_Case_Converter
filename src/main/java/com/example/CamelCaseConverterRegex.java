package com.example;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CamelCaseConverterRegex {

    public static void main(String[] args) {
        System.out.println(tocamelcaseregex("test_test"));
    }
    
    public static String tocamelcaseregex(String inputString){ //Une méthode statique qui prend une String en entrée et retourne une String.
        String stringConverted = "";
        Pattern initialPattern = Pattern.compile("(_)([a-z])"); //Ce pattern recherche un underscore suivi d'une lettre en minuscule
        Matcher matcher = initialPattern.matcher(inputString); //Associe la regex (pattern) à la chaîne d’entrée (inputString) pour pouvoir chercher des correspondances (matcher).
        StringBuilder sb = new StringBuilder();
        stringConverted = matcher.replaceAll(mr -> mr.group(2).toUpperCase()); //replaceAll(...) remplace toutes les correspondances trouvées par la regex
        //From java doc : Given the regular expression dog, the input "zzzdogzzzdogzzz", and the function mr -> mr. group().toUpperCase(),
        //an invocation of this method on a matcher for that expression would yield the string "zzzDOGzzzDOGzzz"
        return stringConverted;
    }
}





