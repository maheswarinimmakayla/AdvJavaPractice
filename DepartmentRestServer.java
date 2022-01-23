package com.departmentrestexample;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/api/v1") 
public class DepartmentRestServer {
ArrayList<Department> depList = new ArrayList<Department>();
	
	@Path("/departmentdetails")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Department> getAllDepartment(){
		depList = createDepartmentList();
		return depList;
	}
	
	public ArrayList<Department> createDepartmentList() {
		depList.add(new Department(123,"rama","hyd"));
		depList.add(new Department(124,"ram","hyd"));
		depList.add(new Department(125,"raghs","hyd"));
		return depList;
	}

}
