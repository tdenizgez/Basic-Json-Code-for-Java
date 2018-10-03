
package json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONArray;



public class Json {
    
   
    public void getJsonData(String url) throws MalformedURLException, IOException{
        Currency[] curr = new Currency[68];
        
        String result = "";
        
        URL urlDoviz = new URL(url);
        HttpURLConnection urlDovizCom = (HttpURLConnection) urlDoviz.openConnection();
        
        InputStreamReader inputStreamReader = new InputStreamReader(urlDovizCom.getInputStream());
        
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
        String line="";
        
        while((line=bufferedReader.readLine())!=null){
            result +=line;
        }
        
        //Json Datasını Parse Edecek Fonksiyona Gönderiyoruz
        getJsonParseData(result);
        
    }
    
    public void getJsonParseData(String Json){
        
        JSONArray jsonArray = new JSONArray(Json);
        
        for (int i = 0; i < jsonArray.length(); i++) {
            Currency curr = new Currency();
            curr.fullName = jsonArray.getJSONObject(i).getString("full_name");
            curr.selling = jsonArray.getJSONObject(i).getDouble("selling");
            System.out.println(curr.fullName+" "+curr.selling);
            
        }
    }

    public static void main(String[] args) throws IOException {
        //public String urlDoviz = "https://www.doviz.com/api/v1/currencies/all/latest";
        Json deneme = new Json();
        deneme.getJsonData("https://www.doviz.com/api/v1/currencies/all/latest");
        
        
    }
    
}
