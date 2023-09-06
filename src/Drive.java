public class Drive {
    public static void main(String[] args) {
        Course c = new Course(300, "CompSci", "CSC");
        System.out.println("ID: " + c.getID() + ", Name: " + c.getName() + ", Code: " + c.getCode());
        c.setID(325);
        c.setName("Advanced Programming");
        c.setCode("CSC311");
        System.out.println("ID: " + c.getID() + ", Name: " + c.getName() + ", Code: " + c.getCode());
    }
}
