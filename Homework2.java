import java.util.Scanner;

class Student{
    String number;
    String name;
    String major;
    String PhoneNumber;

    Student(String number, String name, String major, String PhoneNumber){
        this.number = number;
        this.name = name;
        this.major = major;
        this.PhoneNumber = PhoneNumber;
    }
    String getNumber(){return number;}
    String getName(){return name;}
    String getMajor(){return major;}
    String getPhoneNumber(){return PhoneNumber;}

    public String AddHypen() {
        if (PhoneNumber.length() == 10) {
            return "0" + PhoneNumber.substring(0, 2) + "-" + PhoneNumber.substring(2, 6) + "-" + PhoneNumber.substring(6);
        }
        else{
            return PhoneNumber.substring(0,3) +"-" + PhoneNumber.substring(3,7) + "_" + PhoneNumber.substring(7);
        }
    }
}
class Homework2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Student[] StudentArray = new Student[3];
        for (int i = 0; i < StudentArray.length; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요:");
            String number = scanner.next();
            String name = scanner.next();
            String major = scanner.next();
            String PhoneNumber = scanner.next();
            StudentArray[i] = new Student(number, name, major, PhoneNumber);
        }
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        System.out.printf("첫번째 학생: %s %s %s %s\n", StudentArray[0].getNumber(), StudentArray[0].getName(), StudentArray[0].getMajor(), StudentArray[0].AddHypen());
        System.out.printf("두번째 학생: %s %s %s %s\n", StudentArray[1].getNumber(), StudentArray[1].getName(), StudentArray[1].getMajor(), StudentArray[1].AddHypen());
        System.out.printf("세번째 학생: %s %s %s %s\n", StudentArray[2].getNumber(), StudentArray[2].getName(), StudentArray[2].getMajor(), StudentArray[2].AddHypen());
        scanner.close();
    }
}
