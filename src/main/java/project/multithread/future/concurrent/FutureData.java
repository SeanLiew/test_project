package project.multithread.future.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import project.multithread.future.Data;
import project.multithread.future.RealData;

public class FutureData extends FutureTask<RealData> implements Data {

	public FutureData(Callable<RealData> callable) {
		super(callable);
	}

	@Override
	public String getContent() {
		String string = null;
		try {
			string = get().getContent();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		return string;
	}

}
