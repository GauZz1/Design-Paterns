package FactoryMethod.FileFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class File{

    public String content;

}

class confidentialFile extends File {

    public confidentialFile(){
        Path file = Paths.get("src/FactoryMethod.FileFactory/confidencial.txt");
        try (InputStream in = Files.newInputStream(file);
             BufferedReader reader =
                     new BufferedReader(new InputStreamReader(in))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                this.content = line;
                System.out.println(this.content);
            }
        } catch (IOException error) {
            System.err.println(error);
        }
    }
}

class publicFile extends File {

    public publicFile(){
        Path file = Paths.get("src/FactoryMethod.FileFactory/public.txt");
        try (InputStream in = Files.newInputStream(file);
             BufferedReader reader =
                     new BufferedReader(new InputStreamReader(in))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                this.content = line;
                System.out.println(this.content);
            }
        } catch (IOException error) {
            System.err.println(error);
        }
    }
}
