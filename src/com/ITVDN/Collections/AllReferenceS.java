package com.ITVDN.Collections;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class AllReferenceS {
    /**
     * В джава есть 4 вида ссылок:
     * - сильная : Integer i = 1;
     * - мягкая : обертка магкой ссылкой сильную (если сильная NULL то сборщик мусора уберет её когда JVM нужна будет память)
     * - слабая : обертка слабой ссылкой сильную (если сильная NULL то сборщик мусора уберет её сразу)
     * - фантомная
     */
    public static void main(String[] args) {
        //сильная ссыка strong reference
        Integer i = 1;
        // мягкая ссылка soft reference
        SoftReference<Integer> softReference = new SoftReference<>(i);// оббертка сильной ссылки
        // слабая ссылка Weak reference
        WeakReference<Integer> weakReference = new WeakReference<>(i);
        //phantom reference
        PhantomReference<Integer> phantomReference = new PhantomReference<>(i,new ReferenceQueue<>());
    }
}
