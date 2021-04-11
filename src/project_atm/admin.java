 
package project_atm;


import java.util.Scanner;
 

public class admin {

 
    public static void main(String[] args) {

       

        Scanner input = new Scanner(System.in);

     

      

          user f= new user (800.0);

           System.out.println(" WELCOME TO ATM  .. ");

          System.out.println(" IF YOU HAVE AN ACCOUNT , please choose (   1  ) ");

            System.out.println(" IF YOU DO NOT HAVE AN ACCOUNT , please choose (   2  ) ");

           int select = input.nextInt();

          

           //--------------------------

            if(select == 1)

           {

                 System.out.println( " Please enter the USER_NAME :   ");

           String user_name = input.next();

           System.out.println( " Please enter the PASSWORD :  "

                   + " **PASSWORD contains only numbers . thank you **  ");

           long password = input.nextLong();

          

           } 

    

   //-------------------------

   else if(select ==2) {

  System.out.println(" NEW ACCOUNT ..  ");

          

            

            System.out.println( " ENTER YOUR EMAIL");

            String email = input.next();

           

            System.out.println( " ENTER YOUR PHONE NUMBER ");

           long phone = input.nextLong();

          

             System.out.println( " ENTER YOUR PASSWORD  ");

           long password = input.nextLong();

           

           System.out.println( " ENTER YOUR USER_NAME :   ");

           String user_name = input.next();

         

          

           System.out.println("  ACCOUNT SUCCEFULLU CREATED ,, THANK YOU . ");

   

   

           System.out.println(" Welcome customer " +  user_name );

   }

            System.out.println( "YOUR BALANCE IS NOW "+ f.getbalance(800.0));

 

 

              

   

  //-----------------------------------------------------------------------------------------------------------------------

    

        

       

           boolean flag= true;

    

       while (flag ){

          System.out.println("Please choice the options  :        \n          Withdraw (1)  \n  Deposit (2)     \n      Transfer (3)      \n     New account (4)   \n   "

                  + "TRANSACTION HISTORY (5)  \n   Quit (6) "     );

         

            System.out.println("____________________________________________________________");

        int user_input = input.nextInt();

     

   

        

         switch(user_input) {

                case 1:           

                             System.out.println("Enter your withdraw amount");

                             double amount = input.nextDouble();

                             System.out.println("Your withdraw is = "+f.getwithdraw(amount));

                             System.out.println("********************************");

             

               break;

              

              case 2:

                            System.out.println("Enter your the deposite amount");

                            amount = input.nextDouble();

                             System.out.println("Your Deposit is = "+f.getdeposit(amount));

                           

                             System.out.println("********************************");

               break;

              case 3:

                     

                        System.out.println("Enter your the transfer amount");  

                         amount = input.nextDouble();

                            System.out.println("Your Transfer is = "+f.gettransfer(amount));

                           

                            System.out.println("********************************");

                          

                 break;

                 case 4:

                             System.out.println("Do you want to add a new aaccount?");

                            System.out.println("Yes Enter ( 1 ) , No Enter ( 2 ) ");

                            int x = input.nextInt();

                              if (x==1){

                            System.out.println("Please enter the new account number");

                             long accountnumber = input.nextLong();

                             System.out.println("Please enter the new user name :");

                             String nameaccount =input.next();

                            System.out.println("Beneficiary has been added successfully");

                            System.out.println(f.getnewaccount()+ accountnumber + nameaccount );

                              }

                           

                  break;

                   case 5:

          

                             System.out.println(f.history);

                

                  break;

                   case 6 :

                   System.out.println("Thanks for using our ATM Good bye");

                   flag = false;

                      

                 }

                           

              }

        }

    }