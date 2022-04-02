package challengers;

import java.util.Scanner;

public class salaryWithBonus {
    public static void main(String[] args){
            /*
    Make a program that reads a seller's name, his/her fixed salary and the sale's total made by himself/herself
    in the month (in money). Considering that this seller receives 15% over all products sold,
    write the final salary (total) of this seller at the end of the month , with two decimal places.
    - Don’t forget to print the line's end after the result, otherwise you will receive “Presentation Error”.
    - Don’t forget the blank spaces.
    Input
    The input file contains a text (employee's first name), and two double precision values, that are the seller's
    salary and the total value sold by him/her.
    Output
    Print the seller's total salary, according to the given example.
    */
        Scanner sc = new Scanner(System.in);
        String name;
        double salary, sold, salaryBonus;
        //  Input
        System.out.println("Your first name:");
        name = sc.nextLine();
        System.out.println("Your salary:");
        salary = sc.nextDouble();
        System.out.println("How much you sold:");
        sold = sc.nextDouble();
        //  Calculando salario mais 15% das vendas (simplificando 15/100 = 3/20)
        salaryBonus = salary + ((sold * 3) / 20);
        //  Output
        System.out.printf("%s\nSalary = %.2f\nSold = %.2f\nSalary whit bonus = %.2f",name, salary, sold, salaryBonus);
        sc.close();
    }
}
