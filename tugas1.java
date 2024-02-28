import java.util.Scanner;
    public class tugas1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int choice = 0;

            while (choice != 3) {
                System.out.println("Welcome to Library System !");
                System.out.println("1. Login as student");
                System.out.println("2. Login as admin");
                System.out.println("3. Exit");
                System.out.print("Choose option (1-3): ");
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        mahasiswaLogin();
                        break;
                    case 2:
                        adminLogin();
                        break;
                    case 3:
                        System.out.println("Thank you, see you ");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            }
        }

        public static void mahasiswaLogin() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your NIM: ");
            String nim = input.nextLine();
            if (nim.length() == 15) {
                System.out.println("Successful login as student !");
            } else {
                System.out.println("User not found");
            }
        }

        public static void adminLogin() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your username: ");
            String username = input.nextLine();
            System.out.print("Enter your password: ");
            String password = input.nextLine();
            if (username.equals(password)) {
                System.out.println("Successful login as admin!");
            } else {
                System.out.println("User not found");
            }
        }
    }

