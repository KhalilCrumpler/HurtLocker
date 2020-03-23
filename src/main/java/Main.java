import org.apache.commons.io.IOUtils;
import sun.misc.IOUtils;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public String readRawDataToString() throws Exception{
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    public static void main(String[] args) throws Exception{
        String output = (new Main()).readRawDataToString();
        ArrayList<Food> foods = new ArrayList<>();
        String[] lines = GetLines.getEachFood(output);
        for(String item : lines){
            foods.add(FoodParser.parseFoods(item));
        }
        System.out.println(output);

    }
}
