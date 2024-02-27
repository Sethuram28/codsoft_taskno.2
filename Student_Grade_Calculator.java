import java.util.Scanner;

public class Student_Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.println("Enter number of Subjects");
        int ns=sc.nextInt();
        int total=0;
        for(int i=0;i<ns;i++){
            System.out.println("Enter Marks obtained in "+(i+1)+": ");
            int Marks=sc.nextInt();
            total+=Marks;
        }
        double average=(double)total/ns;
        char Grade;
        if (average>=90){
            Grade='O';
        }
        else if (average>=80){
            Grade='A';
        }
        else if (average>=70){
            Grade='B';
        }
        else if (average>=60){
            Grade='C';
        }
        else if (average>=50){
            Grade='D';
        }
        else if (average>=40){
            Grade='E';
        }
        else {
            Grade='F';
        }
        System.out.println("Total Marks Scored is : " +total);
        System.out.println("Average Percentage Obtained is : " +average);
        System.out.println("Grade obtained is : " +Grade);
    }

}