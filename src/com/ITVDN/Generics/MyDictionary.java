package com.ITVDN.Generics;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class MyDictionary<TKey, TValue> {
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    List<MyDictionary.Pair<TKey, TValue>> table;

    public MyDictionary() {
        this.table = new ArrayList<>(DEFAULT_INITIAL_CAPACITY);
    }

    public MyDictionary(Map<TKey, TValue> map) {
        int size = map.size();
        table.addAll((Collection<? extends Pair<TKey, TValue>>) map);
    }

    public void add(TKey k, TValue v) {
        table.add(new Pair<>(k, v));
    }

    public Object[] toArrays() {
        return table.toArray();
    }

    public void sortByKey() {
//        Object[] arr = table.toArray();
//        Arrays.sort(arr);
//        table.clear();
//        for (int i = 0; i < arr.length; i++) {
//            table.add((Pair<TKey, TValue>) arr[i]);
//        }
        Collections.sort(table, new ComparatorByKey());
    }

    public void sortByValue() {
//        Object[] arr = table.toArray();
//        Arrays.sort(arr, new ComparatorByValue());
//        table.clear();
//        for (int i = 0; i < arr.length; i++) {
//            table.add((Pair<TKey, TValue>) arr[i]);
//        }
        Collections.sort(table, new ComparatorByValue());
    }

    public void showDictionary() {
        for (Pair<TKey, TValue> pair : table) {
            System.out.println(pair);
        }
    }

    static class Pair<K, V> implements Map.Entry, Comparable {
        K key;
        V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public Object setValue(Object o) {
            V oldValue = (V) o;
            this.value = (V) o;
            return oldValue;
        }

        @Override
        public int hashCode() {
            return 31 * 1 + (key.hashCode() + value.hashCode());
        }

        @Override
        public final boolean equals(Object o) {
            if (o == this) {
                return true;
            } else {
                if (o instanceof Map.Entry) {
                    Map.Entry<?, ?> e = (Map.Entry) o;
                    if (Objects.equals(this.key, e.getKey()) && Objects.equals(this.value, e.getValue())) {
                        return true;
                    }
                }
                return false;
            }
        }

        @Override
        public String toString() {
            return key + " " + value + " " + hashCode();
        }

        @Override
        public int compareTo(@NotNull Object o) {
            Pair<?, ?> e = (MyDictionary.Pair) o;

            if (this.key.hashCode() > e.key.hashCode()) {
                return 1;
            } else if (this.key.hashCode() < e.key.hashCode()) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}

class ComparatorByValue implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        return (int) ((MyDictionary.Pair) o).value - (int) ((MyDictionary.Pair) t1).value;
    }
}

class ComparatorByKey implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        String s =(String) ((MyDictionary.Pair) o).key;
        String s1 =(String) ((MyDictionary.Pair) t1).key;
        return s.compareTo(s1);
    }
}


class Main {
    public static void main(String[] args) {
        MyDictionary<String, Integer> dictionary = new MyDictionary<>();
        dictionary.add("Dfe", 12);
        dictionary.add("Aefr", 14);
        dictionary.add("Cdcd", 17);
        dictionary.add("Zcec", 1);
        dictionary.showDictionary();
        dictionary.sortByKey();
        dictionary.showDictionary();

//        System.out.println("A".hashCode()+" "+"B".hashCode()+" "+"Aa".hashCode()+" "+"Bb".hashCode()+" ");
    }
}
