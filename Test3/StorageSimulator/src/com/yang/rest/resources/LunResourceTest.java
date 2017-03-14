package com.yang.rest.resources;



import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.junit.Before;
import org.junit.Test;

import com.yang.rest.bean.Lun;

public class LunResourceTest {
	private static String serverUri = "http://localhost:8080/StorageSimulator/rest";  
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCreateLun() {
		
         Lun lun = new Lun("002","lun2","1G","ig1","tg1");    
         Client client = ClientBuilder.newClient();  
         WebTarget target = client.target(serverUri + "/lun");  
         Response response = target.request().buildPost(Entity.entity(lun, MediaType.APPLICATION_XML)).invoke();  
         response.close();
	}

	@Test
	public void testDeleteLun() {
		 Client client = ClientBuilder.newClient();  
         WebTarget target = client.target(serverUri + "/lun/002");  
         Response response = target.request().delete();  
         response.close(); 
		
	}

	@Test
	public void testUpdateLun() {
		 Lun lun = new Lun("002","lun2","3G","ig1","tg1");    
         Client client = ClientBuilder.newClient();  
         WebTarget target = client.target(serverUri + "/lun");  
         Response response = target.request().buildPut( Entity.entity(lun, MediaType.APPLICATION_XML)).invoke();  
         response.close(); 
		
	}

	@Test
	public void testGetLunById() {
		 Client client = ClientBuilder.newClient();
         WebTarget target = client.target(serverUri + "/lun/002");  
         Response response = target.request().get();  
         
         response.close();
	}

	@Test
	public void testGetAllLuns() {
		Client client = ClientBuilder.newClient();  
		  
        WebTarget target = client.target(serverUri + "/lun");  
        Response response = target.request().get();  
       response.close(); 
	}

}
