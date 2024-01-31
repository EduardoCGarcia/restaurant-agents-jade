package com.edc.restaurant.tools;

public interface Observable {

    public void addObservable(Observer o);

    public void removeObservable(Observer o);

    public void notifyObservables();

    public void notifyObservables(Object arg);
}
