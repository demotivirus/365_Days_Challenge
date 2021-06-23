package com.demotivirus.Day_177;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

        System.out.println(System.getProperty("user.dir"));
        String classPath = Test.class.getCanonicalName();
        System.out.println("Store class path: " + classPath);
        String newClassPath = classPath.replace(".", "\\");
        String classPathWithoutName = newClassPath.substring(0, newClassPath.length() - 4);
        System.out.println(newClassPath);

        //File file = new File(System.getProperty("user.dir"));
//        String filePath = file.getAbsolutePath();
//        System.out.println(filePath);
//
//        String currentPackage = file.getAbsolutePath().substring(0, filePath.length() - 5);
//                //.concat("\\").concat(classPathWithoutName);
//        String currentPackageWithoutSlash = currentPackage.concat("\\");
//        String finishPackageName = currentPackageWithoutSlash.concat(classPathWithoutName);
//        System.out.println(finishPackageName);

        //file = new File(currentPackage.concat("NewTest.java"));
        //File[] files = file.listFiles();

//        for (File f : files) {
//            if (f.toString().contains("src")) {
//                //System.out.println(f);
//                File[] listFiles = f.listFiles();
//                for (File f2 : listFiles) {
//                    if (f2.toString().contains("main")) {
//                        //System.out.println(f2);
//                        File[] listFiles2 = f.listFiles();
//                        for (File f3 : listFiles2) {
//                            if (listFiles2.toString().contains("java"))
//                                System.out.println(f3);
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(pack.getName());
//        file.createNewFile();
        //System.out.println();

//        File file = new File(args[0]);
//        System.out.println(file.toString());
//        //file.createNewFile();

        File file = new File(Test.class.getCanonicalName());
        System.out.println(file.getPath());
        System.out.println(file.getName());
    }
}
