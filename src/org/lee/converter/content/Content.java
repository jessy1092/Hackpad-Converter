package org.lee.converter.content;

public class Content 
{
	private String title;
	private String content;
	private String text;
	
	public Content(String text)
	{
		this.text = text;
		title = "";
		content = "";
		resolve();
	}
	
	public void resolve()
	{
		String[] padLine = text.split("\n");
		boolean checkbody = false;
		for(int i = 0; i < padLine.length; i++)
		{
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
		content = content.replaceAll("<h2>", "<b>");
		content = content.replaceAll("</h2>", "</b>");
		System.out.println(title + " " + content);
	}
	
	public void setTitle(String title)
	{
		this.title = title;
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
