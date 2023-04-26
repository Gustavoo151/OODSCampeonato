package src;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LogGenerator {
    
    
    public static void generateLog(String menssagem, StackTraceElement[] stackTrace ) throws IOException{
        Path path = Paths.get("C:/Users/joseg/Documents/NetBeansProjects/OODSCampeonato/src/Logs");
                
        if(!Files.exists(path)){
            
            Files.createDirectory(path);           
        }
        
        File log = new File("C:/Users/joseg/Documents/NetBeansProjects/OODSCampeonato/src/Logs/logsExceptions.txt");
        
        if(!log.exists()){
            
            log.createNewFile();
        }
        
        FileWriter fw = new FileWriter(log, true);
        
        BufferedWriter bw = new BufferedWriter(fw);
        
        bw.write(menssagem);
        bw.newLine();
        bw.write(stackTrace.toString());
        bw.newLine();

        
        
        bw.close();
        fw.close();
    }
}
