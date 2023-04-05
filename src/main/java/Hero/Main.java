package Hero;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import Hero.*;
public class Main {

    public static void main( String[] args ) {
        System.out.println( "\nПрограмма создат 2 списка по 10 случайных персонажей.\n" );

        int count = 10;

        List<Hero> list_1 = new ArrayList<>();
        for ( int i = 0; i < count; i++ ) {
            switch( new Random().nextInt( 4 ) ) {
                case 0:
                    list_1.add( new Rogue( getName() ) );
                    break;
                case 1:
                    list_1.add( new Sniper( getName() ) );
                    break;
                case 2:
                    list_1.add( new Warlock( getName() ) );
                    break;
                default:
                    list_1.add( new Peasant( getName() ) );
            }
        }

        List<Hero> list_2 = new ArrayList<>();
        for ( int i = 0; i < count; i++ ) {
            switch( new Random().nextInt( 4 ) ) {
                case 0:
                    list_2.add( new Spearman( getName() ) );
                    break;
                case 1:
                    list_2.add( new Crossbowman( getName() ) );
                    break;
                case 2:
                    list_2.add( new Monk( getName() ) );
                    break;
                default:
                    list_2.add( new Peasant( getName() ) );
            }
        }

        // Выборка по скорости от максимальной к минимальное
        // for (int i = 0; i < count * 2; i++) {
        System.out.println( "\nlist_1 - Не сортированный" );
        System.out.println( list_1 );

        Collections.sort( list_1 );

        System.out.println( "\nlist_1 - Сортированный" );
        System.out.println( list_1 );
        //

        System.out.println( "\nlist_2 - Не сортированный" );
        System.out.println( list_2 );

        Collections.sort( list_2 );

        System.out.println( "\nlist_2 - Сортированный" );
        System.out.println( list_2 );

    }


    private static String getName() {
        return Names.values()[ new Random().nextInt( Names.values().length ) ].toString();
    }
}
