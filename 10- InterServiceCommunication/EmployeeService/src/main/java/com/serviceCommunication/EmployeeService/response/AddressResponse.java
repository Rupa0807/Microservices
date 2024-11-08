package com.serviceCommunication.EmployeeService.response;


public class AddressResponse {
    private Long id;
    private String lane1;
    private String lane2;
    private String city;
    private String state;
    private String zip;

    public AddressResponse(String city, Long id, String lane1, String lane2, String state, String zip) {
        this.city = city;
        this.id = id;
        this.lane1 = lane1;
        this.lane2 = lane2;
        this.state = state;
        this.zip = zip;
    }

    public AddressResponse() {

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLane1() {
        return lane1;
    }

    public void setLane1(String lane1) {
        this.lane1 = lane1;
    }

    public String getLane2() {
        return lane2;
    }

    public void setLane2(String lane2) {
        this.lane2 = lane2;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
//private String empId;
}
