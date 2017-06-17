package ua.study;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

	public static void main(String[] args) throws IOException {
////		Document document = Jsoup.connect("https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_population").get();
////		Elements elements = document.select("table.wikitable > tbody > tr > td");
//		
////		List<Country> countries = new ArrayList<Country>();
////		for(Element element : elements){
//////			if(element.attr("href").startsWith("/wiki/")){
//////				countries.add(new Country(element.attr("href").substring(6), 0));
//////			}
//////		}
//////		for (int i = 0; i < 15; i++) {
//////			System.out.println(countries.get((int)(Math.random()*countries.size())));
//////			
//////		}
//////		Elements elements2 = document.select("tbody > tr > td");
//////		System.out.println(elements2);
////		System.out.println(element.text());
////		}
//
//		Document document = Jsoup.connect("https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_population").get();
//		Element table = document.select("table").get(0);
//		Elements rows = table.select("tr");
//		Elements elements = document.select("tbody > tr > td > a");
//		List<Country> countries = new ArrayList<Country>();
////		for(Element element : elements){
////        	if(element.attr("href").startsWith("/wiki/")){
////			countries.add(new Country(element.attr("href").substring(6), 0));
////		}
//	
////		for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
////	        Element row = rows.get(i);
////	        Elements cols1 = row.select("td > a");
////	        Element cols2 = row.select("td").get(3);
////	        String cols3 = cols2.text();
////	        cols3.replaceAll(",", "");
////	        //for(Element element : elements){
////	        	if(cols1.attr("href").startsWith("/wiki/")){
////				countries.add(new Country(cols1.attr("href").substring(6), Integer.parseInt(cols3)));
////			}
////	        
////	        //}
////	}
////		 for (int i = 0; i < 10; i++) {
////				System.out.println(countries.get((int)(Math.random()*countries.size())));
////			}
//	}
		
		
		
		
		
		
	Document document = Jsoup.connect("https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_population").get();
	Elements elements = document.select("table.wikitable > tbody > tr > td");	
	List<Country> countries = new ArrayList<Country>();
	for (Element element : elements) {
		String text = element.text();
		
		
		text.split(" ");
		System.out.print(text);
		text.replaceAll("^0_9", "aaa");
	}
}
}
