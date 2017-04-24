package runtimeCalculations;

public class calculateRuntime {
	private static long StartZeitpunkt = 0;
	private static long EndZeitpunkt = 0;
	private static double runTime = 0;
	
	public static void setStartTime() {
		long StartNow = System.currentTimeMillis();
		StartZeitpunkt = StartNow;
	}
	public static void setEndTime() {
		long EndNow = System.currentTimeMillis();
		EndZeitpunkt = EndNow;
	}
	public static double getRuntime() {
		if(StartZeitpunkt != 0 && EndZeitpunkt != 0)
			runTime = EndZeitpunkt - StartZeitpunkt;
		else
			System.out.println("Please set start and end, before calculation!");
		return runTime;
	}
	public static void Output() {
		System.out.println(StartZeitpunkt);
		System.out.println(EndZeitpunkt);
		System.out.println(runTime);
	}
}
