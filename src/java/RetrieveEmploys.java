
import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;



public class RetrieveEmploys {
    public Employ display(int id)
    {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Employ em=null;
        Transaction t=s.beginTransaction();
        Criteria c = s.createCriteria(Employ.class).add(Restrictions.eq("id", id) );
        List emp=c.list();
        for(Iterator iterator = emp.iterator(); iterator.hasNext();)
        {  em=(Employ) iterator.next();
        int empid=em.getId();
        String empname=em.getName();
        String empaddress=em.getAddress();
        int empage=em.getAge();
        System.out.println(empid+empname+empaddress+empage);
        }
        return em;
    }
    
}
