package parsing_json;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ElementCollection {

    private HashMap<String, Object> elements = new HashMap<>();

    public Element findByAtomicNumber(int atomic_number) throws ParseException
    {
       return null;
    }


    public Element findByName(String name) throws ParseException
    {
        Pattern pattern = Pattern.compile("([A-Z])\\w+");
        Matcher m = pattern.matcher(name);

        if (m.find())
        {
            return findByName(name);
        }

        return null;
    }

    public ElementCollection where(String fieldName, Object value)
    {


        return null;
    }

    public int size()
    {
        return elements.size();
    }
}
