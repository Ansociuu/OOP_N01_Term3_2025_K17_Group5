public class Seller extends User 
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
        this.userType = "Nhà cung cấp";
    }

    public void sell(String productName)        //bán sản phẩm
    {
        System.out.println(name + " đã đăng bán sản phẩm: " + productName);
    }
}
