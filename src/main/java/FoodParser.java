import java.util.regex.Pattern;

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

    //each word is separated by : or ;, so split by words and numbers only
    public static String[] getWords(String text){
        return text.split("[^a-zA-Z0-9/.]");
    }

    public static String matchName(String name){
        Pattern apples = Pattern.compile("[aA][pP][pP][lL][eE][sS]");
        Pattern bread = Pattern.compile("[bB][rR][eE][aA][dD]");
        Pattern milk = Pattern.compile("[mM][iI][lL][kK]");
        Pattern cookies = Pattern.compile("[cC][oO0][oO0][kK][iI][eE][sS]");

        if(apples.matcher(name).matches()){
            name = "Apples";
        }
        else if(bread.matcher(name).matches()){
            name = "Bread";
        }
        else if(milk.matcher(name).matches()){
            name = "Milk";
        }
        else if(cookies.matcher(name).matches()){
            name = "Cookies";
        }
        return name;
    }

    public static void matchPrice(String price){
        Pattern pricePattern = Pattern.compile("([0-9]+\\.[0-9]+)");
    }

    public static void matchType(String type){
        Pattern typePattern = Pattern.compile("Food");
    }

    public static void matchExpiration(String expiration){
        Pattern expirationPattern = Pattern.compile("([0-9]+\\/[0-9]+\\/[0-9]+)");
    }
}
