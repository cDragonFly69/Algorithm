package GrammarPratice;
/**
 * @author Michael  Dragon
 */ //��װ�İ�������
//�������װ�Ļ����ͻᵼ���ⲿ���Ĳ��������ͣ���װ���Զ�������ͣ��ⲿֻ��Ҫ����setter��getter����
public class encapsulation {

    private String name;
    private int age;
    private String gender;

    //��������ʹ��
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
