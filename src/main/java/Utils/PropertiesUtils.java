package Utils;

import java.io.FileReader;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.Properties;

public class PropertiesUtils {

    // METHODS

    // static method is related to the class not the object (instance of class)
    // additionally they can't access any other methods and variables not declared
    // as static
    private static Properties loadPropertiesFromFile(String filePath) {
        // File reader is used for reading characters, for other content e.g. graphic
        // we could use InputStream which is used for reading raw bytes (well actually we could
        // use it also here and it would work...)
        FileReader fileReader = null;
        Properties properties = new Properties();

        try {
            System.out.println("Reading properties from file: '" + filePath + "'.");
            fileReader = new FileReader(filePath);
            properties.load(fileReader);
        } catch (IOException ioe) {
            System.out.println("IOException occurred during loading the properties file. Please "
                    + "ensure that the following properties file path is valid: '" + filePath + "'.");
            ioe.printStackTrace();

//      Finally is always executed no matter if try was successful or catch was executed and here it
//            is for cleaning memory allocated for fileReader
        } finally {
            if(fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException ioe) {
                    System.out.println("IOException occurred during closing the input stream.");
                    ioe.printStackTrace();
                }
            }
        }
        System.out.println("Properties file loaded successfully - " + properties.size() + " properties "
                + "were loaded.");
        return properties;
    }

    public static Properties loadTranslations() {
        String translationFilesDir = "src/test/resources/";
        // Reading 'language' from system properties (run configuration in our case)
        String language = System.getProperty("language").toLowerCase();

        String langFilePath = translationFilesDir + language + ".properties";

        if (!(language.equals("english"))) {
            throw new InvalidParameterException(
                    "ERROR unsupported language:'" + language +
                            "'. Supported languages are: English.");
        }

        return loadPropertiesFromFile(langFilePath);
    }

}