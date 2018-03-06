package project.multithread.active_object.concurrent;

public class ActiveObjectFactory {
	public static ActiveObject createObject() {
		return new ActiveObjectImpl();
	}
}
