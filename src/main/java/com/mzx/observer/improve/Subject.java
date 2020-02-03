package com.mzx.observer.improve;

/**
 * @author ZhenXinMa
 * @date 2020/2/3 14:57
 */
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();

}
