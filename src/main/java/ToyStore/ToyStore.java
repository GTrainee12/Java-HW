package ToyStore;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyStore {
    private List<Toy> toys;
    private List<Toy> prizeToys;

    public ToyStore() {
        toys = new ArrayList<>();
        prizeToys = new ArrayList<>();
    }

    // Method to add new toy
    public void addToy(Toy toy) {
        toys.add(toy);
    }

    // Method to update frequency of winning a toy
    public void updateFrequency(int toyId, int newFrequency) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setFrequency(newFrequency);
                break;
            }
        }
    }

    // Method to select a prize toy
    public Toy selectPrizeToy() {
        int totalFrequency = 0;
        for (Toy toy : toys) {
            totalFrequency += toy.getFrequency();
        }

        Random random = new Random();
        int randomNumber = random.nextInt(totalFrequency) + 1;

        int cumulativeFrequency = 0;
        for (Toy toy : toys) {
            cumulativeFrequency += toy.getFrequency();
            if (randomNumber <= cumulativeFrequency) {
                prizeToys.add(toy);
                toy.setQuantity(toy.getQuantity() - 1);
                return toy;
            }
        }

        return null;
    }

    // Method to get a prize toy
    public Toy getPrizeToy() {
        if (!prizeToys.isEmpty()) {
            Toy prizeToy = prizeToys.get(0);
            prizeToys.remove(0);

            try {
                FileWriter writer = new FileWriter("prize_toys.txt", true);
                writer.write(prizeToy.getName() + System.lineSeparator());
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return prizeToy;
        }

        return null;
    }
}
