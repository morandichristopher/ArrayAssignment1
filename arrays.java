import java.util.Arrays;

public class arrays {
	
  public static void main(String[] args) {
	  
    double values[] = {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};

    double maxValue = values[0];

    for(int i=1; i<values.length; i++){
      if(values[i] > maxValue) {
        maxValue = values[i];
    
      
      
      }

      
      
      
    }

    
    
    System.out.println(Arrays.toString(values));
    System.out.println(maxValue);
    
    
    for(int i=1; i<values.length; i++){
        if(values[i] < 0) {
        	System.out.println(values[i]);
        	
        }
        }
    
  }
  
  

  //maxValue = 1
  // values[1] > maxValue?
  // 2 > 1? -> yes, so then
  // maxValue = 2
  //
  // -3 > 2? no,
}
