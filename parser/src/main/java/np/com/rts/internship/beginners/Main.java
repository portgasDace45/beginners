package np.com.rts.internship.beginners;
import java.util.StringTokenizer;
import java.util.*;


public class Main {

  private String parseThis = "20160519150000-STX,6-3.0-CONF4";

  // Parsed value must be inserted into this variable
  double value;

  public Main() {
    // Write your code here

     // String prefix = "20160519150000";
     // String postfix= "CONF4";
   //String noPrefixStr = parseThis.substring(parseThis.indexOf(prefix) + prefix.length());

    String[] tokens = parseThis.split("-");
      String s =tokens[2];
   // for (String t : tokens)
      //System.out.println(t);
      Double d = Double.parseDouble(s);
      value=d;
  }

  public static void main(String[] args) {
    new Main();
  }
}
