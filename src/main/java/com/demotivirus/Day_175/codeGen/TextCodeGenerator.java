package com.demotivirus.Day_175.codeGen;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextCodeGenerator {
    public static void generate(String className) {
        //className.concat(".java");
        File file = new File("src/main/java/com/demotivirus/Day_175/generated_classes/" + className + ".java");
        try(FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            String codeGen = """
                package com.demotivirus.Day_175.generated_classes;
                
                public class %s {
                    
                }
                """
                    .formatted(className);
            out.println(codeGen);
        } catch (IOException e) {
            //exception handling left as an exercise for the reader
        }
    }
}
