package ToyStore;

public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();

        // Add new toys
        toyStore.addToy(new Toy(1, "Teddy Bear", 10, 5));
        toyStore.addToy(new Toy(2, "Legos", 20, 10));
        toyStore.addToy(new Toy(3, "Dollhouse", 5, 2));

        // Update frequency of winning a toy
        toyStore.updateFrequency(1, 10);

        // Select a prize toy
        Toy prizeToy = toyStore.selectPrizeToy();

        // Get a prize toy
        Toy receivedPrizeToy = toyStore.getPrizeToy();
    }
}