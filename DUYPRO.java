
import java.sql.SQLOutput;
import java.util.Scanner;
public class DUYPRO {
    public static void calculate(double a, double b, char op) {
            switch (op) {
                case '+':
                    System.out.println(a + " + " + b + " = " + (a + b));
                    break;
                case '-':
                    System.out.println(a + " - " + b + " = " + (a - b));
                    break;
                case '*':
                    System.out.println(a + " * " + b + " = " + (a * b));
                    break;
                case '/':
                    if (b == 0) {
                    System.out.println("Divided number is non-zero");
                    }
                    else {
                        System.out.println(a + " / " + b + " = " + (a / b));
                    }
                    break;
                default:
                    System.out.println("No result");
            }
        }
        public static void printName(String lastName, String middleName, String firstName) {
            System.out.println("The full name is: " + lastName + " " + middleName + " " + firstName);
        }

        public static double grades(double diemchuyenCan, double diemgiuaKy, double diemcuoiKy) {
            double hocPhan = diemchuyenCan * 0.1 + diemgiuaKy * 0.2 + diemcuoiKy * 0.7;
            return hocPhan;
        }

        public static void check(int n, String arr[], String name) {
            boolean found = false;
            for (int i = 0; i < n; i++) {
                if (arr[i].equals(name)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        public static void main(String[] args) {
            System.out.println("WELCOME TO MY MENU - LE VO BAO DUY\n");
            System.out.println("-------------------------");
            System.out.println("1. Entering two numbers from the keyboard to print the results of addition, subtraction, multiplication, and division.");
            System.out.println("2. Enter your first and last name, print out the full name.");
            System.out.println("3. Enter the attendance score (10%), midterm (20%), and final semester (70%) to print the course score.");
            System.out.println("4. Enter the full name to check whether it exists in the initialization list or not. If so, print \"Yes\", otherwise print \"No\"");
            System.out.println("Other to quit.");
            System.out.println("------------------------");

            int choice, flag = 1;
            Scanner input = new Scanner(System.in);

            while (flag == 1) {
                System.out.println("Enter your choice (from 1 to 4): ");
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        double a, b;
                        System.out.println("Enter a: ");
                        a = input.nextDouble();
                        System.out.println("Enter b: ");
                        b = input.nextDouble();
                        System.out.println(" Enter operation: ");
                        char op;
                        op = input.next().charAt(0);
                        calculate(a, b, op);
                        break;

                    case 2:
                        System.out.println("Enter your first name: ");
                        String firstName = input.next();
                        System.out.println("Enter your middle name: ");
                        String middleName = input.next();
                        System.out.println("Enter your last name: ");
                        String lastName = input.next();
                        printName(firstName, middleName, lastName);
                        break;

                    case 3:
                        double diemchuyenCan, diemgiuaKy, diemcuoiKy;
                        System.out.println("Enter the attendence grade: ");
                        diemchuyenCan = input.nextDouble();
                        System.out.println("Enter the midterm grade: ");
                        diemgiuaKy = input.nextDouble();
                        System.out.println("Enter the final grade :");
                        diemcuoiKy = input.nextDouble();
                        System.out.println("Your course grade is: " + grades(diemchuyenCan, diemgiuaKy, diemcuoiKy));
                        break;
                    case 4:
                        System.out.println("Number of members in the list are: ");
                        int n = input.nextInt();
                        String arr[] = new String[n];
                        input.nextLine();
                        System.out.println("Enter the names of all members in the list: ");
                        for (int i = 0; i < n; i++) {
                            arr[i] = input.nextLine();
                        }
                        System.out.println("Enter your name you want to check: ");
                        String name = input.nextLine();
                        check(n, arr, name);
                        break;

                    default:
                        System.out.println("GOODBYE!");
                        flag = 0;
                }
            }
        }
    }

