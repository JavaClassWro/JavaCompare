public class Student implements Comparable<Student> {
    private String name;
    private Integer age;
    private String gender;

    public Student(String name, Integer age, String gender) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public String toString() {
        return "[" + this.name +","
                + this.age + ","
                + this.gender + "]";
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    public boolean equals(Object o) {
        if (o instanceof Student) {
            Student other = (Student) o;
            return this.name.equals(other.name)
                    && this.age.equals(other.age)
                    && this.gender.equals(other.gender);
        }
        return false;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public Integer getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }
}
