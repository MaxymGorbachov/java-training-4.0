import java.util.List;

public class Zoo {

    /**
     * Feeds different bird sections of the zoo.
     *
     * @param list list of birds of particular type.
     */
    public static void feed(List<? extends Bird> birds) {
        System.out.println("Feeding birds");
        for (Bird bird : birds) {
            System.out.println("Feeding " + bird);
        }
    }

    /**
     * Adds birds to a flying section of the zoo.
     *
     * @param list list of birds of particular type.
     * @param bird a new bird.
     */
    public static void acceptBird(List<? super FlyingBird> birds, FlyingBird bird) {
        System.out.println("Accepting a bird to a section");
        bird.checkWings();
        birds.add(bird);
        System.out.println("Added: " + bird);
    }

    /**
     * Adds bird to the general list.
     *
     * @param list list of birds.
     * @param newBird bird to add.
     */
    public static void registerBird(List<Bird> birds, Bird newBird) {
        System.out.println("Adding a bird to the birds list");
        birds.add(newBird);
        System.out.println("Current birds in the list:");
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
}