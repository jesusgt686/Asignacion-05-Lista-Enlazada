package linkedlist;

import java.util.Iterator;

public interface IList<T> {
    
    public void append(T elements) throws ListException;
    public void insert(T elements, int index) throws ListException;
    public T remove(int index) throws ListException;
    public boolean removeObj (T element) throws ListException;
    public int indexOf(T elements);
    public T get(int index) throws ListException;
    public void set(T elements, int index) throws ListException;
    public void clear();
    public boolean empty();
    public int size();
    public Iterator<T> Iterator();
    
}

