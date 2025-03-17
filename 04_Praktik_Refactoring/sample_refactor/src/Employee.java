public class Employee {
    private String name;
    private String phone;
    private String address;
    private String birthCity;
    private int birthDay;
    private int birthMonth;
    private int birtYear;
    private String emergencyContactName;
    private String emergencyContactPhone;
    private String emergencyContactAddress;
    private String employeeId;
    private float salary;
    private int deparment;
    private int joinDay;
    private int joinMonth;
    private int joinYear;

    public Employee(String name, String phone, String address, String birthCity, int birthDay, int birthMonth,
            int birtYear, String emergencyContactName, String emergencyContactPhone, String emergencyContactAddress,
            String employeeId, float salary, int deparment, int joinDay, int joinMonth, int joinYear) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.birthCity = birthCity;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birtYear = birtYear;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
        this.emergencyContactAddress = emergencyContactAddress;
        this.employeeId = employeeId;
        this.salary = salary;
        this.deparment = deparment;
        this.joinDay = joinDay;
        this.joinMonth = joinMonth;
        this.joinYear = joinYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirtYear() {
        return birtYear;
    }

    public void setBirtYear(int birtYear) {
        this.birtYear = birtYear;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public String getEmergencyContactPhone() {
        return emergencyContactPhone;
    }

    public void setEmergencyContactPhone(String emergencyContactPhone) {
        this.emergencyContactPhone = emergencyContactPhone;
    }

    public String getEmergencyContactAddress() {
        return emergencyContactAddress;
    }

    public void setEmergencyContactAddress(String emergencyContactAddress) {
        this.emergencyContactAddress = emergencyContactAddress;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getDeparment() {
        return deparment;
    }

    public void setDeparment(int deparment) {
        this.deparment = deparment;
    }

    public int getJoinDay() {
        return joinDay;
    }

    public void setJoinDay(int joinDay) {
        this.joinDay = joinDay;
    }

    public int getJoinMonth() {
        return joinMonth;
    }

    public void setJoinMonth(int joinMonth) {
        this.joinMonth = joinMonth;
    }

    public int getJoinYear() {
        return joinYear;
    }

    public void setJoinYear(int joinYear) {
        this.joinYear = joinYear;
    }
}
