package Fantasy_game;

import Fantasy_game.units.*;
import java.util.*;


        public class Main {
            public static final int UNITS = 10;
            public static ArrayList<Hero> group_elves = new ArrayList<>();
            public static ArrayList<Hero> group_people = new ArrayList<>();
            public static ArrayList<Hero> allTeam = new ArrayList<>();

            public static void main(String[] args) {
                init();
                Scanner input = new Scanner(System.in);
                while (true){
                    allTeam = sortTeam();
                    View.view();
                    input.nextLine();
                    for (Hero human: allTeam) {
                        if (group_people.contains(human)) human.step(group_people, group_elves);
                        else human.step(group_elves, group_people);
                    }
                }
            }

            private static void init() {
                for (int i = 0; i < UNITS; i++) {
                    int rnd = new Random().nextInt(4);
                    switch (rnd) {
                        case (0):
                            group_elves.add(new Archer(new Vector2D(i+1, 1)));
                            break;
                        case (1):
                            group_elves.add(new Knight(new Vector2D(i+1, 1)));
                            break;
                        case (2):
                            group_elves.add(new Spectrum(new Vector2D(i+1, 1)));
                            break;
                        default:
                            group_elves.add(new Militiaman(new Vector2D(i+1, 1)));
                    }

                    rnd = new Random().nextInt(4);
                    switch (rnd) {
                        case (0):
                            group_people.add(new Militiaman(new Vector2D(i+1, 10)));
                            break;
                        case (1):
                            group_people.add(new Crossbowman(new Vector2D(i+1, 10)));
                            break;
                        case (2):
                            group_people.add(new Monk(new Vector2D(i+1, 10)));
                            break;
                        default:
                            group_people.add(new Spearman(new Vector2D(i+1, 10)));
                    }
                }
            }
            private static ArrayList<Hero> sortTeam (){
                ArrayList<Hero> list = new ArrayList<>();
                list.addAll(group_elves);
                list.addAll(group_people);
                list.sort(new Comparator<Hero>() {
                    @Override
                    public int compare(Hero t0, Hero t1) {
                        if (t1.getSpeed() == t0.getSpeed()) return (int) (t1.getHp() - t0.getHp());
                        else  return (int) (t1.getSpeed() - t0.getSpeed());
                    }
                });
                return list;
            }
        }