import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;

public class MapToJson {
  public static void main(String args[]) throws IOException, ClassNotFoundException {
    FileInputStream fis = new FileInputStream(args[0]);
    ObjectInputStream oin = new ObjectInputStream(fis);
    HashMap map = (HashMap) oin.readObject();
    Gson gson = new GsonBuilder().disableHtmlEscaping().create();
    String jsonString = gson.toJson(map);
    System.out.println(jsonString);
  }
}
