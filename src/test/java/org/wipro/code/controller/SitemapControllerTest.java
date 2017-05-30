package org.wipro.code.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.wipro.code.entity.Sitemap;
import org.wipro.code.service.SitemapService;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class SitemapControllerTest {


    @Mock
    private SitemapService sitemapService;

    @InjectMocks
    private SitemapController sitemapController;


    @Test
    public void shouldGetSitemapListForUrl(){

        List<Sitemap> expectedSitemap= preapreSitemap();
        when(sitemapService.getSitemap(anyString())).thenReturn(expectedSitemap);

        List<Sitemap> actualSitemap  = sitemapController.getSitemap();

        assertEquals("url1", actualSitemap.get(0).getUrl());
        assertEquals("monthly", actualSitemap.get(0).getChangefreq());
        assertEquals("1/12/2017", actualSitemap.get(0).getLastmod());
        verify(sitemapService, times(1)).getSitemap(anyString());
    }

    private List<Sitemap> preapreSitemap() {
        List<Sitemap> sitemapList = new ArrayList<>();
        sitemapList.add(new Sitemap("url1","monthly", "1/12/2017"));
        sitemapList.add(new Sitemap("url2","monthly", "1/12/2017"));
        sitemapList.add(new Sitemap("url3","monthly", "1/12/2017"));
        return sitemapList;
    }


}
