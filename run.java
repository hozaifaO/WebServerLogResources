import java.util.Scanner;
/**
 * Write a description of Test here.
 * 
 * @author Hozaifa Owaisi 
 * @version 0x01
 */
public class run {
    public static void main(String args) {
        LogAnalyzer log = new LogAnalyzer();
        log.readFile(args); 
        System.out.println("There is/are " + log.countUniqueIPs()+" Unique IP's");
    }
}
