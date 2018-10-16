package lesson04;

import java.util.Iterator;

/*
 *@author Yakovlev Alexandr
 */
public interface MyIterator<T> extends Iterator {
    void reset();
    boolean atEnd();
    boolean atBegin();
    T deleteCurrent();
    void insertAfter(T c);
    void insertBefore(T c);
    T getCurrent();
}
