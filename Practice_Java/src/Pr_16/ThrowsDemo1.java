package Pr_16;
// Использование throw для обработки исключения
public class ThrowsDemo1 {

    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }

    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for " + key;
    }

    public void printMessageSafe(String key) {
        String message = getDetailsSafe(key);
        System.out.println(message);
    }

    public String getDetailsSafe(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        }catch (NullPointerException e){
            key = "default";
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo1 td = new ThrowsDemo1();

        td.printMessageSafe("Key");
        td.printMessageSafe(null);

        td.printMessage("Key");
        td.printMessage(null);
    }
}
