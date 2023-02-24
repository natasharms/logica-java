package entities;

public class Height {

    private double h;
    private String gender;

    public Height(double h, String gender) {
        this.h = h;
        this.gender = gender;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}
