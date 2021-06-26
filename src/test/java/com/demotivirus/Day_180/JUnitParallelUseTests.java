package com.demotivirus.Day_180;

import org.junit.experimental.ParallelComputer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;

public class JUnitParallelUseTests {
    @Test
    @DisplayName("Not working?")
    public void runTestsParallel() {
        Class[] classes = {ParallelClass1Test.class, ParallelClass2Test.class, UserImplTest.class};
        JUnitCore.runClasses(ParallelComputer.classes(), classes);
        System.out.println("===================================");
        JUnitCore.runClasses(ParallelComputer.methods(), classes);
        System.out.println("===================================");
        JUnitCore.runClasses(new ParallelComputer(true, true), classes);
    }
}
