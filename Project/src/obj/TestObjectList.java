package obj;

import java.util.Arrays;

public class TestObjectList 
{
    public static void test() 
    {
        try 
        {
            // Tạo ObjectList
            ObjectList objList = new ObjectList();

            // Giả sử các class User, Product, Order, Payment có constructor (int id, String name)
            User user1 = new User("KH001", "Nguyễn Văn An", "Nam", "2005-12-16", "0901239303",
                                      "a@gmail.com", "Hà Nội", "123456", "Khách hàng");
            Product product1 = new Product("P001", 1, "Laptop Dell", 12000000, 10, "Laptop chinh hang Dell");
            Order order1 = new Order("ORD001", "USER001", Arrays.asList(101, 102));
            Payment payment1 = new Payment(2001, 3001, 500000, "Tiền mặt", "Chưa thanh toán", null);
            
            // Thêm đối tượng vào ObjectList
            objList.addObject(user1);
            objList.addObject(product1);
            objList.addObject(order1);
            objList.addObject(payment1);

            // In thông tin đối tượng
            objList.printObject();

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
