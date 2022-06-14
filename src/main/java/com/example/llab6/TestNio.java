package com.example.llab6;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.io.File;

public class TestNio {
    public static void main(String[] args) throws IOException {
       long startTime = System.currentTimeMillis();
  //    long startTime = System.nanoTime();
      File orginal = new File("sample_1920×1280.tiff");
      File kopia = new File("img_copy2.tiff");
      Files.copy(orginal.toPath(), kopia.toPath(), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Czas kopiowania: " +(float)(System.currentTimeMillis() - startTime)+" ms");
    //  System.out.println("Czas kopiowania: " +(float)(System.nanoTime() - startTime)/1000000+" ms");
    }
}
