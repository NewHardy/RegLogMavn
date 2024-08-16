package org.example.IOTools;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.User.User;

import java.io.*;
import java.util.ArrayList;

public class OutputTools
{
    static private final String FILE_PATH ="src/main/java/org/example/Storage/database.json";
    static private File file= new File(FILE_PATH);
    static Gson gson= new GsonBuilder().create();

    static public void outputDatabase(ArrayList<User> arrayList)
    {
        String json=gson.toJson(arrayList);
        try(FileWriter fw = new FileWriter(file))
        {
           fw.write(json);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
