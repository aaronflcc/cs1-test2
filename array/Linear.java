public class Linear {

    public static void main(String[] args) {     
        
        String[] names = { "abc", "bob", "xyz", "lmno" };
        
        int[] myNumbers = {1, 45, 23, 0};
        ArrayHelper.show(myNumbers);
        ArrayHelper.selectionSort(myNumbers);
        ArrayHelper.show(myNumbers);
        
        /*
        * Simple Linear Search Algorithm
        * Search through the names for "Bob"
        * Use a flag, a boolean variable, to keep track of whether it was 
        * found or not. After searching the array, if the flag is true we 
        * found it! If false, not found.
        */
        boolean foundBob = false;
        for (int i=0; i < names.length; i++) {
            if ( names[i].equalsIgnoreCase("Bob") ) {
                foundBob = true;
                break;
            }        
        }

        if (foundBob) {
            System.out.println("Bob is here!");
        }
    }
}