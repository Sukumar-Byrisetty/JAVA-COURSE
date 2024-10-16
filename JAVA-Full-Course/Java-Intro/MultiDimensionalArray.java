
public class MultiDimensionalArray {
    
    public static void main(String[] args) {
        
        String[][] cars =   { 
                                {"Camaro ","Corvette ","Silverado"},
                                {"Mustang ","Ranger ","F-150"},
                                {"Ferrari ","Lambo ","Tesla"}
                            };

        for(int i=0; i<cars.length; i++) {
            System.out.println();
            for(int j=0; j<cars.length; j++) {
                System.out.print(cars[i][j]+"");
            }
        }                    
    }
}

// Multi or 2D array => an array of arrays
