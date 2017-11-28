package vehicale_management;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="Car_Details",uniqueConstraints={
		@UniqueConstraint(columnNames="Car_Register_Number",name="car_register_number_un_con"),
		@UniqueConstraint(columnNames="Car_Id",name="car_id_un_con")		
})
public class cardetails {
	@Column(name="Car_Register_Number",nullable=false)
	private String car_register_number;
	@Column(name="Car_Id",nullable=false)
	private String car_id;
	@Column(name="Car_Brand",nullable=false)
	private String car_brand;
	@Column(name="Car_Model",nullable=false)
	private String car_model;
	@Column(name="In_Date",nullable=false)
	private String in_date;
	@Column(name="Out_Date",nullable=false)
	private String out_date;
	
	public cardetails(String car_register_number, String car_id, String car_brand, String car_model, String in_date, String out_date) {
		super();
		this.car_register_number = car_register_number;
		this.car_id = car_id;
		this.car_brand = car_brand;
		this.car_model = car_model;
		this.in_date = in_date;
		this.out_date = out_date;
	}
	public String getCar_Register_Number() {
		return car_register_number;
	}
	public void setCar_Register_Number(String car_register_number) {
		this.car_register_number = car_register_number;
	}
	public String getCar_Id() {
		return car_id;
	}
	public void setCar_Id(String car_id) {
		this.car_id = car_id;
	}
	public String getCar_Brand() {
		return car_brand;
	}
	public void setCar_Brand(String car_brand) {
		this.car_brand = car_brand;
	}
	public String getCar_Model() {
		return car_model;
	}
	public void setCar_Model(String car_model) {
		this.car_model = car_model;
	}
	public String getIn_Date() {
		return in_date;
	}
	public void setIn_Date(String in_date) {
		this.in_date = in_date;
	}
	public String getOut_Date() {
		return out_date;
	}
	public void setOut_Date(String out_date) {
		this.out_date = out_date;
	}


}
	