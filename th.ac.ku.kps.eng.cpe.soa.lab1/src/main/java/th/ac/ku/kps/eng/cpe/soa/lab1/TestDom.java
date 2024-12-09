package th.ac.ku.kps.eng.cpe.soa.lab1;

import java.io.File;

import java.io.FileOutputStream;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.dom4j.DocumentFactory;


public class TestDom {
	public static void main(String[] args) throws Exception {
		Document doc = DocumentFactory.getInstance().createDocument();
		Element root = doc.addElement("root");
		root.addAttribute("myAttribute","myValue");
		Element elem = root.addElement("myelem");
		elem.addText("Hello world");
		
		FileOutputStream fos = new FileOutputStream("simple.xml");
		OutputFormat format = OutputFormat.createPrettyPrint();
		XMLWriter writer = new XMLWriter(fos , format);
		writer.write(doc);
		writer.flush();
		writer.close();
		fos.close();
	}
}
