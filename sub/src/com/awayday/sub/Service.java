package com.awayday.sub;

import com.awayday.sub.util.Util;

public class Service {
    public static void printCalcurateResult(int a, int b) {
        Util.printInteger("a + b", a + b);
        Util.printInteger("a - b", a - b);
        Util.printInteger("a * b", a * b);
        Util.printInteger("a / b", a / b);
    }
}
