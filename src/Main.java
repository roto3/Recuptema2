import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import model.Parser;

public class Main {
	private static Parser Prsr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prsr = new Parser();
		
		try {
			parsearFich(Prsr);
			
			
		} catch (ParserConfigurationException e) {
			System.err.println("Error de configuración");
			e.printStackTrace();
		} catch(SAXException s) {
			System.err.println("Error al parsear");
			s.printStackTrace();
		} catch(IOException ex) {
			System.err.println("Error en fichero o inesperado");
			ex.printStackTrace();
		}
		
		
		
	}
	public static void parsearFich(Parser par) throws ParserConfigurationException, SAXException, IOException {
		par.parseFicheroXml("asignaturas.xml");
		par.parseDocument();
		par.printLibro();
		
	}

}
