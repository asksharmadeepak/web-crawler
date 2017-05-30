package org.wipro.code.entity;

public class Sitemap {

    private String url;
    private String changefreq;
    private String lastmod;


    public Sitemap(String url, String changefreq, String lastmod) {
        this.url = url;
        this.changefreq = changefreq;
        this.lastmod = lastmod;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getChangefreq() {
        return changefreq;
    }

    public void setChangefreq(String changefreq) {
        this.changefreq = changefreq;
    }

    public String getLastmod() {
        return lastmod;
    }

    public void setLastmod(String lastmod) {
        this.lastmod = lastmod;
    }
}

