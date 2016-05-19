package np.com.rts.internship.beginners;
import java.util.*;
import java.util.Arrays;

public class Main {

  String[] strings = new String[] {
          "hello",
          "mello",
          "mell",
          "1mell",
          "hmmm",
          "h2mmm",
          "zxcvb",
          "asdf",
          "%$compli"
  };


  public Main() {

	  Arrays.sort(strings);
      for(int i=0; i < strings.length; i++){
          System.out.println(strings[i]);
      }
      System.out.println("last element of the array");
      System.out.println(strings[strings.length-1]);
  }



    public static void main(String[] args) {
    new Main();
  }
}
