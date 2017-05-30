package org.wipro.code.service;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsoupService {


    public static List getDocumentFromJsoup(String url) throws IOException {

        List anchorList = new ArrayList<String>();

        Document doc = Jsoup.connect(url).get();
        Elements links = doc.select("a");

        for (Element link : links) {
            anchorList.add(link.attr("href"));
        }
        return anchorList;
    }
}
