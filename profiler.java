public class profiler{
    public static long measureTime(Runnable codigo){
        long startTime = System.currentTimeMillis();
        codigo.run();
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}