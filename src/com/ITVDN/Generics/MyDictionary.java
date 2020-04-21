package com.ITVDN.Generics;

import java.util.Map;

public class MyDictionary<TKey,TValue> {


    static class Pair<K,V> implements Map.Entry{
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
            this.value=(V) o;
            return oldValue;
        }

        @Override
        public String toString() {
            return key+ " " + value;
        }
    }
}
