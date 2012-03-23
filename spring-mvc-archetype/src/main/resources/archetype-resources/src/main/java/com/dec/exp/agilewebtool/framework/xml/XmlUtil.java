package com.dec.exp.agilewebtool.framework.xml;

import java.io.ByteArrayInputStream;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

import com.thoughtworks.xstream.XStream;

public class XmlUtil {

	public static Document toXml(String root, Object obj) {
		XStream xStream = new XStream();
		xStream.alias(root, obj.getClass());
		try {
			return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(xStream.toXML(obj).getBytes()));
		} catch (Exception e) {
			// TODO multicatch!
			throw new RuntimeException(e);
		}
	}

}
