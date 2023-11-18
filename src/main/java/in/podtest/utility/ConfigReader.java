package in.podtest.utility;

import java.io.*;
import java.util.Properties;

public class ConfigReader {

    private Properties properties;

    private final String propertyFilePath= "src\\main\\resources\\config.properties";

    public ConfigReader(){

        BufferedReader reader;
        try {
            FileReader f1 = new FileReader(propertyFilePath);
            reader = new BufferedReader(f1);
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }

    public Properties getProperties() {
        return properties;
    }

}
