package com.CodeWars;

import java.util.ArrayList;
import java.util.List;

/**
 * Эта проблема получила свое название от, пожалуй, самого важного события в жизни древнего историка Иосифа:
 * согласно его рассказу, он и его 40 солдат были захвачены римлянами в пещеру во время осады.
 *
 * Отказываясь сдаться врагу, они вместо этого выбрали массовое самоубийство с изюминкой:
 * они образовали круг и продолжали убивать одного человека каждые три, пока не остался один последний человек
 * (и что он должен был убить себя, чтобы закончить акт ) .
 *
 * Ну, Иосиф и другой человек были последними двумя, и, поскольку теперь мы знаем каждую деталь истории,
 * вы, возможно, правильно догадались, что они не совсем поняли первоначальную идею.
 *
 * Теперь вы должны создать функцию, которая возвращает перестановку Джозефуса, принимая в качестве параметров
 * исходный массив / список элементов, которые нужно переставить, как если бы они были в круге, и отсчитывал каждые k мест,
 * пока не осталось ни одного.
 * Советы и примечания: помогает начать отсчет с 1 до n вместо обычного диапазона 0..n-1; k всегда будет> = 1.
 * [1,2,3,4,5,6,7] - initial sequence
 * [1,2,4,5,6,7] => 3 is counted out and goes into the result [3]
 * [1,2,4,5,7] => 6 is counted out and goes into the result [3,6]
 * [1,4,5,7] => 2 is counted out and goes into the result [3,6,2]
 * [1,4,5] => 7 is counted out and goes into the result [3,6,2,7]
 * [1,4] => 5 is counted out and goes into the result [3,6,2,7,5]
 * [4] => 1 is counted out and goes into the result [3,6,2,7,5,1]
 * [] => 4 is counted out and goes into the result [3,6,2,7,5,1,4]
 */
public class JosephusPermutation {
    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        List<T> newList = new ArrayList<T>();
        List<T> oldList = new ArrayList<>(items);
        int size = items.size();
        int indexDel=0;
        int countDed =0;
        while (true) {
            for (int i1 = 0; i1 < size; i1++) {
                if (countDed==size-1&&oldList.get(i1)!=null){
                    newList.add(oldList.get(i1));
                    return newList;
                }
                if (oldList.get(i1)!=null){
                    indexDel++;
                }
                if (indexDel==k&&oldList.get(i1)!=null){
                    newList.add(oldList.get(i1));
                    oldList.set(i1,null);
                    indexDel=0;
                    countDed++;

                }
            }
        }
    }
}
