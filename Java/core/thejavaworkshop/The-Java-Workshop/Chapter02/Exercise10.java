public class Exercise10 {
    public static void main(String[] args) {
        String taste = "way too hot";

        int tempAdjustment;
        switch (taste) {
            case "too cold":
                tempAdjustment = 1;
                break;
            case "way too hot":
                tempAdjustment = -2;
                break;
            case "too hot":
                tempAdjustment = -1;
                break;
            case "just right":
                tempAdjustment = 0;
                break;
            default:
                tempAdjustment = 0;
                break;
        }
        System.out.println("Adjust temperature: " + tempAdjustment);
    }
}
