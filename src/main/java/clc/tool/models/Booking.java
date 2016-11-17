package clc.tool.models;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by qup on 11/17/16.
 */
public class Booking {

    private BigDecimal payment;
    private BigDecimal bonus;
    private String bookId;
    private String bookFrom;
    private String bookType;
    private String operator;
    private String passenger;
    private Date bookTime;
    private Date pickupTime;
    private Date dispatchTime;
    private Date onboardTime;
    private Date dropoffTime;
    private Date completedTime;
    private String driverName;
    private String company;
    private String pickup;
    private String dropOff;
    private String name;
    private Date birthDate;


    public Booking(String name, Date birthDate, BigDecimal payment, BigDecimal bonus) {
        this.driverName = name;
        this.name = name;
        this.bookTime = birthDate;
        this.birthDate = birthDate;
        this.payment = payment;
        this.bonus = bonus;
        this.pickup = "15 Quang Trung, Hải Châu 1, Q. Hải Châu, Đà Nẵng";
        this.dropOff = "9 Nguyễn Văn Linh, Nam Dương, Q. Hải Châu, Đà Nẵng";
        this.bookFrom = "CC";
        this.bookId = "1212121";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookFrom() {
        return bookFrom;
    }

    public void setBookFrom(String bookFrom) {
        this.bookFrom = bookFrom;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getPassenger() {
        return passenger;
    }

    public void setPassenger(String passenger) {
        this.passenger = passenger;
    }

    public Date getBookTime() {
        return bookTime;
    }

    public void setBookTime(Date bookTime) {
        this.bookTime = bookTime;
    }

    public Date getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(Date pickupTime) {
        this.pickupTime = pickupTime;
    }

    public Date getDispatchTime() {
        return dispatchTime;
    }

    public void setDispatchTime(Date dispatchTime) {
        this.dispatchTime = dispatchTime;
    }

    public Date getOnboardTime() {
        return onboardTime;
    }

    public void setOnboardTime(Date onboardTime) {
        this.onboardTime = onboardTime;
    }

    public Date getDropoffTime() {
        return dropoffTime;
    }

    public void setDropoffTime(Date dropoffTime) {
        this.dropoffTime = dropoffTime;
    }

    public Date getCompletedTime() {
        return completedTime;
    }

    public void setCompletedTime(Date completedTime) {
        this.completedTime = completedTime;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public String getDropOff() {
        return dropOff;
    }

    public void setDropOff(String dropOff) {
        this.dropOff = dropOff;
    }
}
