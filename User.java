package vehicale_management;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="User_details",uniqueConstraints={
		@UniqueConstraint(columnNames="Email",name="email_un_con"),
		@UniqueConstraint(columnNames="Phone_no",name="phone_no_un_con")
})
public class User {
	@Column(name="User_Name",nullable=false)
	private String user_name;
	@Id
	@Column(name="User_Id",nullable=false)
	private int user_id;
	@Column(name="Password",nullable=false)
	private String password;
	@Column(name="Status",nullable=false)
	private static final int status=0;
	@Column(name="Email",nullable=false)
	private String email;
	@Column(name="Phone_no",nullable=false)
	private String phone_no;
	@Column(name="Address",nullable=false)
	private String address;
	public String getEmail() {
		return email;
	}
	public User(String user_name, int user_id, String password, String email, String phone_no,String address) {
		super();
		this.user_name = user_name;
		this.user_id = user_id;
		this.password = password;
		this.email = email;
		this.phone_no = phone_no;
		this.address=address;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public static int getStatus() {
		return status;
	}
	
}
