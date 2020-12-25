package CodeWars;
import java.util.*;
public class Practice {

    /*p0, percent, aug (inhabitants coming or leaving each year), p (population to surpass)
      the function nb_year should return n number of entire years needed to get a population greater or equal to p.
      aug is an integer, percent a positive or null number, p0 and p are positive integers (> 0)

      Examples:
      nb_year(1500, 5, 100, 5000) -> 15
      nb_year(1500000, 2.5, 10000, 2000000) -> 10
     */

    // Well written vs short Form

    public static int nbYear(int p0, double percent, int aug, int p) {
        int beginOfYear = p0;
        int endOfYear = beginOfYear + (int)(beginOfYear * (percent)/100) + aug;
        int yearCounter = 1;
        while (endOfYear < p){
            beginOfYear = endOfYear;
            endOfYear = beginOfYear + (int)(beginOfYear * percent/100) + aug;
            yearCounter += 1;
        }
        return yearCounter;
    }
    public static int nbYearShort(int p0, double percent, int aug, int p) {
        int years = 0;
        while (p0 < p) {
            p0 += p0 * percent / 100 + aug;
            years++;
        }
        return years;
    }
    // Sam Harris => S.H
    public static String abbrevName(String name) {
        String [] names = name.split(" ");
        return (names[0].charAt(0) + "." +names[1].charAt(0)).toUpperCase();
    }

    /*
    * For example: ["3:1", "2:2", "0:1", ...]
    Write a function that takes such collection and counts the points of our team in the championship.

    if x>y - 3 points
    if x<y - 0 point
    if x=y - 1 point*/

    public static int points(String[] games) {
        int points = 0;
        for(String match : games){
            String [] end = match.split(":",2);
            int x = Integer.parseInt(end[0]);
            int y = Integer.parseInt(end[1]);
            if (x > y){
                points += 3;
            }
            else if(x == y){
                points +=1;
            }
            //points += x > y ? 3 : x==y ? 1 : 0;
        }
        return points;
    }
    public static int pointsShort(String[] games) {
        int points = 0;
        for(String match : games){
            int x = Integer.parseInt(match.split(":",2)[0]);
            int y = Integer.parseInt(match.split(":",2)[1]);
            points += x > y ? 3 : x==y ? 1 : 0;
        }
        return points;
    }

    /*
    * Implement a function likes :: [String] -> String, which must take in input array, containing the names of people who like an item. It must return the display text as shown in the examples:

    likes {} // must be "no one likes this"
    likes {"Peter"} // must be "Peter likes this"
    likes {"Jacob", "Alex"} // must be "Jacob and Alex like this"
    likes {"Max", "John", "Mark"} // must be "Max, John and Mark like this"
    likes {"Alex", "Jacob", "Mark", "Max"} // must be "Alex, Jacob and 2 others like this"
     */
    public static String whoLikesIt(String... names) {
        switch (names.length) {
            case 0:
                return "no one likes this";
            case 1:
                return names[0] + " likes this";
            case 2:
                return names[0] + " and " + names[1] + " like this";
            case 3:
                return names[0] + ", " + names[1] + " and " + names[2] + " like this";
            default:
                return names[0] + ", " + names[1] + " and " + Integer.toString((names.length) - 2) + " others like this";
        }
    }
    /*
     * Write function avg which calculates average of numbers in given list.
     * */

    public static double find_average(int[] array){
        int sum = 0;
        for(int num : array){
            sum +=num;
        }
        return (double)sum/array.length;
    }

    /*
    * Given an array of integers, return a new array with each value doubled.
    For example:
    [1, 2, 3] --> [2, 4, 6]
    */

    public static int[] doubleEntry(int[] arr){
        return Arrays.stream(arr).map(x -> x*2).toArray();
    }

    /*
    Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).
     */
    public static boolean solution(String str, String ending) {
        return str.length() >= ending.length() && str.substring(str.length() - ending.length(), str.length()).contentEquals(ending);

    }
    public  static boolean ssolution(String str, String ending){
        return str.endsWith(ending);
    }
    /*
    Given an integral number, determine if it's a square number:
     */
    public static boolean isSquare(int n) {
        return n >=0  && ((int)Math.sqrt(n) *(int)Math.sqrt(n) == n);
        //or  Math.sqrt(n) % 1 == 0
    }

    /*
    Given an array of integers, find the one that appears an odd number of times.
    There will always be only one integer that appears an odd number of times
     */
    public static int findIt(int[] array) {
        int odd = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int key : array) {
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }
        for(Map.Entry<Integer, Integer> kap :map.entrySet()){
            if(kap.getValue() % 2 != 0 ) odd = kap.getKey() ;}
        return odd;
    }
    public static void main(String[] args) {
    }

}
