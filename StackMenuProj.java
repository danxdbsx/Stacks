/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackmenuproj;

import java.util.Scanner;

/**
 *
 * @author Danial
 */
public class StackMenuProj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
        int opt, stkSizeInput;
        String backToMenu = "";
        String mssAdd = "";
        String input = "";
        Stack<String> s1 = new Stack();
        
        
        System.out.println
        ("**************** WELCOME ****************\n" +
         "   Welcome to the String Stack Program!\n" + 
         "*****************************************\n");
        
       
       // insert do
       do {
            System.out.println
             ("What operation would you like to perform?" +
                 "\n1 - New Stack"
               + "\t\t\t6 - Pop Stack's Top Item"
               + "\n2 - Clear Stack"
               + "\t\t7 - Peek at Stack"
               + "\n3 - Check Stack if Full"
               + "\t8 - Display Stack"
               + "\n4 - Check Stack if Empty"
               + "\t9 - Exit Program"
               + "\n5 - Push a New Stack Item");
            opt = s.nextInt();
            
            switch (opt) {
                case 1: //new
                    
                    s1 = new Stack();
                    s1.clear();
                    System.out.println("Would you like to set up a custom max stack size? Yes or No?");
                    s.nextLine();
                    mssAdd = s.nextLine();
                    
                    if (mssAdd.equalsIgnoreCase("yes")) {
                        System.out.println("Enter desired max stack size: ");
                        stkSizeInput = s.nextInt();
                        s1.setMaxStkSize(stkSizeInput);
 
                        System.out.println
                       ("\n*********** NEW NOTICE ***********\n" + 
                          "New Stack with size: " + stkSizeInput + " created!\n" + 
                          "**********************************\n");
                    }
                    else {
                        System.out.println
                       ("\n*********** NEW NOTICE ***********\n" + 
                          " New Stack with size 999 created!\n" + 
                          "**********************************\n");
                    }
                    
                    backToMenu = "yes";
                    break;
                case 2: // clear
                    s1.clear();
                    System.out.println
                       ("\n*********** CLEAR NOTICE ***********\n" + 
                          "           Stack cleared!\n" + 
                          "************************************\n");
                    backToMenu = "yes";
                    break;
                case 3: //isFull
                    if(s1.isFull()) {
                        System.out.println
                       ("\n*********** FULL NOTICE ***********\n" + 
                          "         The Stack is full!\n" + 
                          "***********************************\n");
                    }
                    else {
                        System.out.println
                       ("\n*********** FULL NOTICE ***********\n" + 
                          "       The Stack is not full!\n" + 
                          "***********************************\n");
                    }
                    backToMenu = "yes";
                    break;
                case 4: //isEmpty 
                    if(s1.isEmpty()) {
                        System.out.println
                       ("\n*********** EMPTY NOTICE ***********\n" + 
                          "        The Stack is empty!\n" + 
                          "************************************\n");
                    }
                    else {
                        System.out.println
                       ("\n*********** EMPTY NOTICE ***********\n" + 
                          "      The Stack is not empty!\n" + 
                          "************************************\n");
                    }
                    backToMenu = "yes";
                    break;
                case 5: //push
                    System.out.println("Input what String you would like to add to the stack: ");
                    s.nextLine();
                    input = s.nextLine();
                   
                    if (s1.isFull())
                    {
                        System.out.println
                       ("\n*********** FULL NOTICE ***********\n" + 
                          "The Stack is full, can't push item!\n" + 
                          "***********************************\n");
                    }
                    else {
                         s1.push(input);
                        System.out.println
                       ("\n*********** PUSH NOTICE ***********\n" + 
                          "Item: [" + input + "] is added to the stack!\n" + 
                          "***********************************\n");
                    }
                    backToMenu = "yes";
                    break;
                case 6: //pop
                    System.out.println
                       ("\n*********** POP NOTICE ***********\n" + 
                          "Item: [" + s1.pop() + "] was popped!\n" + 
                          "**********************************\n");
                    backToMenu = "yes";
                    break;
                case 7: //peek
                    System.out.println
                       ("\n*********** PEEK NOTICE ***********\n" + 
                          "Top Item: [" + s1.peek() + "]\n" + 
                          "***********************************\n");
                    backToMenu = "yes";
                    break;
                case 8: //display
                    System.out.println
                       ("\n*********** DISPLAY STACK ***********\n");
                    s1.printStack();
                    System.out.println("Current Items: " + (s1.getTop()+1) + " out of " + s1.getMaxStkSize() + ".");
                    System.out.println
                         ("*************************************\n");
                    backToMenu = "yes";
                    break;
                case 9: //exit
                    System.out.println("\n***************************"
                                     + "\nThe program will now close."
                                     + "\n***************************");
                    System.exit(0);
                    break;
                default: //error
                    
                    System.out.println
                    ("********************************** ERROR **********************************\n" + 
                     "Please input 1-9 only to access the specified operations. Please try again.\n" +
                     "***************************************************************************\n");
                    backToMenu = "yes";
                    System.out.println("\n");
                    break;       
            }  
       } while (backToMenu.equalsIgnoreCase("yes"));
        
        s.close();
    }
    
}
