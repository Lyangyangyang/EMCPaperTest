package com.yang.rest.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;  
import javax.ws.rs.Produces;  
import javax.ws.rs.PathParam;  
import javax.ws.rs.core.MediaType;

import com.yang.rest.bean.Lun;
import com.yang.rest.dao.LunDao;  
  
  
@Path("/lun")  
public class LunResource {  
	  private LunDao lunDao= new LunDao();  
	   
	    @POST  
	    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})  
	    public void createLun(Lun lun)  
	    {  
	    	
	        lunDao.createLun(lun);  
	    }  
	      
	    /** 
	     * delete
	     * @param id 
	     */  
	    @DELETE  
	    @Path("{id}")  
	    public void deleteLun(@PathParam("id")String id){  
	        lunDao.deleteLunById(id);  
	    }  
	      
	    /** 
	     * 修改 
	     * @param user 
	     */  
	    @PUT  
	    @Consumes(MediaType.APPLICATION_XML)  
	    public void updateLun(Lun lun){  
	        lunDao.updateLun(lun);  
	    }  
	   
	    /** 
	     * 根据id查询 
	     * @param id 
	     * @return 
	     */  
	    @GET  
	    @Path("{id}")  
	    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})  
	    public Lun getLunById(@PathParam("id") String id){  
	        Lun lun= lunDao.getLunById(id);  
	        return lun;  
	    }  
	     
	    /** 
	     * 查询所有 
	     * @return 
	     */  
	    @GET  
	    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})  
	    public List<Lun> getAllLuns(){       
	        List<Lun> luns = new ArrayList<Lun>();     
	        luns = lunDao.getAllLuns();  
	        return luns;  
	    }  
	      
	      
	}  
      
 