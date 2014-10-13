package com.travellazy;/**
 * Author: wge
 * Date: 27/02/2014
 * Time: 20:37
 */

import org.apache.commons.io.FileUtils;


import java.io.File;
import java.io.IOException;

public class ResourceFileHelper
{

    public static String getJsonContent(String jsonFileName) throws IOException
    {
        String filePath = ResourceFileHelper.class.getClassLoader().getResource(jsonFileName).getFile();
        File file = new File(filePath);
        String content =  FileUtils.readFileToString(file);
        return removeNewLines(content);
    }

    private static String removeNewLines(String originalString) {
        return originalString.replaceAll("\\n","");
    }
}
