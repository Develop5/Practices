package com.scrolltest.utilities;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import static org.apache.logging.log4j.core.util.Loader.getClassLoader;

public class UtilitiesHerokuSite {

    public static JSONObject getAllFromCommons() throws IOException, URISyntaxException, ParseException, org.json.simple.parser.ParseException {
        // This is a utility method where all parameters are loaded from commons.json
        URL url = getClassLoader().getResource(String.format("commons.json"));
        //URL url = this.class.getClassLoader().getResource(String.format("commons.json"));
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader(url.getPath()));
        JSONObject jsonObject = (JSONObject)obj;
        return jsonObject;
    }

}


