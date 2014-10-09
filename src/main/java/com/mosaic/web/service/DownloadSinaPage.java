package com.mosaic.web.service;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class DownloadSinaPage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Document doc = Jsoup.connect(
				"http://blog.sina.com.cn/s/blog_65e321900100xqiz.html").get();
		// sina_keyword_ad_area2
		Elements elements = doc.select("#sina_keyword_ad_area2 a[href]");
		for (Element element : elements) {
			System.out.println(element.attr("href"));
		}

	}

}
