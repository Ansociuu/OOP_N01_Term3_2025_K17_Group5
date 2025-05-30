package obj;
public class UserObj
{
    private String id; //private -> tính đóng gói 
    private String name;
    private String field3;//gender;
    private String field4;//birthDate;
    private String field5;//honeNumber;
    private String field6;//email;
    private String field7;//address;
    private String field8;//password;
    private String field9;//userType;

    private int field10;             // Mã người bán (giữ int nếu muốn)
         // Tên sản phẩm
    private double field11;             // Giá sản phẩm
    private int field12;   

    public User(String userId, String name, String gender, String birthDate, String phoneNumber, 
            String email, String address, String password, String userType)
    {
        this.id = userId;
        this.name = name;
        this.field3 = gender;
        this.field4 = birthDate;
        this.field5 = phoneNumber;
        this.field6 = email;
        this.field7 = address;
        this.field8 = password;
        this.field9 = userType;
    }

    public String getUserId() { return id; }
    public String getName() { return name; }
    public String getGender() { return field3; }
    public String getBirthDate() { return field4; }
    public String getPhoneNumber() { return field5; }
    public String getEmail() { return field6; }
    public String getAddress() { return field7; }
    public String getPassword() { return field8; }
    public String getUserType() { return field9; }
    public void setName(String name)
    {
        this.name = name;

    } 
    public void setUser(String userId, String name, String gender, String birthDate, String phoneNumber, 
                            String email, String address, String password, String userType) 
    { 
        this.id = userId;
        this.name = name;
        this.field3 = gender;
        this.field4 = birthDate;
        this.field5 = phoneNumber;
        this.field6 = email;
        this.field7 = address;
        this.field8 = password;
        this.field9 = userType; 
    }
/*
    public boolean login(String loginId, String password)        //đăng nhập
    {
        return (loginId.equals(this.phoneNumber) || loginId.equals(this.email)) && password.equals(this.password);
    }*/

    public void showUser()          //hiển thị thông tin user
    {
        System.out.println("Mã người dùng: " + id);
        System.out.println("Tên: " + name);
        System.out.println("Giới tính: " + field3);
        System.out.println("Ngày sinh: " + field4);
        System.out.println("SĐT: " + field5);
        System.out.println("Email: " + field6);
        System.out.println("Địa chỉ: " + field7);
        System.out.println("Loại người dùng: " + field8);
    }
}
