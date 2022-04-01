import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
		
   Arrays.asList("Hello","Hi","Bye","tc").stream().filter(s -> s.length()>2).forEach(System.out::println);
//      Arrays.asList("Hello","Hi","Bye","tc").stream().map(s -> s+"1").forEach(System.out::println);
      
      //stream object creation 
//      Arrays.asList(1,2,3,4).stream().forEach(System.out::println);
      
//      Integer[] array = new Integer[] {1,2,3,4};
//      Arrays.stream(array).forEach(System.out::println);
//      Arrays.stream(new int[] {4,5,6,7}).forEach(System.out::println);
      
//      Stream.of(1,"Hello",3,"hi",'a').forEach(System.out::println);
      
//      String s = "hello";
//      Stream<Character> stream = s.chars().mapToObj(c->(char)c);
//      stream.forEach(System.out::println);
      
      // different type of Terminal operation
//      Collection<Integer> list =Arrays.asList(1,4,7,0,3).stream().map(x -> x+1).collect(Collectors.toList());
//      System.out.println(list);
      
//      List<Integer> list =Arrays.asList(1,4,7,0,3).stream().map(x -> x+1).collect(Collectors.toCollection(ArrayList<Integer>::new));
//      System.out.println(list);
      
      
//      String s = Arrays.asList(1,4,7,0,3).stream().
//                 map(x -> String.valueOf(x)).
//                 collect(Collectors.joining("."));
//      System.out.println(s);
      
      
//      String s = Arrays.asList(1,4,7,0,3).stream().map(String::valueOf).collect(Collectors.joining("."));
//      System.out.println(s);
      
//      Integer[] array = Arrays.asList(1,4,7,0,3).stream().toArray(Integer[]::new);
//      System.out.println(Arrays.toString(array));
      
//      Arrays.asList(1,4,7,0,3,5,6,7,4,1,0).stream().distinct().forEach(System.out::println);
      System.out.println(Arrays.asList(1,4,7,0,3,5,6,7,4,1,0).stream().map(x->x+1).collect(Collectors.toList()));
	}

}
