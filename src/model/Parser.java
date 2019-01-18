package model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

import javax.lang.model.element.Element;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class Parser {
	private Document dom = null;
	private ArrayList<Asignatura> asignaturas = null;
	
	public Parser() {
		   asignaturas = new ArrayList<Asignatura>();
		}
	
	public void parseDocument() {
	 
	    Element doc = dom.getDocumentElement();
	    
	    NodeList nl = doc.getElementsByTagName("asignatura");
	      
	    if (nl != null && nl.getLength() > 0) {
	      for (int i = 0; i < nl.getLength(); i++) {        
	        Element el = (Element) nl.item(i);
	        Asignatura a = getAsignatura(el);
	        Asignatura.add(a);
	      }
	    }
	  }
}
