package GrammarPratice;

public class Case {
    public static void main(String[] args) {
        char grade = 'G';
        switch (grade) {
            case 'A':
                System.out.println("成绩优秀");
                break;
            case 'B':
            case 'C':
                System.out.println("成绩良好~");
                break;
            case 'D':
                System.out.println("刚好及格哟~");
                break;
            case 'F':
                System.out.println("成绩不太理想~");
            break;
            default:
                System.out.println("未知等级###");
        }
        System.out.println("你的成绩为："+grade);
    }
}