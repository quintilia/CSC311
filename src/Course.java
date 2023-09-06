public class Course {
    private int ID;
    private String name;
    private String code;


    //constructors
    public Course(int ID, String name, String code) {
        this.ID = ID;
        this.name = name;
        this.code = code;
    }


    public Course(){
        this.ID = 0;
        this.name = "";
        this.code = "";
    }


    //getter + setter
    public int getID() {
        return ID;
    }


    public void setID(int ID) {
        this.ID = ID;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getCode() {
        return code;
    }


    public void setCode(String code) {
        this.code = code;
    }
}

