package MyExercises;

public class Example05 {
    public static void main(String[] args) {
        Tablet myTab = new Tablet();
        myTab.setCpuSpeed(5);
        myTab.setScreenSize(10);
        System.out.println("CPU speed: " + myTab.getCpuSpeed());
        System.out.println("Screen size: " + myTab.getScreenSize());
    }
}
