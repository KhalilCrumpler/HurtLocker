public class GetLines {
    //each for is separated by ##
    public static String[] getEachFood(String text){
        String[] allLines = text.split("##");
        return allLines;
    }
}
