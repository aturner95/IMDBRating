package edu.bristol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class IMDBRating
{
    private float currentAverage = 0;
    private int ratingCount = 0;

    public float addNewRating(int newRating)
    {
        if(newRating < 0 || newRating > 10){
            return currentAverage;
        }

        int previousTotal = (int) (currentAverage * ratingCount);
        int newTotal = previousTotal + newRating;
        ratingCount++;
        currentAverage = newTotal / ratingCount;
        return currentAverage;
    }

        public boolean checkResultsContain(String epName) throws IOException {
            URL url = new URL("https://www.imdb.com/search/title/?locations=bristol&role=nm0263368");
            HttpURLConnection connection =(HttpURLConnection)url.openConnection();
            connection.setDoOutput(true);
            connection.setRequestMethod("GET");
            InputStream stream = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
            String nextLine = reader.readLine();
            int numOfShoestringEps = 0;
            while(nextLine != null) {
                // Check the line to see what it contains
                // ?????????????????????????????????????????

                if(nextLine.contains(epName)){
                    return true;
                }

                nextLine = reader.readLine();
            }
            return false;
        }


}
