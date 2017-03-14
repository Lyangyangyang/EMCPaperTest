package com.yang.rest.client;
import javax.ws.rs.client.Client;  
import javax.ws.rs.client.ClientBuilder;  
import javax.ws.rs.client.Entity;  
import javax.ws.rs.client.WebTarget;  
import javax.ws.rs.core.MediaType;  
import javax.ws.rs.core.Response;  
  

  
import com.yang.rest.bean.Lun;  
  
   
 
public class LunClient {  
  
    private static String serverUri = "http://localhost:8080/StorageSimulator/rest";  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
    	getLunById() ;
    	
    	addLun(); 
        updateLun();
        delLun();
        getAllLuns();
  
    }  
    
    public static void addLun() {
		
        Lun lun = new Lun("003","lun3","1G","ig1","tg1");    
        Client client = ClientBuilder.newClient();  
        WebTarget target = client.target(serverUri + "/lun");  
        Response response = target.request().buildPost(Entity.entity(lun, MediaType.APPLICATION_XML)).invoke();  
        response.close();
	}
       
   
     private static void delLun() {  
       
         Client client = ClientBuilder.newClient();  
         WebTarget target = client.target(serverUri + "/lun/003");  
         Response response = target.request().delete();  
         response.close();  
    }  
       
   
     private static void updateLun() {  
        
         Lun lun = new Lun("003","lun3","3G","ig1","tg1");    
         Client client = ClientBuilder.newClient();  
         WebTarget target = client.target(serverUri + "/lun");  
         Response response = target.request().buildPut( Entity.entity(lun, MediaType.APPLICATION_XML)).invoke();  
         response.close();  
    }  
    
     private static void getLunById() {  
         
         Client client = ClientBuilder.newClient();
         WebTarget target = client.target(serverUri + "/lun/001");  
         Response response = target.request().get();  
         
         response.close();  
    }  
   
     private static void getAllLuns() {  
        
           
         Client client = ClientBuilder.newClient();  
  
         WebTarget target = client.target(serverUri + "/lun");  
         Response response = target.request().get();  
        response.close();  
     }  
       
}  

