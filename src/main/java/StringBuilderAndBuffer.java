public class StringBuilderAndBuffer {

    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("java");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            stringBuffer.append("a");
        }
        System.out.println("Time taken by string buffer: " +
                (System.currentTimeMillis() - startTime)+" ms");

        StringBuilder stringBuilder = new StringBuilder("java");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            stringBuilder.append("a");
        }
        System.out.println("Time taken by string builder: " +
                (System.currentTimeMillis() - startTime)+" ms");
    }
}
