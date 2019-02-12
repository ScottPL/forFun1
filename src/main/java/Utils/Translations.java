package Utils;

import java.util.Properties;

public class Translations {

    Properties languageProperties = PropertiesUtils.loadTranslations();

    public String getLogin(){
        return languageProperties.getProperty("login");
    }



}
