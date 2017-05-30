package org.wipro.code.validator;


import java.util.ArrayList;
import java.util.List;

public class SitemapValidator {

    public static List<String> validate(){

        List<String> exclusion = new ArrayList<>();
        exclusion.add("https://www.facebook.com/WiproDigital/");
        exclusion.add("https://twitter.com/wiprodigital");
        exclusion.add("https://www.linkedin.com/company/wipro-digital");

        return exclusion;
    }
}
