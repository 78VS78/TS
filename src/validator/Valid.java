package validator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Valid {
    public boolean validateDouble(String num) {
//                C=\\d+.\\d+
//        [0-9]*.?[0-9]+
        Pattern pattern = Pattern.compile("^[\\\\-]{0,1}[0-9]+[\\\\.\\\\,][0-9]+$");
        Matcher matcher = pattern.matcher(num);
        return matcher.matches();
    }


}
