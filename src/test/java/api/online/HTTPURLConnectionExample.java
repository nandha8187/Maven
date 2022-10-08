package api.online;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTTPURLConnectionExample {


	public void getmethodExample() throws IOException  {


		URL url = new URL("https://dummy.restapiexample.com/api/v1/employees");

		HttpURLConnection connection =(HttpURLConnection)url.openConnection();

		connection.setRequestMethod("GET");

		connection.connect();	

		int statuscode = connection.getResponseCode();
		System.out.println("Status code is "+statuscode);
		
		String message = connection.getResponseMessage();
		System.out.println("Response Message "+message);
 		
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputstreamReader = new InputStreamReader(inputStream);
		
		BufferedReader bufferReader = new BufferedReader(inputstreamReader);
		
		String line;
		
		StringBuffer buffer = new StringBuffer();
		
		while((line=bufferReader.readLine())!=null) {
		
	       buffer.append(line);
		
		}
		System.out.println(buffer);
		

	}

	public static void main(String[] args) throws IOException  {

		HTTPURLConnectionExample connectionExample = new HTTPURLConnectionExample();
        connectionExample.getmethodExample();

	}


}
