//package dh.master.info.service;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.parser.Parser;
//import org.springframework.stereotype.Service;
//
//import dh.master.info.model.Footnote;
//import dh.master.info.model.Locale;
//import dh.master.info.model.Sentence;
//
//
//@Service
//public class IndexService {
//
//	public Document doc;
//
//	public Document parseFile(String path) throws IOException {
//		InputStream is = new FileInputStream(new File("src/main/resources/static/xml/NuristaniDegener.xml"));
//		Document doc = Jsoup.parse(is, "UTF-8", "", Parser.xmlParser());
//
//		return doc;
//
//	}
//
//	public Locale parsePrasunTitles(Locale title, String heading, Sentence sentence) throws IOException {
//		List<Sentence> sentences = new ArrayList<Sentence>();
//		for (Element head : doc.select("p[rend='prn_head']")) {
//			Element text = head.nextElementSibling();
//			if (text != null && text.is("list[type='ordered']")) {
//				heading = head.text();
//				sentence.setContent(text.text());
//				title.setHeading(heading);
//				sentences.add(sentence);
//
//			}
//		}
//		return new Locale(heading, sentences);
//
//	}
//
//	public Footnote parseFootnotes(Footnote footnote, String ftnTemp) {
//		for (Element annotationElement : doc.select("p[rend='footnote text']")) {
//			if (annotationElement != null) {
//				ftnTemp = annotationElement.text();
//				footnote.setFtnText(ftnTemp);
//				footnote.setPosition(null);
//			}
//
//		}
//		return new Footnote();
//	}
//}
