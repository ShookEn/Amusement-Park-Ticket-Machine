/*
Name: Yeoh Shook En
Batch: CS21-A
Student ID: D210042A
Submission date: 5/9/2021
Title: Amusement Park Ticket Machine 

Objective: 
1. Buyers save more time without having to go to the counter to buy tickets and save time in queuing
2. Save labor costs

Description:
1. Users can directly choose the ticket package and the park they want to go to.
2. This program will display the total price of tickets.
3. This program will display the total price of tickets according to age group.
4. Users cannot purchase more than 50 amusement park tickets in order to prevent scalping.
5. This program also will display the package type of the ticket selected by the user.

Structure review:
I applied the basic knowledge I learned from java programming I to this system, for example:
1.'Method' - Define the code just once, and use it many times.
2.'If- else' - Display output through user input condition.
3.'Switch' - Select one of many choice to be executed by users.
4.'Break' - After executing the content that meets the condition of the case, the switch ends, and the following statement is not executed.
*/ 

import java.util.Scanner;
public class CS_Intro2Pro_2021B_Project_D210042A {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //describe
        System.out.println("Welcome to Legoland!");
        System.out.println("If you are age above 75 or below 3 are free!");
        name();
        
        input.close();
        }
        
        //name
        public static void name() {
            Scanner input = new Scanner(System.in);
        
        //personal info
        System.out.print("Please enter your name: ");
        String userName = input.next();

        //ensure name
        System.out.println("please make sure your name is correct to booking tickets.");
        System.out.println("Is this your name? 【 " + userName + " 】");
        System.out.print("Enter 1 if correct, enter 2 if is wrong: ");
        
        int ensure = input.nextInt();

        if(ensure == 1)
        {
            ticket();
        }

        else if(ensure == 2)
        {
            System.out.println("Please insert your name again.");
            name();
        }

        else
        {
            System.out.println("Insert error, please insert your name again.");
            name();
        }
        
        input.close();
    }
        
        public static void ticket() {
            Scanner input = new Scanner(System.in);
        
        //ticket type
        System.out.println("Package 1: Theme park");
        System.out.println("Package 2: Water park ");
        System.out.println("Package 3: Aquarium");
        System.out.println("Package 4: Theme park + Aquarium");
        System.out.println("Package 5: Water park + Aquarium");
        System.out.println("Caution!! All tickets are one-day tickets!!");
        System.out.print("Please choose the package you want: ");
        int pack = input.nextInt();

        switch (pack)
        {
            case 1:

                {
                    System.out.print("The number of people aged 13 to 75(adult ticket): ");
                    int a = input.nextInt();
                    System.out.print("The number of people aged 5 to 12(children ticket): ");
                    int c = input.nextInt();

                    if (a + c < 0)
                    {
                        System.out.println("Input error");
                    }
                
                    else if( a + c <= 50)
                        {
                            //ticket count
                            System.out.println("The number of people aged 13 to 75(adult ticket) is: " + a );
                            int adultTicket = a * 189;
                            System.out.println("The number of people aged 5 to 12(children ticket) is: " + c);
                            int childrenTicket = c * 149;
                            System.out.println("The package you choose is: " + pack);
                            System.out.println("Total price of adult tickets: RM"+adultTicket);
                            System.out.println("Total price of children tickets: RM"+childrenTicket);
                            int totalprice = adultTicket + childrenTicket;
                            System.out.println("Total price of tickets is: RM" + totalprice); 
                            System.out.println("Thank you for choosing Legoland.");                           
                        }
                    
                    else
                        {
                            System.out.println("To prevent scalpers, you are not allow to buy more than 50 tickets.");
                        }
                break;
            }
            
            case 2:
            {
                System.out.print("The number of people aged 13 to 75(adult ticket): ");
                int a = input.nextInt();
                System.out.print("The number of people aged 5 to 12(children ticket): ");
                int c = input.nextInt();

                if (a + c < 0)
                {
                    System.out.println("Input error");
                }
            
                else if( a + c <= 50)
                    {
                        //ticket count
                        System.out.println("The number of people aged 13 to 75(adult ticket) is: " + a );
                        int adultTicket = a * 139;
                        System.out.println("The number of people aged 5 to 12(children ticket) is: " + c);
                        int childrenTicket = c * 114;
                        System.out.println("The package you choose is: " + pack);
                        System.out.println("Total price of adult tickets: RM"+adultTicket);
                        System.out.println("Total price of children tickets: RM"+childrenTicket);
                        int totalprice = adultTicket + childrenTicket;
                        System.out.println("Total price of tickets is: RM" + totalprice);   
                        System.out.println("Thank you for choosing Legoland.");                     
                    }
                
                else
                    {
                        System.out.println("To prevent scalpers, you are not allow to buy more than 50 tickets.");
                    }
            break; 
            }

            case 3:
            {
                System.out.print("The number of people aged 13 to 75(adult ticket): ");
                    int a = input.nextInt();
                    System.out.print("The number of people aged 5 to 12(children ticket): ");
                    int c = input.nextInt();

                    if (a + c < 0)
                    {
                        System.out.println("Input error");
                    }
                
                    else if( a + c <= 50)
                        {
                            //ticket count
                            System.out.println("The number of people aged 13 to 75(adult ticket) is: " + a );
                            int adultTicket = a * 89;
                            System.out.println("The number of people aged 5 to 12(children ticket) is: " + c);
                            int childrenTicket = c * 69;
                            System.out.println("The package you choose is: " + pack);
                            System.out.println("Total price of adult tickets: RM"+adultTicket);
                            System.out.println("Total price of children tickets: RM"+childrenTicket);
                            int totalprice = adultTicket + childrenTicket;
                            System.out.println("Total price of tickets is: RM" + totalprice);
                            System.out.println("Thank you for choosing Legoland.");
                        }
                    
                    else
                        {
                            System.out.println("To prevent scalpers, you are not allow to buy more than 50 tickets.");
                        }
                break;
            } 

            case 4:
            {
                System.out.print("The number of people aged 13 to 75(adult ticket): ");
                    int a = input.nextInt();
                    System.out.print("The number of people aged 5 to 12(children ticket): ");
                    int c = input.nextInt();

                    if (a + c < 0)
                    {
                        System.out.println("Input error");
                    }
                
                    else if( a + c <= 50)
                        {
                            //ticket count
                            System.out.println("The number of people aged 13 to 75(adult ticket) is: " + a );
                            int adultTicket = a * 249;
                            System.out.println("The number of people aged 5 to 12(children ticket) is: " + c);
                            int childrenTicket = c * 200;
                            System.out.println("The package you choose is: " + pack);
                            System.out.println("Total price of adult tickets: RM"+adultTicket);
                            System.out.println("Total price of children tickets: RM"+childrenTicket);
                            int totalprice = adultTicket + childrenTicket;
                            System.out.println("Total price of tickets is: RM" + totalprice);
                            System.out.println("Thank you for choosing Legoland.");
                        }
                    
                    else
                        {
                            System.out.println("To prevent scalpers, you are not allow to buy more than 50 tickets.");
                        }
                break;
            }

            case 5:
            {
                System.out.print("The number of people aged 13 to 75(adult ticket): ");
                    int a = input.nextInt();
                    System.out.print("The number of people aged 5 to 12(children ticket): ");
                    int c = input.nextInt();

                    if (a + c < 0)
                    {
                        System.out.println("Input error");
                    }
                
                    else if( a + c <= 50)
                        {
                            //ticket count
                            System.out.println("The number of people aged 13 to 75(adult ticket) is: " + a );
                            int adultTicket = a * 225;
                            System.out.println("The number of people aged 5 to 12(children ticket) is: " + c);
                            int childrenTicket = c * 180;
                            System.out.println("The package you choose is: " + pack);
                            System.out.println("Total price of adult tickets: RM"+adultTicket);
                            System.out.println("Total price of children tickets: RM"+childrenTicket);
                            int totalprice = adultTicket + childrenTicket;
                            System.out.println("Total price of tickets is: RM" + totalprice);
                            System.out.println("Thank you for choosing Legoland.");
                        }
                    
                    else
                        {
                            System.out.println("To prevent scalpers, you are not allow to buy more than 50 tickets.");
                        }
                break;
            }

            default:
            {
                System.out.println("Insert error， please back to main page to insert number of tickets again.");
                ticket();
            }
        }
        input.close();
    }
}