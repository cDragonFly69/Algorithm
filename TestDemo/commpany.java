package TestDemo;

import javax.xml.crypto.Data;

public class commpany {

    //������
    class Department {
        private String departmentId;
        private String name;

        public String getName(){

            return name;
        }
        public void setName(String name){
            this.name=name;
        }
        public String getDepartmentId(){
            return departmentId;
        }
        public void setDepartmentId(String departmentId){
            this.name=departmentId;
        }
    }
    //Ա����
    class Employee{
        private String employeeName;
        private int age;
        private char sex;
        public String getEmployeeName(){
            return employeeName;
        }
        public int getAge(){
            return age;
        }
        public char getSex(){
            return sex;
        }

        public void setAge(int age) {
            this.age = age;
        }
        public void setEmployeeName(int employeeName) {
            this.age = employeeName;
        }
        public void setSex(char sex) {
            this.age = sex;
        }
    }
    abstract class person{
        private String name;
        public String getName(){
           return name;
        }
        public void show(int i, String ...str){
//�ɱ�������βα���������ĩβ��
        }
//        public void show(String ...str��int i){
//�˷���Ϊ����ʾ��
//        }

    }
}
