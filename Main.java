

public class Main {
    public static void main(String[] args){

        System.out.println(hasUniqueChars("Moonday"));
    }

    public static boolean hasUniqueChars(String n){
      
        for (int i = 0; i < n.length(); i++){
            for (int j = i + 1; j < n.length(); j++) {
                //checking one letter at a time and comparing one to every letter
                if (n.charAt(i) == n.charAt(j))
                return false;
            }
        }
        return true;
        
    }
}