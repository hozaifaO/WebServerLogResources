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
        HashMap<String,Integer> counts = log.countVisitsPerIp();
        System.out.println("There is/are " + log.countUniqueIPs()+" Unique IP's");
        System.out.println(counts);
    }
}
