
// import java.util.*;

// class A{
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);

//         System.out.println("Enter any char");
//         char ch = s.next().charAt(0);

//         switch (ch) {
//             case 'a': case 'e': case 'i': case 'o': case 'u':
//             case 'A': case 'E': case 'I': case 'O': case 'U':
//                 System.out.println("Vowel");
//                 break;

//             default:
//                 if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
//                     System.out.println("Consonant");
//                 else
//                     System.out.println("Invalid");
//         }
//     }
// }
import java.util.*;

class Fullstack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bal = 1000;

        System.out.println("1.Check 2.Deposit 3.Withdraw 4.Exit");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.println(bal);
                break;
            case 2:
                bal += sc.nextDouble();
                System.out.println(bal);
                break;
            case 3:
                bal -= sc.nextDouble();
                System.out.println(bal);
                break;
            case 4:
                System.out.println("Bye");
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}
