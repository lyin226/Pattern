package com.observer;

//被观察者 主题
public interface Watched {
	public void addWatcher(Watcher watcher);
	public void removeWatcher(Watcher watcher);
	public void notifyWatchers(String string);

}
