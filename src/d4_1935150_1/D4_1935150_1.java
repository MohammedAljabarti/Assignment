/*Name: Mohammed Hamed Aljabarti*/
 /*E-mail: MALJABRTY@stu.kau.edu.sa*/
 /*Course number: CPCS-202 */
 /*Section number: D4*/
 /*Assignment title: FCIT Library System*/
 /*Date: 8/10/2019*/
package d4_1935150_1;

import java.util.Scanner;

public class D4_1935150_1 {

    public static void main(String[] args) {
        /*Main menu*/
        System.out.println("------------------------------------------------");
        System.out.println("             Welcome to KAU Library             ");
        System.out.println("------------------------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 for Borrowing Books");
        System.out.println("Enter 2 for Returning Books");
        System.out.println("Enter any other number to quit");
        System.out.print("Enter your choice:");
        int x = input.nextInt();
        /*Borrow*/
        if (x == 1) {
            System.out.println("---------------------------------------------------");
            System.out.println("             BORROWING/RETURNING MENU              ");
            System.out.println("---------------------------------------------------");
            System.out.println("Enter 1 for Faculty Members:");
            System.out.println("Enter 2 for Staff");
            System.out.println("Enter 3 for PhD/Master Student");
            System.out.println("Enter 4 for Undergraduate Student");
            System.out.println("Enter any other number to quit");
            System.out.print("Enter your choice:");

            /*faculty members*/
            int B = input.nextInt();
            if (B == 1) {
                System.out.print("Enter your ID:");
                int enter_your_ID1 = input.nextInt();
                System.out.print("Enter the number of books being borrowed:");
                int Enter_the_number_of_books_being_borrowed1 = input.nextInt();
                if (Enter_the_number_of_books_being_borrowed1 <= 10) {
                    System.out.println("---------------------------------------------------");
                    System.out.println("        INFORMATION DETAILS FOR BORROWING          ");
                    System.out.println("---------------------------------------------------");
                    System.out.println("Identity number :" + enter_your_ID1);
                    System.out.println("Member Category : faculty members");
                    System.out.println("Number of borrowed books : " + Enter_the_number_of_books_being_borrowed1);
                    System.out.println("Number of allowed books : 10 ");
                    System.out.println("Number of allowed days :120");
                    System.out.println("------------------------------------------");
                    System.out.println("*** Thank you for Visiting ***");
                    System.out.println("------------------------------------------");
                } else if (Enter_the_number_of_books_being_borrowed1 > 10) {
                    System.out.println("Sorry! Number of books exceeds the allowed quantity!");
                }
            } /*Staff*/ else if (B == 2) {
                System.out.print("Enter your ID:");
                int enter_your_ID2 = input.nextInt();
                System.out.print("Enter the number of books being borrowed:");
                int Enter_the_number_of_books_being_borrowed2 = input.nextInt();
                if (Enter_the_number_of_books_being_borrowed2 <= 8) {
                    System.out.println("---------------------------------------------------");
                    System.out.println("        INFORMATION DETAILS FOR BORROWING          ");
                    System.out.println("---------------------------------------------------");
                    System.out.println("Identity number :" + enter_your_ID2);
                    System.out.println("Member Category : Staff");
                    System.out.println("Number of borrowed books : " + Enter_the_number_of_books_being_borrowed2);
                    System.out.println("Number of allowed books : 8 ");
                    System.out.println("Number of allowed days :90");
                    System.out.println("------------------------------------------");
                    System.out.println("*** Thank you for Visiting ***");
                    System.out.println("------------------------------------------");
                } else if (Enter_the_number_of_books_being_borrowed2 > 8) {
                    System.out.println("Sorry! Number of books exceeds the allowed quantity!");
                }

            } /*PhD/Master Student*/ else if (B == 3) {
                System.out.print("Enter your ID:");
                int enter_your_ID3 = input.nextInt();
                System.out.print("Enter the number of books being borrowed:");
                int Enter_the_number_of_books_being_borrowed3 = input.nextInt();
                if (Enter_the_number_of_books_being_borrowed3 <= 6) {

                    System.out.println("---------------------------------------------------");
                    System.out.println("        INFORMATION DETAILS FOR BORROWING          ");
                    System.out.println("---------------------------------------------------");
                    System.out.println("Identity number :" + enter_your_ID3);
                    System.out.println("Member Category : PhD/Master Student");
                    System.out.println("Number of borrowed books : " + Enter_the_number_of_books_being_borrowed3);
                    System.out.println("Number of allowed books : 6 ");
                    System.out.println("Number of allowed days :30");
                    System.out.println("------------------------------------------");
                    System.out.println("*** Thank you for Visiting ***");
                    System.out.println("------------------------------------------");
                } else if (Enter_the_number_of_books_being_borrowed3 > 6) {
                    System.out.println("Sorry! Number of books exceeds the allowed quantity!");
                }
            } /*Undergraduate Student*/ else if (B == 4) {
                System.out.print("Enter your ID:");
                int enter_your_ID4 = input.nextInt();
                System.out.print("Enter the number of books being borrowed:");
                int Enter_the_number_of_books_being_borrowed4 = input.nextInt();
                if (Enter_the_number_of_books_being_borrowed4 <= 3) {

                    System.out.println("---------------------------------------------------");
                    System.out.println("        INFORMATION DETAILS FOR BORROWING          ");
                    System.out.println("---------------------------------------------------");
                    System.out.println("Identity number :" + enter_your_ID4);
                    System.out.println("Member Category : Undergraduate Student");
                    System.out.println("Number of borrowed books : " + Enter_the_number_of_books_being_borrowed4);
                    System.out.println("Number of allowed books : 3 ");
                    System.out.println("Number of allowed days :15");
                    System.out.println("------------------------------------------");
                    System.out.println("*** Thank you for Visiting ***");
                    System.out.println("------------------------------------------");
                } else if (Enter_the_number_of_books_being_borrowed4 > 3) {
                    System.out.println("Sorry! Number of books exceeds the allowed quantity!");
                } /*neither*/ else if (B > 4) {
                    System.out.println("Wrong selection of member type!");
                    System.out.println("------------------------------------------");
                    System.out.println("*** Thank you for visiting ***");
                    System.out.println("------------------------------------------");
                }
            }

        } /*Return*/ else if (x == 2) {
            System.out.println("---------------------------------------------------");
            System.out.println("             BORROWING/RETURNING MENU              ");
            System.out.println("---------------------------------------------------");
            System.out.println("Enter 1 for Faculty Members:");
            System.out.println("Enter 2 for Staff");
            System.out.println("Enter 3 for PhD/Master Student");
            System.out.println("Enter 4 for Undergraduate Student");
            System.out.println("Enter any other number to quit");
            System.out.print("Enter your choice:");
            /*Faculty members*/
            int R = input.nextInt();
            if (R == 1) {
                System.out.print("Enter your ID;");
                int enter_your_IDr1 = input.nextInt();
                System.out.print("Enter the number of books returning:");
                int Enter_the_number_of_books_returningr1 = input.nextInt();
                System.out.print("Enter the number of extra days:");
                int Enter_the_number_of_extra_daysr1 = input.nextInt();
                if (Enter_the_number_of_extra_daysr1 == 0) {
                    System.out.println("-----------------------------------------");
                    System.out.println("Information Details for RETURNING");
                    System.out.println("-----------------------------------------");
                    System.out.println("Identity Number : " + enter_your_IDr1);
                    System.out.println("Member Category : Faculty members");
                    System.out.println("Number of books returned :" + Enter_the_number_of_books_returningr1);
                    System.out.println("Number of allowed days : 120");
                    System.out.println("Number of extra days : 0");
                    System.out.println("------------------------------------------");
                    System.out.println("*** Thank you for Visiting ***");
                    System.out.println("------------------------------------------");
                } else if (Enter_the_number_of_extra_daysr1 > 0) {
                    System.out.print("Enter the total price of books (in SAR):");
                    int total_price12 = input.nextInt();
                    System.out.println("-----------------------------------------");
                    System.out.println("Information Details for RETURNING");
                    System.out.println("-----------------------------------------");
                    System.out.println("Identity Number :" + enter_your_IDr1);
                    System.out.println("Member Category : Faculty members");
                    System.out.println("Number of books returned :" + Enter_the_number_of_books_returningr1);
                    System.out.println("Number of allowed days :120");
                    System.out.println("Number of extra days : " + Enter_the_number_of_extra_daysr1);
                    System.out.println("Total price of books (in SAR) :" + total_price12);
                    int Penalty12 = (int) (total_price12 * 0.5);
                    System.out.println("Penalty :" + Penalty12);
                    System.out.println("You exceeded the allowed period! The penalty is 50% of the price of the books.");
                    System.out.println("------------------------------------------");
                    System.out.println("*** Thank you for Visiting ***");
                    System.out.println("------------------------------------------");
                }
            } /*Staff*/ else if (R == 2) {
                System.out.print("Enter your ID;");
                int enter_your_IDr2 = input.nextInt();
                System.out.print("Enter the number of books returning:");
                int Enter_the_number_of_books_returningr2 = input.nextInt();
                System.out.print("Enter the number of extra days:");
                int Enter_the_number_of_extra_daysr2 = input.nextInt();
                if (Enter_the_number_of_extra_daysr2 == 0) {
                    System.out.println("-----------------------------------------");
                    System.out.println("Information Details for RETURNING");
                    System.out.println("-----------------------------------------");
                    System.out.println("Identity Number : " + enter_your_IDr2);
                    System.out.println("Member Category : Staff");
                    System.out.println("Number of books returned :" + Enter_the_number_of_books_returningr2);
                    System.out.println("Number of allowed days : 90");
                    System.out.println("Number of extra days : 0");
                    System.out.println("------------------------------------------");
                    System.out.println("*** Thank you for Visiting ***");
                    System.out.println("------------------------------------------");
                } else if (Enter_the_number_of_extra_daysr2 > 0) {
                    System.out.print("Enter the total price of books (in SAR):");
                    int total_price22 = input.nextInt();
                    System.out.println("-----------------------------------------");
                    System.out.println("Information Details for RETURNING");
                    System.out.println("-----------------------------------------");
                    System.out.println("Identity Number :" + enter_your_IDr2);
                    System.out.println("Member Category : Staff ");
                    System.out.println("Number of books returned :" + Enter_the_number_of_books_returningr2);
                    System.out.println("Number of allowed days :90");
                    System.out.println("Number of extra days : " + Enter_the_number_of_extra_daysr2);
                    System.out.println("Total price of books (in SAR) :" + total_price22);
                    int Penalty22 = (int) (total_price22 * 0.4);
                    System.out.println("Penalty :" + Penalty22);
                    System.out.println("You exceeded the allowed period! The penalty is 40% of the price of the books.");
                    System.out.println("------------------------------------------");
                    System.out.println("*** Thank you for Visiting ***");
                    System.out.println("------------------------------------------");
                }
            } /* PhD/Master Student*/ else if (R == 3) {
                System.out.print("Enter your ID;");
                int enter_your_IDr3 = input.nextInt();
                System.out.print("Enter the number of books returning:");
                int Enter_the_number_of_books_returningr3 = input.nextInt();
                System.out.print("Enter the number of extra days:");
                int Enter_the_number_of_extra_daysr3 = input.nextInt();
                if (Enter_the_number_of_extra_daysr3 == 0) {
                    System.out.println("-----------------------------------------");
                    System.out.println("Information Details for RETURNING");
                    System.out.println("-----------------------------------------");
                    System.out.println("Identity Number : " + enter_your_IDr3);
                    System.out.println("Member Category : PhD/Master Student");
                    System.out.println("Number of books returned :" + Enter_the_number_of_books_returningr3);
                    System.out.println("Number of allowed days : 30");
                    System.out.println("Number of extra days : 0");
                    System.out.println("------------------------------------------");
                    System.out.println("*** Thank you for Visiting ***");
                    System.out.println("------------------------------------------");
                } else if (Enter_the_number_of_extra_daysr3 > 0) {
                    System.out.print("Enter the total price of books (in SAR):");
                    int total_price32 = input.nextInt();
                    System.out.println("-----------------------------------------");
                    System.out.println("Information Details for RETURNING");
                    System.out.println("-----------------------------------------");
                    System.out.println("Identity Number :" + enter_your_IDr3);
                    System.out.println("Member Category : PhD/Master Student");
                    System.out.println("Number of books returned :" + Enter_the_number_of_books_returningr3);
                    System.out.println("Number of allowed days :30");
                    System.out.println("Number of extra days : " + Enter_the_number_of_extra_daysr3);
                    System.out.println("Total price of books (in SAR) :" + total_price32);
                    int Penalty32 = (int) (total_price32 * 0.3);
                    System.out.println("Penalty :" + Penalty32);
                    System.out.println("You exceeded the allowed period! The penalty is 30% of the price of the books.");
                    System.out.println("------------------------------------------");
                    System.out.println("*** Thank you for Visiting ***");
                    System.out.println("------------------------------------------");
                }

            } /*Undergraduate Student*/ else if (R == 4) {
                System.out.print("Enter your ID;");
                int enter_your_IDr4 = input.nextInt();
                System.out.print("Enter the number of books returning:");
                int Enter_the_number_of_books_returningr4 = input.nextInt();
                System.out.print("Enter the number of extra days:");
                int Enter_the_number_of_extra_daysr4 = input.nextInt();
                if (Enter_the_number_of_extra_daysr4 == 0) {
                    System.out.println("-----------------------------------------");
                    System.out.println("Information Details for RETURNING");
                    System.out.println("-----------------------------------------");
                    System.out.println("Identity Number : " + enter_your_IDr4);
                    System.out.println("Member Category : Undergraduate Student");
                    System.out.println("Number of books returned :" + Enter_the_number_of_books_returningr4);
                    System.out.println("Number of allowed days : 15");
                    System.out.println("Number of extra days : 0");
                    System.out.println("------------------------------------------");
                    System.out.println("*** Thank you for Visiting ***");
                    System.out.println("------------------------------------------");
                } else if (Enter_the_number_of_extra_daysr4 > 0) {
                    System.out.print("Enter the total price of books (in SAR):");
                    int total_price42 = input.nextInt();
                    System.out.println("-----------------------------------------");
                    System.out.println("Information Details for RETURNING");
                    System.out.println("-----------------------------------------");
                    System.out.println("Identity Number :" + enter_your_IDr4);
                    System.out.println("Member Category : Undergraduate Student");
                    System.out.println("Number of books returned :" + Enter_the_number_of_books_returningr4);
                    System.out.println("Number of allowed days :15");
                    System.out.println("Number of extra days : " + Enter_the_number_of_extra_daysr4);
                    System.out.println("Total price of books (in SAR) :" + total_price42);
                    int Penalty42 = (int) (total_price42 * 0.2);
                    System.out.println("Penalty :" + Penalty42);
                    System.out.println("You exceeded the allowed period! The penalty is 20% of the price of the books.");
                    System.out.println("------------------------------------------");
                    System.out.println("*** Thank you for Visiting ***");
                    System.out.println("------------------------------------------");
                }
            } else if (R > 4) {
                System.out.println("Wrong selection of member type!");
                System.out.println("------------------------------------------");
                System.out.println("*** Thank you for visiting ***");
                System.out.println("------------------------------------------");
            }
        } /*neither*/ else if (x > 2) {
            System.out.println("------------------------------------------");
            System.out.println("*** Thank you for Visiting ***");
            System.out.println("------------------------------------------");
        }

    }/*public static*/
}/*public class*/
