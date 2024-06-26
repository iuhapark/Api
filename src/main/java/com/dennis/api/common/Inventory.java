package com.dennis.api.common;

import java.util.ArrayList;

public class Inventory<T> {
    private ArrayList<T> inventory;

    public Inventory(ArrayList<T> inventory) {
        this.inventory = new ArrayList<>();
    }
    public void add(T t){
        inventory.add(t);
    }
    public T remove(int index){
        return inventory.remove(index);
    }

    public boolean contains(T t) {
        return inventory.contains(t);
    }

    public T get(int index) {
        return inventory.get(index);
    }

    public void clear(){
        inventory.clear();
    }


}
