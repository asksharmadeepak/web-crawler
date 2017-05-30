package org.wipro.code.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.wipro.code.entity.Sitemap;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
public class SitemapServiceImplTest {


    @Test
    public void shouldGetSitemapForGivenUrl(){
        SitemapService sitemapService =  new SitemapServiceImpl();

        List<Sitemap> sitemapList = sitemapService.getSitemap("http://wiprodigital.com");

        assertEquals("http://wiprodigital.com", sitemapList.get(0).getUrl());
        assertEquals("monthly", sitemapList.get(0).getChangefreq());
        assertEquals("2017-05-30", sitemapList.get(0).getLastmod());
    }

}
