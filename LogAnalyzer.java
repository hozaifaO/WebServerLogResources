
/**
 * Description of class LogAnalyzer here.
 * 
 * @author Hozaifa Owaisi 
 * @version 1.0
 * 
 */

import java.util.*;
import edu.duke.*;

public class LogAnalyzer
{
     private ArrayList<LogEntery> records;
     
     public LogAnalyzer() {
         records = new ArrayList<LogEntery>();
     }
        
     public void readFile(String filename) {
         FileResource name = new FileResource(filename);
         WebLogParser parser = new WebLogParser();
         for (String line : name.lines()) {
               records.add(parser.parseEntry(line));
         }
     }
     
     public HashMap<String,Integer> countVisitsPerIp() {
         HashMap<String,Integer> counts = new HashMap<String,Integer>();
         
         for(LogEntery le: records) {
             String ip = le.getIp();
             
             if ( !counts.containsKey(ip)){
                 counts.put(ip,1);
             }
             else{
                counts.put(ip,counts.get(ip) +1);
             }
         }
         return counts;
     }
     
     public int countUniqueIPs() {
        ArrayList<String> uniqueIps = new ArrayList<String>();
        for(LogEntery le : records) {
            String ipAddr = le.getIp();
            if(!uniqueIps.contains(ipAddr)) {
                 uniqueIps.add(ipAddr);
            }
        }
        return uniqueIps.size();
     }
     
}
