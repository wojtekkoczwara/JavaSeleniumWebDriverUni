package selenium.wojtekkoczwara.Configs;

import selenium.wojtekkoczwara.Models.PropertyNames;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {

    private static Properties properties = new Properties();

    public static String getProperty(PropertyNames propertyName) {

        try {
           properties.load(new FileInputStream("src/main/config.properties"));
           return properties.getProperty(propertyName.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
