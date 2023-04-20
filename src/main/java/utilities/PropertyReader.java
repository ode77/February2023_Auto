package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    public Properties prop;
    File file = new File("src/main/resources/Configuration.properties");

    FileInputStream fis = new FileInputStream(file);

    public PropertyReader() throws IOException {
        prop = new Properties();
        prop.load(fis);

    }

    public String getSwagLabUrl() {
        return prop.getProperty("SwagLabUrl");
    }

    public String getFirstName(){
            return prop.getProperty("FirstName");
}
    public String getLastName() {
        return prop.getProperty("LastName");
    }

    public String getPoseCode() {
        return prop.getProperty("PostCode");
    }
}
