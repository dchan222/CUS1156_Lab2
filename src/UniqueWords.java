import java.util.ArrayList;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {
	   int count;
	   return count = (int) list.stream().distinct().count();
   }

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
	  /*words.add("pineapple");
	  * pineapple returns 6
	  */
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
