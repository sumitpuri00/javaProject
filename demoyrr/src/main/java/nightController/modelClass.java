package nightController;
public class modelClass {
    private String umane;
    private String pword;
    public modelClass(String umane, String pword) {
        this.umane = umane;
        this.pword = pword;
    }

    public modelClass() {
    }

    public String getUmane() {
        return umane;
    }

    public void setUmane(String umane) {
        this.umane = umane;
    }

    public String getPword() {
        return pword;
    }

    public void setPword(String pword) {
        this.pword = pword;
    }

    @Override
    public String toString() {
        return "modelClass{" +
                "umane='" + umane + '\'' +
                ", pword='" + pword + '\'' +
                '}';
    }
}

