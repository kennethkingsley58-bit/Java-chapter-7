a)
    public class Array {
        public static void main(String[] args){

        int[] counts = new int[21];

        for (int index = 10; index <= 20; index++){
            counts[index] = 0;
        }
        for (int index = 10; index <= 20; index++){
            System.out.println("counts[" + index + "] = " + counts[index]);
        }
 }
}


b) 
public class Array{
    public static void main(String[] args) {

        int[] bonus = {
            5, 10, 15, 20, 25,
            30, 35, 40, 45, 50,
            55, 60, 65, 75, 80,
            85, 90, 95, 100, 105
        };

        for (int index = 0; index < 20; index++) {
            bonus[index] = bonus[index] * 2;
        }

        System.out.println("Bonus values after multiplying by 2:");

        for (int index = 0; index < 20; index++) {
            System.out.println(bonus[index]);
        }
 }
}



c)
public class Array{
    public static void main(String[] args) {

        
        int[] bestScores = {3, 7, 4, 2, 8, 5, 12, 24, 19, 31};

        System.out.println("Best scores: ");

        for (int index = 0; index < 10; index++) {
            System.out.println(bestScores[index]);
        }
 }
}





