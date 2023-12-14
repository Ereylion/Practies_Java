package Pr_16;
// Добавление блока try catch в printMessage
public class ThrowsDemo2 {

    public void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }

    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException("null key in getDetails");
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
        } catch (NullPointerException e){
            key = "default";
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo2 td = new ThrowsDemo2();

        td.printMessageSafe("Key");
        td.printMessageSafe(null);

        try {
            td.printMessage("Key");
            td.printMessage(null);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }

    }
}
