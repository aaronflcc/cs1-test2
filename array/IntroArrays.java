public class IntroArrays {
    public static void main(String[] args) {
        String[] nameList = new String[3];

        nameList[0] = "Nate";
        nameList[1] = "Aaron";
        nameList[2] = "Amy";

        String[] studentList = {"Nate", "Aaron" };
        //                        0        1       2       3        4

        String firstStudent = studentList[0];
        System.out.println(firstStudent);
        System.out.println(studentList[1]);

        int lastIndex = studentList.length - 1;
        String lastStudent = studentList[lastIndex];
        System.out.println(lastStudent);

        System.out.println("\nTHE ENTIRE STUDENT LIST");
        //for (int i=0; i <= lastIndex; i++) {
        for (int i=0; i < studentList.length; i++) {
            String name = studentList[i];
            System.out.println(name);
        }
    }
}