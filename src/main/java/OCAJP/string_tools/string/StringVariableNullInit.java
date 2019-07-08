package OCAJP.string_tools.string;

public class StringVariableNullInit {

    public static void main(String[] args) {
        String myStr = "good";
        char[] myCharArr = {'g', 'o', 'o', 'd'};



        String newStr = null;
        System.out.println(newStr);

        newStr += '!';
        System.out.println(newStr);
    }

}
