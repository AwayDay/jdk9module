package com.awayday.main;

import com.awayday.sub.Service;
// import com.awayday.sub.util.Util;

public class Main {
    public static void main(String[] args) {
        // ERROR : 'sub'(module) doesn't export 'util'(package)
        // Util.printInteger("zero", 0);

        // RUN
        Service.printCalcurateResult(4, 2);
    }
}
