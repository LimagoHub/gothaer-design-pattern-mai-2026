package math;

import common.LoggerProxy;

public class CalculatorFactory {

    private static boolean logger = false;
    private static boolean secure = false;
    private static boolean benchmark = false;

    public static boolean isLogger() {
        return logger;
    }

    public static void setLogger(final boolean logger) {
        CalculatorFactory.logger = logger;
    }

    public static boolean isSecure() {
        return secure;
    }

    public static void setSecure(final boolean secure) {
        CalculatorFactory.secure = secure;
    }

    public static boolean isBenchmark() {
        return benchmark;
    }

    public static void setBenchmark(final boolean benchmark) {
        CalculatorFactory.benchmark = benchmark;
    }

    public static Calculator createCalculator() {
        Calculator result =  new CalculatorImpl();
        //if(logger) result = new CalculatorLogger(result);
        if(logger) result = (Calculator) LoggerProxy.newInstance(result);
        if(secure) result = new CalculatorSecure(result);
        if(benchmark) result = new Calculatorbenchmark(result);
        return result;
    }
}
