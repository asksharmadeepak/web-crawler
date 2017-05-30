package org.wipro.code.service;


import org.wipro.code.entity.Sitemap;

import java.util.List;

public interface SitemapService {

    List<Sitemap> getSitemap(String url);

}
