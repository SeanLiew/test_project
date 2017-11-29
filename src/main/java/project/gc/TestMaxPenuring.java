package project.gc;

/**
-Xms20m
-Xmx20m
-Xmn10m
-verbose:gc
-XX:+PrintGCTimeStamps
-XX:+PrintGCDetails
-Xloggc:D:/gcLogs/gc.log
-XX:SurvivorRatio=8
-XX:MaxTenuringThreshold=1
-XX:+PrintTenuringDistribution
-XX:+UseG1GC
*/
public class TestMaxPenuring {
	private static final int _1MB = 1024 * 1024;
	
	public static void main(String[] args) {
		byte[] allocation1, allocation2, allocation3;
		
		allocation1 = new byte[_1MB / 4];
		allocation2 = new byte[4 * _1MB];
		allocation3 = new byte[4 * _1MB];
		allocation3 = null;
		allocation3 = new byte[4 * _1MB];
	}
}
