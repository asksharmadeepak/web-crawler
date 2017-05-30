package org.wipro.code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wipro.code.entity.Sitemap;
import org.wipro.code.service.SitemapService;

import java.util.List;


@RestController
public class SitemapController {

    @Autowired
    SitemapService sitemapService;


    @GetMapping("/sitemap")
    public List<Sitemap> getSitemap(){
        List<Sitemap> sitemaps = sitemapService.getSitemap("http://wiprodigital.com");
        return sitemaps;
    }

}
