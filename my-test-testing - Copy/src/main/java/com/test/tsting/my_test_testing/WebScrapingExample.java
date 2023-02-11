package com.test.tsting.my_test_testing;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class WebScrapingExample {
	 public static String coronarecord(String c) throws IOException {
			StringBuffer br=new StringBuffer();
			 String url="https://www.worldometers.info/coronavirus/country/"+c+"/";
			  Document doc=Jsoup.connect(url).get();
	
			  Elements elements=doc.select("#maincounter-wrap");
			  elements.forEach((e)->{
				 String text=e.select("h1").text();
				 String count=e.select(".maincounter-number>span").text();
	
				br.append(text).append(" :- ").append(count).append("\n");
			  });
			return br.toString();
	    }

}
