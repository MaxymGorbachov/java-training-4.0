public abstract class Bird {

    public void eat() {
        System.out.println("Bird eating");
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }
}