public interface Seno {
    public static double seno(double num){
        double a = Math.toRadians(num);
        double result = Math.sin(a);
        return result;
    }
}
