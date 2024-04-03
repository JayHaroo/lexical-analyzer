package src;

import java.util.HashMap;
import java.util.ArrayList;


public class lexicalAnalyzer{

    public void takeTokens(String expression){
        
        
        boolean cont = a(expression);
        String currInt = "";
        if(cont) return;
        System.out.println("Token    ;    Lexemes");
        System.out.println("=====================");
        for(int i = 0; i < expression.length(); i++){
            if(Character.isDigit(expression.charAt(i))){
                while(i+1 <= expression.length() && Character.isDigit(expression.charAt(i))){
                    currInt += expression.charAt(i);
                    i++;
                }

                System.out.println(currInt + " ; Integer Literal");
                currInt = "";
            }else if(expression.charAt(i) == '+'){
                System.out.println("+ ; addition operator");
            }else if(expression.charAt(i) == '-'){
                System.out.println("- ; subtraction operator");
            }else if(expression.charAt(i) == '/'){
                System.out.println("/ ; division operator");
            }else if(expression.charAt(i) == '*'){
                System.out.println("* ; multiply operator");
            }else if(expression.charAt(i) == '='){
                System.out.println("= ; equals operator");
            }else if(!(Character.isDigit(expression.charAt(i))) && expression.charAt(i) != ' '){
                System.out.println("errropr");
            }
            
        }
        System.out.println("=====================");
    }

    public boolean a(String expression){
        String currInt = "";
        boolean cont = false;
        for(int i = 0; i < expression.length(); i++){
            if(Character.isDigit(expression.charAt(i))){
                while(i+1 <= expression.length() && Character.isDigit(expression.charAt(i))){
                    currInt += expression.charAt(i);
                    i++;
                }

                // System.out.println(currInt + " ; Integer Literal");
                currInt = "";
            }else if(expression.charAt(i) == '+'){
                // System.out.println("+ ; addition operator");
            }else if(expression.charAt(i) == '-'){
                // System.out.println("- ; subtraction operator");
            }else if(expression.charAt(i) == '/'){
                // System.out.println("/ ; division operator");
            }else if(expression.charAt(i) == '*'){
                // System.out.println("* ; multiply operator");
            }else if(expression.charAt(i) == '='){
                // System.out.println("= ; equals operator");
            }else if(!(Character.isDigit(expression.charAt(i))) && expression.charAt(i) != ' '){
                System.out.println("Syntax Error! Try Again");
                cont = true; 
                break;
            }
        }
        return cont;
    }

}