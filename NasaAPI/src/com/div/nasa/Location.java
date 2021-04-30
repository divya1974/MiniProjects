package com.div.nasa;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Location {
	
	int minlat;
	char minlatdir;
	int maxlat;
	char maxlatdir;
	int minlong;
	char minlongdir;
	int maxlong;
	char maxlongdir;
	
	public Result Brightest()
	{

	try {
		URL url = new URL("https://ssd-api.jpl.nasa.gov/fireball.api?date-min=2014-01-01&req-alt=true");
	  /*  HttpURLConnection conn= (HttpURLConnection)url.openConnection();
	    conn.setRequestMethod("GET");
	    conn.connect(); 
	    int responsecode = conn.getResponseCode();
	    System.out.print("Result:"+ conn.getResponseMessage());*/

		Scanner sc = new Scanner(url.openStream());
		String inline=null;
		while(sc.hasNext())
		{
		inline+=sc.nextLine();
		}
		System.out.println("Response");
		System.out.println(inline);
		sc.close();
		
	
		
	  /*  if(responsecode != 200)
	    	throw new RuntimeException("HttpResponseCode: " +responsecode);
	    	else
	    	{
	    	   // Next part of the functionality
	    	}*/
	}
     catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
     }
	
	return null; 
	
	}

}

Date thisdate;
try {
	thisdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH)
	         .parse((String) obj.get(0));

  Date start = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH)
         .parse(startDate);
  
 if (start.compareTo(thisdate) <= 0) {
	 
	return true;
	
	
	
	//System.out.println(jsonarr_1.get(1).toString());
			/*String[] values = jsonarr_1.get(1).toString().split(",");
			for(String s: values)
			{
				System.out.println(" "+s+" ");
			}*/

	
	
	
	
	//	System.out.println("Response JSONArray2 "+jsonarr_2.get(0));
	
	
	
	//ObjectMapper mapper = new ObjectMapper();
	//Map obj = mapper.readValue(s, Map.class);
	

	
	/*List<Object> students = (List<Object>) obj.get("Students");
	Object[] delhiStudents = students
	    .stream()
	    .filter(student -> ((Map)student).get("City").equals("Delhi"))
	    .toArray();*/
	
	
	
	  /*  HttpURLConnection conn= (HttpURLConnection)url.openConnection();
    conn.setRequestMethod("GET");
    conn.connect(); 
    int responsecode = conn.getResponseCode();
    System.out.print("Result:"+ conn.getResponseMessage());*/
	
	

	
	
	  /*  if(responsecode != 200)
	    	throw new RuntimeException("HttpResponseCode: " +responsecode);
	    	else
	    	{
	    	   // Next part of the functionality
	    	}*/
	
	
	/*	JSONArray mJSONArray = new JSONArray();
	mJSONArray.add("2017-12-15 13:14:37");
	mJSONArray.add("311.4");
	mJSONArray.add("6.4");
	mJSONArray.add("1");
	mJSONArray.add("N");
	mJSONArray.add("170.0");
	mJSONArray.add("E");
	mJSONArray.add("20.0");
	mJSONArray.add("31.4");
	if(CheckLatitude(mJSONArray) && CheckLongitude(mJSONArray))
	{
		double en= Double.parseDouble(mJSONArray.get(1).toString());
		if(en>maxenergy)
		{
			maxenergy=en;
			reslat=(String) mJSONArray.get(3);
			reslatdir=(String) mJSONArray.get(4);
			reslon=(String) mJSONArray.get(5);
			reslondir=(String) mJSONArray.get(6);
		}
	}	*/
