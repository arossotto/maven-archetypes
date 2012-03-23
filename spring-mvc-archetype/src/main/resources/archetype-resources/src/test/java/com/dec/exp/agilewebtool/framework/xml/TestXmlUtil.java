package com.dec.exp.agilewebtool.framework.xml;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.w3c.dom.Node;

public class TestXmlUtil {

	@Test
	public void generateXml() {
		Node root = XmlUtil.toXml("root", "str").getChildNodes().item(0);

		assertEquals("root", root.getNodeName());
		assertEquals("str", root.getChildNodes().item(0).getNodeValue());
	}

	@Test
	public void generateXmlCompl() {
		Node root = XmlUtil.toXml("test", new TestObj()).getChildNodes().item(0);

		assertEquals("test", root.getNodeName());
		assertEquals("foo", root.getChildNodes().item(1).getNodeName());
		assertEquals("bar", root.getChildNodes().item(1).getChildNodes().item(0).getNodeValue());
	}

}

class TestObj {
	private String foo="bar";
	
	public String getFoo() {
		return foo;
	}
}
