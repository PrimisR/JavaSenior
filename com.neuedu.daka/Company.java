import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class Company
{
    private List<Employee> emps=new ArrayList<>();
    private Map<String,List<Daka>> dakaInfo=new HashMap<>();

    public Company()
    {
        emps.add(new Employee(1,"Tom"));
        emps.add(new Employee(2,"Jack"));
        emps.add(new Employee(3,"Mary"));
    }

    //add employee
    
    //remove employee

    //get employee by id
    public Employee getEmpoyeeById(int id)
    {
        for(Employee e:emps)
        {
            if(e.getId()==id)
            {
                return e;
            }
        }
        return null;
    }

    /**
     * @return the dakaInfo
     */
    public Map<String, List<Daka>> getDakaInfo() {
        return dakaInfo;
    }
    /**
     * @return the emps
     */
    public List<Employee> getEmps() {
        return emps;
    }
}