package Function_Array;

//Suppose, in a company , here are some employee salaries in an array
//        [35000, 25000, 28000, 32500, 44000, 32800]
//        Find out the 3rd highest salary
public class Find_Out_The_Third_Highest_Salary {
    public static void main(String[] args) {
        int salary[] = {35000, 25000, 28000, 32500, 44000, 32800};
        int firstHighestSalary = salary[0];
        int secondHighestSalary = Integer.MIN_VALUE;
        int thirdHighestSalary = Integer.MIN_VALUE;
        for (int i = 1; i < salary.length; i++) {
            if (salary[i] > firstHighestSalary) {
                thirdHighestSalary = secondHighestSalary;
                secondHighestSalary = firstHighestSalary;
                firstHighestSalary = salary[i];
            } else if (salary[i] > secondHighestSalary) {
                thirdHighestSalary = secondHighestSalary;
                secondHighestSalary = salary[i];
            } else if (salary[i] > thirdHighestSalary) {
                thirdHighestSalary = salary[i];
            }
        }
        System.out.println("3rd Highest Salary is " + thirdHighestSalary);

    }
}
