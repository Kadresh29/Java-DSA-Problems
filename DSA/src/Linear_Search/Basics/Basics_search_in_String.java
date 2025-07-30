package Linear_Search.Basics;

public class Basics_search_in_String {
    public static void main(String[] args) {
        String name="Kadresh";
        char target='d';
        System.out.println(search(name,target)); // output : true
        System.out.println(search2(name,target)); // output : true
    }

    // char is found return true
    static boolean search(String element,char target){
        if (element.length()==0){
            return false;
        }
        for (int i = 0; i < element.length(); i++) {
            //use the cahrAt method to find the char
            if(target==element.charAt(i)){
                return true;
        }
        }
        return false;
    }

    // another method char is found return true
    static boolean search2(String str,char target){
        if (str.length()==0){
            return false;
        }
        //convert the string into a char array
        for (char ch : str.toCharArray()){
            if (target==ch){
                return true;
            }
        }
        return false;
    }

}
