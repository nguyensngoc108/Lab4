package Lab4;

import java.util.ArrayList;
import java.util.Date;


public class Project{
    private String projectIdl;
    Date startDate;
    Date endDate;
    ArrayList<Employee> employees = new ArrayList<Employee>();
    
    
    public Project(String projectIdl, Date startDate, Date endDate){
        this.projectIdl = projectIdl;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    

    public void setprojectidl(String projectIdl){
        this.projectIdl = projectIdl;
    }

    public String getprojectidl(){
        return projectIdl;
    }

    public void setstartDate(Date startDate){
        this.startDate = startDate;
    }

    public Date getstartDate(){
        return startDate;
    }

    public void setendDate(Date endDate){
        this.endDate = endDate;
    }

    public Date getendDate(){
        return endDate;
    }

    public void setemployees(ArrayList<Employee> employees){
        this.employees = employees;
    }

    public ArrayList<Employee> getemployees(){
        return employees;
    }

    


}
