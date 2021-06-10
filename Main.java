import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        task1(3);
        //task1(0);
        task2(3);
        task3(2);
        List<String> str= Arrays.asList("Hello","ok","code","java","no","no");
//        isContains(str,"ok");
        System.out.println(isContains(str,"ok"));
        System.out.println(isContains(str,"oko"));
        System.out.println(isContains(str,"no"));

    }
//    1. Есть лист строк, найти количество слов в листе, длина которых меньше n
    private static void task1(int n){
        List<String> str= Arrays.asList("Hello","ok","code","java","no");
        List<String> result = str
                .stream()
                .filter(s -> s.length() < n)
                .collect(Collectors.toList());
        System.out.println(result);

    }
//2. Есть лист строк, вернуть лист строк, длина которых меньше n, исключить повторения  //use .collect(Collectors.toList());
    private static void task2(int n){
        List<String> str= Arrays.asList("Hello","ok","code","no","java","no","Hello","ja","ja");
        List<String> result = str
                .stream()
                .filter(s -> s.length() < n)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(result);

    }
//3. Есть лист строк. составить одну строку из листа длиной больше n, ToUpperCase, исключить повторения и отсортировать а-я
    private static void task3(int n){
        List<String> str= Arrays.asList("Hello","ok","code","no","java","no","Hello","ja","ja");
        List<String> result = str
                .stream()
                .filter(s -> s.length() > n)
                .map(String::toUpperCase)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(result);
    }


//5. Есть лист строк, узнать содержится в списке переданное слово, используя stream API.
//    public boolean isContains(List<String> wordsList, String word){
//        return wordsList.stream(). ...
//    }
    public static boolean isContains(List<String> wordsList, String word){
        boolean result=wordsList.stream().anyMatch(word::equals);
        return  result;
//        System.out.println(result);
    }
}
