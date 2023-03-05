import com.google.gson.Gson;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Simon Pirko on ${DATE}
 */
public class Main {
	public static void main(String[] args) throws IOException {
		Gson gson = new Gson();

//		User user = new User("Simon", "simon", "simon");
//		User user2 = new User("Denis", "denis", "denis");
//
//		List<User> users = new ArrayList<>();
//		users.add(user);
//		users.add(user2);
//
//		String s = gson.toJson(users);
//
//		FileWriter fileWriter = new FileWriter("test2.json");
//		fileWriter.write(s);
//		fileWriter.close();

		FileReader fileReader = new FileReader("test2.json");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String s = bufferedReader.readLine();
		List list = gson.fromJson(s, List.class);
		System.out.println(list);

//		System.out.println(s);

//		List list = gson.fromJson("[{\"name\":\"Simon\",\"username\":\"simon\",\"password\":\"simon\"},{\"name\":\"Denis\",\"username\":\"denis\",\"password\":\"denis\"}]", List.class);
//		System.out.println(list);

//		String s = gson.toJson(user);
//		String s1 = gson.toJson(user2);
//
//		System.out.println(s);
//		System.out.println(s1);


//		DocumentBuilderFactory ad = DocumentBuilderFactory.newInstance();
//		DocumentBuilder documentBuilder = ad.newDocumentBuilder();
//		Document parse = documentBuilder.parse(new File("test.xml"));

//		Element documentElement = parse.getDocumentElement();
//		System.out.println(documentElement.getAttributes());

//		NodeList users = parse.getElementsByTagName("users");
//		Node item = users.item(0);
//		Node item2 = users.item(1);
//		System.out.println(item.getNodeName());
//		System.out.println(item2.getNodeName());

//		Node item3 = users.item(2);
//		Node item4 = users.item(4);

//		NamedNodeMap attributes = item.getAttributes();
//		System.out.println(attributes.getLength());
//
//		NodeList childNodes = item2.getChildNodes();
//		Node i1 = childNodes.item(0);
//		Node i2 = childNodes.item(1);
//		Node i3 = childNodes.item(2);
//
//		System.out.println(i1.getNodeName());
//		System.out.println(i2.getNodeName());
//		System.out.println(i3.getNodeName());

	}
}
