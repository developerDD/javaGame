package com.ITVDN.Collections;

/**
 * Неизменяемый класс.
 * Применяют в hashMap для ключей (key)
 * Класс должен быть финализирован, и поля дожны быть константны.
 * Не должно быть методов для изменения обэкта (setров) только getры.
 */
public final class SimpleImmutableClass <K,T> {
    private final K id;
    private final T name;

    public SimpleImmutableClass(K id, T name) {
        this.id = id;
        this.name = name;
    }

    public K getId() {
        return id;
    }

    public T getName() {
        return name;
    }
}

