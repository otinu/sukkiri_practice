package sukkiri_practice;

import java.io.FileInputStream;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Code7_9 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("rpgsave.xml");
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);
		Element hero = doc.getDocumentElement();
		Element weapon = findChildByTag(hero, "weapon");
		Element power = findChildByTag(weapon, "power");
		String value = power.getTextContent();
	}

	static Element findChildByTag(Element self, String name) throws Exception {
		NodeList children = self.getChildNodes();
		for(int i = 0; i < children.getLength(); i++) {
			if(children.item(i) instanceof Element) {
				Element e = (Element)children.item(i);
				if(e.getTagName().equals(name)) {
					return e;
				}
			}
		}
		return null;
	}

}
