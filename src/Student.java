public class Student {
    private String name;
    private String surName;
    private String email;
    private int age;

    public void setName(String aty){
        name = aty;
    }
    public String getName(){
        return name;
    }

    public void setSurName(String familiyasy){
        surName = familiyasy;
    }
    public String getSurName(){
        return surName;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    public void setAgeCheck (int jash){
        if(jash > 0){
            age = jash;
        }else {
            System.out.println("jash tuura emes berildi");
        }
    }
    public int getAgeCheck(){
        return age;
    }



}
