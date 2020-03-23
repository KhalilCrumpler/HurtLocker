public class FoodParser {

    public static Food parseFoods(String text) {
        //parse through lines to and try to create food objects
        String name = null;
        String price = null;
        String type = null;
        String expiration = null;

        // place each item in array and assign the correct ones to variables
        String[] allValues = getWords(text);
        name = allValues[1];
        price = allValues[3];
        type = allValues[4];
        expiration = allValues[7];

        return new Food(name, price, type, expiration);
    }

    //each word is seperated by : or ;, so split by words and numbers only
    public static String[] getWords(String text){
        return text.split("[^a-zA-Z0-9/.]");
    }
}
