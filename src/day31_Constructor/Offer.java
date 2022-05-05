package day31_Constructor;

public class Offer {
    public String location, companyName, jobTitle;
    public double salary;
    public boolean hasBenefit, hasPHO, isWFH, isFullTime;

    public void setInfo(String location, String companyName, String jobTitle, double salary, boolean hasBenefit, boolean hasPHO, boolean isWFH, boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPHO = hasPHO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPHO=" + hasPHO +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                '}';
    }


}
