package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class main{
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args)throws Exception{
        while (true) {
            lexicalAnalyzer a = new lexicalAnalyzer();
            System.out.print(">> ");
            String input = reader.readLine();
            a.takeTokens(input);
        }
    }
}