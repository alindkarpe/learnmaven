package learn.in.model;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Required;

@XmlRootElement(name = "userDomain")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserDomain {

	private Integer userId;
	@NotNull
	@NotBlank
	private String userName;
	private Date userDob;
	private boolean isPermanent;



	/**
	 * 
	 */
	public UserDomain() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param userId
	 * @param userName
	 * @param userDob
	 * @param isPermanent
	 */
	public UserDomain(Integer userId, String userName, Date userDob, boolean isPermanent) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userDob = userDob;
		this.isPermanent = isPermanent;
	}
	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * @return the userName
	 */
	@Required
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the userDob
	 */
	public Date getUserDob() {
		return userDob;
	}
	/**
	 * @param userDob the userDob to set
	 */
	public void setUserDob(Date userDob) {
		this.userDob = userDob;
	}
	/**
	 * @return the isPermanent
	 */
	public boolean isPermanent() {
		return isPermanent;
	}
	/**
	 * @param isPermanent the isPermanent to set
	 */
	public void setPermanent(boolean isPermanent) {
		this.isPermanent = isPermanent;
	}

	@Override
	public String toString() {
		return "UserDomain [userId=" + userId + ", userName=" + userName + ", userDob=" + userDob + ", isPermanent="
				+ isPermanent + "]";
	}




}
