package obj;
import java.util.ArrayList;
import java.lang.Object;

public class ObjectList 
{

    ArrayList<User> st = new ArrayList<User>();
    ArrayList<Product> pro = new ArrayList<Product>();
    ArrayList<Order> ord = new ArrayList<Order>();
    ArrayList<Payment> pay = new ArrayList<Payment>();
    ArrayList<Object> obj = new ArrayList<Object>();
    
    public ArrayList<Object> addObject(Object user_1) 
    {
    // System.out.println("test getClass return :" + user_1.getClass().getName());
 
        if (user_1.getClass().getName() == "User") 
        {
            obj.add((User) user_1);
            return obj;
        }
        else if (user_1.getClass().getName() == "Product") 
        {
            obj.add((Product) user_1);
            return obj;
        }
        else if (user_1.getClass().getName() == "Order") 
        {
            obj.add((Order) user_1);
            return obj;
        }
        else {
            obj.add((Payment) user_1);
            return obj;
        }
    }

    public  void printObject() throws Exception
    {
        for (int i=0; i < obj.size(); i++)
        {
            System.out.print("Name Of Class: ");
            System.out.println(obj.get(i).getClass().getName());
            
            System.out.print("ID: ");
            System.out.println(obj.get(i).getClass().getField("ID").getInt(obj.get(i)));

            System.out.print("Name: ");
            System.out.println(obj.get(i).getClass().getField("Name").get(obj.get(i)));
        }
        
    }

   
}