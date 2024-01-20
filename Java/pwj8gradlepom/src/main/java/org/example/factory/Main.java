package org.example.factory;

import java.io.File;
import java.io.IOException;

import static org.example.factory.JsonRetrieveFromFiles.*;

public class Main {

    public static <ObjectMapper> void main(String[] args) throws IOException {

        System.out.println("\n------- Parsing JSON from a constant in a class ------------");
        System.out.println(EXPECTED_MAP_DISCARD.get("actor"));

        System.out.println("\n---------- Reading complete JSON from fixed path -----------");
        System.out.println(myMethodName());

        System.out.println("\n---------- Reading file from resource folder ---------------");
        File fileInResourcesFolder = new File(Main.class.getClassLoader().getResource("shortNestedJson.json").getFile());
        String fieldName = "name";
        System.out.println(getFieldFromJsonInResources(fileInResourcesFolder, fieldName));
        String status = "status";
        System.out.println(getFieldFromJsonInResources(fileInResourcesFolder, status));
        String topLevel = "detail";
        String lowerLevel = "last_name";
        System.out.println(get2ndLevelFieldFromJsonInResources(fileInResourcesFolder, topLevel, lowerLevel));


    }

}
