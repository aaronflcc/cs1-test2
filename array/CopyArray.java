public class CopyArray {
    
    public static void main(String[] args) {    
        String[] names = { "Bob", "Jill", "JoJo", "Beatrice", "YoYo"};
        String[] otherNames = names; //shallow copy

        otherNames[0] = "George";
        System.out.println(names[0] + ", " + otherNames[0]);

        //deep copy
        String[] namesCopy = new String[names.length];
        for (int i=0; i < names.length; i++) {
            namesCopy[i] = names[i];
        }

        namesCopy[0] = "Felix";
        System.out.println(names[0] + ", " + namesCopy[0]);
        
    } //end main

} // end class