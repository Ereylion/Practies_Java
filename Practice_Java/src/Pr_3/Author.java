package Pr_3;

public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName(String name) {
        return name;
    }
    public String getEmail(String email) {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public char getGender(char gender) {
        return gender;
    }
    public String toString(){
        return this.name+"("+this.gender+") at "+this.email;
    }

}
