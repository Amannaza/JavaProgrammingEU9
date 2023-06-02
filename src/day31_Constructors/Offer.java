package day31_Constructors;

public class Offer {

    public String location;
    public String companyName;
    public String jobtitle;

    public double salary;
    public boolean hasBenefit, hasPTO, isWFF, isFullTime;


    public void setInfo(String location, String companyName, String jobtitle, double salary, boolean hasBenefit, boolean hasPTO, boolean isWFF, boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobtitle = jobtitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFF = isWFF;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobtitle='" + jobtitle + '\'' +
                ", salary=$" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFF=" + isWFF +
                ", isFullTime=" + isFullTime +
                '}';
    }

}


    /*warmup tasks:
        Offer Task:
        1. Create a custom class named Offer
        Attributes:
        location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime

        Actions:
        setInfo(): sets all the instance variables
        toString(): returns the full info of the Offer Object*/