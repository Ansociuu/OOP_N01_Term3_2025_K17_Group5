/*import TestUser;
import TestProduct;
import TestOrder;
import TestPayment;*/

public class Main 
{
    public static void main(String[] args) /*throws Exception*/ 
    {
        TestUser.test();
        TestProduct.main();
        TestOrder.main();
        TestPayment.main();
        TestTime.test();

        TestUser us = new TestUser();
        us.testEdit();

        TestOrder testorder = new TestOrder();
        testorder.testEdit();
        
    }
}