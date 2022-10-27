package LogFactory;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public abstract class Log {

        public String content;
}

    class fileLog extends Log {

        public fileLog(String numeros){
            Path file = Paths.get("src/LogFactory/log.txt");
            byte data[] = numeros.getBytes();
            try (OutputStream out = new BufferedOutputStream(
                    Files.newOutputStream(file, CREATE, APPEND))) {
                out.write(data, 0, data.length);
            } catch (IOException x) {
                System.err.println(x);
            }
        }
    }

    class consoleLog extends Log {

        public consoleLog(String numeros){
            System.out.println(numeros);
        }
    }
