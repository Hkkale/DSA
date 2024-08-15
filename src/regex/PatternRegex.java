package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternRegex {
    public static void main(String[] args) {

        Pattern pattern= Pattern.compile("AA");

        Matcher matcher= pattern.matcher("ZSRTDYIOYUIFJVHJJCIUHIOHJDBDJWAAYGUYGHAAAHBJBHAAJBHJVHBJHA");
        System.out.println(matcher.find());
        System.out.println(matcher.groupCount());
        while (matcher.find()){
            System.out.println(matcher.start()+" - "+(matcher.end()-1));
        }


        String name= "Hitendra Kale";

        System.out.println(Pattern.matches("hi.*",name));
    }
}
