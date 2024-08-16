package org.example.IOTools;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.User.User;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputTools
{
    static private final String FILE_PATH="src/main/java/org/example/Storage/database.json";
    static private File file= new File(FILE_PATH);
    //static Gson gson= new GsonBuilder().create();

    static public ArrayList<User> inputDatabase()
    {
        ArrayList<User> dataBase= new ArrayList<>();
        try (Scanner scanner= new Scanner(file))
        {
            StringBuilder sb = new StringBuilder();
            while (scanner.hasNext())
            {
                sb.append(scanner.nextLine());
            }
            String json=sb.toString();
            dataBase=new Gson().fromJson(json,ArrayList.class);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return dataBase;
    }
}
