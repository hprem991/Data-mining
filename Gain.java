import java.io.*;
import java.math.*;
import java.util.*;


public class Gain {

	public static void main(String a[]){
		BufferedReader br = null;
		String fileStr = null;
		int i =0 ;

		try {
			br = new BufferedReader(new FileReader(a[0]));
			
			while ((fileStr = br.readLine()) != null) {
				System.out.println(fileStr);
				String str[] = fileStr.split(",");
				if(fileStr.co)
				for(int index = 0 ; index < str.length; index++){
						if(str[index].contains("\"")){
							
						}
						System.out.println("token "+str[index] +" no "+index);
					}
				if(i++ == 20)
					break;
			}
		} catch (IOException e) {
			//e.printStackTrace();
			//System.out.println("Exception Occoured "+e.getMessage());
		} 
	}
}