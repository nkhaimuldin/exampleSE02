class Employee {
    public int id;
    public String name;
    public int age;
    public String gender;

    public Employee(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setIDEmployee(int id) {
        this.id = id;
    }

    public int getIDEmployee() {
        return id;
    }

    public void setNameEmployee(String name) {
        this.name = name;
    }

    public String getNameEmployee() {
        return name;
    }

    public void setAgeEmployee(int age) {
        this.age = age;
    }

    public int getAgeEmployee() {
        return age;
    }

    public void setGenderEmployee(String gender) {
        this.gender = gender;
    }

    public void exampleEmployee(){
        System.out.println("example");
    }

    public String getGenderEmployee() {
        return gender;
    }
}