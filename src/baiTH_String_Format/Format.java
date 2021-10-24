package baiTH_String_Format;

import tuDien_use_HashMap.Dictionary;

public class Format {
    private String conversionCharacter;
    private String description;
    private String type;

    public Format() {
    }

    public Format(String conversionCharacter, String description, String type) {
        this.conversionCharacter = conversionCharacter;
        this.description = description;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("|%-22s|%-50s|%-25s|", conversionCharacter, description, type);
    }
}
