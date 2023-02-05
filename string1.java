
/*class string1//count string number
{
public static void main(String[] args)
{
	String str="i am dinesh yadav dkd";
	int count=0;
	for(int i=0;i<str.length();i++)
	{if(str.charAt(i)!=' ')
		count++;
	}
	System.out.println("total number od char" +count);
}
}*//*
class string1
{
	public static void main(String[] args)
	{
		int vCount = 0;// cCount = 0;
		String str = "bhuwan bosdk aur chutiya hain";
		str = str.toLowerCase();
		for(int i = 0 ;i < str.length(); i++)
		{
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
		    vCount++;
		//}
		 //else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') 
		 //{ 			 
		 //cCount++;
		 }
	}
	System.out.println(" number of vowels :" + vCount);
	//System.out.println(" numberof consonants :" + cCount);
}
}*/


 /*public static void main(String[] args) {    
            
        //Counter variable to store the count of vowels and consonant    
        int vCount = 0, cCount = 0;    
            
        //Declare a string    
        String str = "This is a really simple sentence";    
            
        //Converting entire string to lower case to reduce the comparisons    
        str = str.toLowerCase();    
            
        for(int i = 0; i < str.length(); i++) {    
            //Checks whether a character is a vowel    
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
                //Increments the vowel counter    
                vCount++;    
            }    
            //Checks whether a character is a consonant    
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
                //Increments the consonant counter    
                cCount++;    
            }    
        }    
        System.out.println("Number of vowels: " + vCount);    
        System.out.println("Number of consonants: " + cCount);    
    }    
} */  
class string1
{
	public static void main(String[] args)
	{
		String s1="deepak";
		String s2=" dinesh";
		System.out.print(s1.concat(s2));
	}
}
	
	
		
		
		
		
		