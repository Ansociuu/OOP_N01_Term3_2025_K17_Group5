public class Customer extends User         //tính kế thừa 
{
    public void signUp(String userId, String name, String gender, String birthDate, String phoneNumber,        //tính đa hình
                String email, String address, String password) 
    {
        this.userId = userId;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.password = password;
        this.userType = "Khách hàng";
    }
    
    public void buy(String productName)     //mua sản phẩm
    {
        System.out.println(name + " đã mua sản phẩm: " + productName);
    }
}
