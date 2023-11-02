package GrammarPratice;
/**
 * @author Michael  Dragon
 */ //封装的案例代码
//如果不封装的话，就会导致外部更改参数的类型，封装即以定义好类型，外部只需要调用setter和getter即可
public class encapsulation {

    private String name;
    private int age;
    private String gender;

    //构造器的使用
     public encapsulation(String name,String gender,int age){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
       return age;
    }
    public void  setAge(int age){
        this.age = age;
    }

    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender=gender;
    }

}
