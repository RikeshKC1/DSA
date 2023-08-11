package CourseWork.Question1;

//1 a.
public class ClothingCost {
    public static void main(String[] args) {
        int[][] price = {
                { 14, 4, 11 },
                { 11, 14, 3 },
                { 14, 2, 10 }
        };
        int minimumCost = minimumCost(price);
        System.out.println("Minimum cost required: " + minimumCost);
    }

    public static int minimumCost(int[][] price) {
        int minCost1 = 0;
        int minCost2 = 0;
        int minCost3 = 0;

        for (int[] person : price) {
            // contains the updated minimum cost for clothing of type 1 for the current
            // person, considering the preferences and minimum costs from the previous
            // person's choices for types 2 and 3.
            int newMinCost1 = person[0] + Math.min(minCost2, minCost3);
            int newMinCost2 = person[1] + Math.min(minCost1, minCost3);
            int newMinCost3 = person[2] + Math.min(minCost1, minCost2);

            // Update the minimum costs for each type of clothing
            // This variable represents the minimum cost of selecting clothing for type 1
            // for the previous person. It is updated based on the previous person's choices
            // for types 2 and 3.
            minCost1 = newMinCost1;
            // Update the minimum cost for each type of clothing
// This variable represents the minimum clothing selection cost for type 1
// for the previous person. It is updated according to the previous person's choice
// for types 2 and 3.

            minCost2 = newMinCost2;// This variable represents the minimum clothing selection cost for type 1
// for the previous person. It is updated according to the previous person's choice
// for type 2 and 3.

            minCost3 = newMinCost3;// This variable represents the minimum cost of selecting clothing for type 1
                                   // for the previous person. It is updated based on the previous person's choices
                                   // for types 2 and 3.
        }
        // Return the minimum of the three computed costs
        return Math.min(minCost1, Math.min(minCost2, minCost3));
    }

}
