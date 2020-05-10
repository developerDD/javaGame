package com.ITVDN.Collections;

/**
 * Неизменяемый класс.
 * Применяют в hashMap для ключей (key)
 * Класс должен быть финализирован, и поля дожны быть константны.
 * Не должно быть методов для изменения обэкта (setров) только getры.
 */
public final class SimpleImmutableClass {
    private final int id;
    private final String name;

    public SimpleImmutableClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
