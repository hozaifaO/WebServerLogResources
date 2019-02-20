import java.util.Date;
/**
 * Description of LogEntery here.
 * 
 * @author Hozaifa Owaisi 
 * @version 1.0
 */
public class LogEntery {
    //Inforamtion in a request thats valuable stored in varibales.
    private String IpAdress;
    private Date DateAndTime;
    private String Request;
    private int StatusCode;
    private int BytesReturned;
    //Constructor Methord.
    public LogEntery(String ip,Date time,String req,int status,int bytes) {
        IpAdress = ip;
        DateAndTime = time;
        Request = req;
        StatusCode = status;
        BytesReturned = bytes;
    }
    //Get methords for these variables.
    public String getIp() { return IpAdress;}
    public Date getDate() { return DateAndTime;}
    public String getRequest() { return Request;}
    public int getStatusCode() { return StatusCode;}
    public int getBytesReturned() { return BytesReturned;}
    public String toString() {
        return IpAdress+"  "+ DateAndTime+ "  "+Request+"  "+StatusCode+"  "+"  "+BytesReturned ;
    }
    
}
