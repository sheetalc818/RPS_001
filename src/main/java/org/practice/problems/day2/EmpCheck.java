package org.practice.problems.day2;
public class EmpCheck {
    static final int IS_FULLTIME = 1;
    static final int IS_PARTTIME = 2;
    static final int EMP_WAGEPER_HR = 20;
    public static void main(String[] args) {
        double salary=0.0;
        int empHrs = 0;
        //Random random = new Random();
        //int randomCheck = random.nextInt(3);//2
        for(int i=1; i<=2 ; i++){
            int randomCheck = (int) (Math.floor(Math.random()*10)%3);
            System.out.println(randomCheck);
            switch (randomCheck){
                case IS_FULLTIME :
                    System.out.println("Emp full Present!!");
                    empHrs = 8;
                    break;
                case IS_PARTTIME :
                    System.out.println("Emp part time Present!!");
                    empHrs = 4;
                    break;
                default:
                    System.out.println("Emp Absent!!");
                    break;
            }
            salary = (EMP_WAGEPER_HR * empHrs);
            System.out.println("Daily salary of Emp : " + salary);
        }
    }
}
