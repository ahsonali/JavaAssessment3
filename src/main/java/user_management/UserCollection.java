package user_management;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserCollection {

    public User findById(int id)
    {
        return null;
    }

    public User findByEmail(String email)
    {
        Pattern pattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
        Matcher m = pattern.matcher(email);

        if (m.find())
        {
            return findByEmail(email);
        }

        return null;

    }

    public User attemptLogin(String email, String password)
    {
        Pattern pattern1 = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
        Matcher m1 = pattern1.matcher(email);

        if (m1.find())
        {
            return findByEmail(email);
        }

        Pattern pattern2 = Pattern.compile("(?=.*[A-Z])");
        Matcher m2 = pattern2.matcher(password);

        if (m2.find())
        {
            return attemptLogin(email,password);
        }


        return null;
    }

    public int createUser(String name, String email, String password) {
        return 0;
    }
}
