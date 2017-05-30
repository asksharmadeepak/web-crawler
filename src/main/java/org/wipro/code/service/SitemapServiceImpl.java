package org.wipro.code.service;

import org.springframework.stereotype.Service;
import org.wipro.code.entity.Sitemap;
import org.wipro.code.validator.SitemapValidator;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("sitemapService")
public class SitemapServiceImpl implements SitemapService {


    public List<Sitemap> getSitemap(String url) {

        List sitemaps =  null;
        try {

            List documentFromJsoup = JsoupService.getDocumentFromJsoup(url);
            sitemaps = generateSitemap(prepareSitemapFromHref(documentFromJsoup));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sitemaps;
    }



    private List<Sitemap> generateSitemap(List<Sitemap> sitemaps) {
    List sitemapList  = new ArrayList();
        for (Sitemap sitemapModel: sitemaps) {
           sitemapList.add(new Sitemap(sitemapModel.getUrl(), sitemapModel.getLastmod(), sitemapModel.getChangefreq()));
        }
        return sitemapList;
    }

    private List<Sitemap> prepareSitemapFromHref(List list) {
        String modifiedDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        List sitemapList = new ArrayList<Sitemap>();

        for (Object href : list) {
            if (href.toString().startsWith("htt")) {
                if (!(SitemapValidator.validate().contains(href.toString()))) {
                    Sitemap sitemap = new Sitemap(href.toString(), modifiedDate, "monthly");
                    sitemapList.add(sitemap);
                }
            }
        }
        return sitemapList;
    }
}
