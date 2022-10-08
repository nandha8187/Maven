package api.online;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Post {

	
	private void PostMethodExample() throws IOException {
		
		
		
		URL url = new URL("https://dummy.restapiexample.com/api/v1/create");
		

		HttpURLConnection connection=(HttpURLConnection)url.openConnection();
		
		connection.setRequestMethod("POST");
		
		connection.setRequestProperty("content-Type","application/json");
		connection.setDoOutput(true);
		
		String jsonBody="{\"name\":\"NANDHAKUMAR2563\",\"salary\":\"10000000\",\"age\":\"1\"}";
		
		byte[] inputJson = jsonBody.getBytes();
		
		OutputStream outputStream = connection.getOutputStream();
		
		outputStream.write(inputJson);
		
		System.out.println("Response code : "+connection.getResponseCode());
		System.out.println("Response code : "+connection.getResponseMessage());

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
	
	

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
             Post  postex = new Post();
             
             postex.PostMethodExample();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
