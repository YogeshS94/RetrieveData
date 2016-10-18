
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
@ManagedBean
@RequestScoped

public class Employ implements Serializable{
   private int id;
    private String name;
    private int age;
    private String address;

    public Employ() {
    }
    
   public String submit(){
       RetrieveEmploys re = new RetrieveEmploys();
       Employ e = re.display(this.getId());
       this.setId(e.getId());
       this.setName(e.getName());
       this.setAge(e.getAge());
       this.setAddress(e.getAddress());
       return "empdetails";
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
