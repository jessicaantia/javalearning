package com.samples.sessionseven;

public class JavaExceptionExample {

	public static void main(String args[]) {
	    String s=null;  
		try {
			// code that may raise exception
		    int divisor = 0;
		    if(divisor == 0) {
		        throw new UserDefinedException("004", "Divisor es cero!");
		    }
			int data = 100 / divisor;
			// rest code of the program
			System.out.println("rest of the code...");
			
			System.out.println(s.length());//NullPointerException
			
			int a[]=new int[5];  
			a[10]=50; //ArrayIndexOutOfBoundsException 
			
			String t="abc";  
			int i=Integer.parseInt(t);//NumberFormatException  
		} catch (ArithmeticException | NumberFormatException e) {
			System.out.println(e);
		} catch (NullPointerException e) {
            s = "";
        } catch (UserDefinedException e) {
            e.printStackTrace();
            System.out.println(e.toString());
        } finally {
            // Va si o si!
        }
	}
}
