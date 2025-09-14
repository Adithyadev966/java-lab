import java.io.*;
 
 class Palin{
  	
  	public static void main(String[] args)throws IOException{
  		
  		DataInputStream dis=new DataInputStream(System.in);
  		System.out.println("Enter a string");
  		 String str = dis.readLine();
  		 
  		  String OG=str.toLowerCase();  //convetrs the string to lower case.
  		     String rev="";
  		 for(int i=OG.length()-1;i>=0;i--){
  		 	rev=rev+OG.charAt(i);
  		   }
  		   if(rev.equals(OG))
  		   {
  	System.out.println(str+" is a PALINDROME");
  		   	}
  		   else
  		   {
  	System.out.println(str+" is not a PALINDROME");
  	 }
  	 }}
