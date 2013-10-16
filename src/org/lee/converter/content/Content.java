package org.lee.converter.content;

import java.util.ArrayList;
import java.util.List;

public class Content 
{
	private String title;
	private String content;
	private String text;
	private List<String> indices;
	
	public Content(String text)
	{
		this.text = text;
		title = "";
		content = "";
		indices = new ArrayList<String>();
		resolve();
	}
	
	public void resolve()
	{
		String[] padLine = text.split("\n");
		boolean checkbody = false;
		for(int i = 0; i < padLine.length; i++)
		{
			System.out.println(padLine[i]);
			if(padLine[i].indexOf("</html>") >= 0)
			{
				break;
			}
			if(padLine[i].startsWith("<body><h1>"))
			{
				title = padLine[i].substring(10, padLine[i].indexOf("</h1>"));
				content = "<body>" + padLine[i].substring(padLine[i].indexOf("<p>"));
				checkbody = true;
			}
			else
			{
				if(checkbody)
				{
					content += padLine[i];
				}
			}
		}
		content = content.replaceAll("<h2>", "\n<h1>");
		content = content.replaceAll("</h2>", "</h1>\n");
		content = content.replaceAll("/>",">");
		content = content.replaceAll("<p>", "<br>");
		content = content.replaceAll("</p>", "</br>");
		System.out.println(title + " " + content);
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void createIndex()
	{
		String tmpLine[] = content.split("\n");
		String tmpIndex = new String();
		
		for(int i = 0; i < tmpLine.length; i++)
		{
			if(tmpLine[i].startsWith("<h1>"))
			{
				tmpIndex = tmpLine[i].substring(4, tmpLine[i].indexOf("</h1>"));
				content = content.replaceAll(tmpLine[i], String.format("<h1><a id=\"%s\" name=\"%s\"></a>%s</h1>", indices.size(), indices.size(), tmpIndex));
				indices.add(String.format("<a href=\"#%s\">%s</a>", indices.size(), tmpIndex));
			}
		}
		System.out.println(content);
		System.out.println(indices.toString());
		
		String tmpIndices = new String();
		for(int i = 0; i < indices.size(); i++)
		{
			tmpIndices += String.format("<br>%s</br>", indices.get(i));
		}
		
		content = content.replaceAll("<h1><a id=\"0\" name=\"0\">", String.format("<blockquote>目錄\n%s\n</blockquote>\n", tmpIndices) + "<h1><a id=\"0\" name=\"0\">");
		System.out.println(content);
	}
	
	public void setContent(String content)
	{
		this.content = content;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public String getContent()
	{
		return this.content;
	}

}
