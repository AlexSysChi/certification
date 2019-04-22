package OCAJP.initialization;

public class FinalFieldInit {

    static String s1;

    static String s2;
    static String s3;



    FinalFieldInit(){
        initMessage("constructor init");
        s3 = "constructor init";
    }

    static  {
        initMessage("second static initBlock");
        s2 = "set in static init bloc TWO";
    }

    static  {
        initMessage("first static initBlock");
        s1 = "set in static init bloc ONE";
    }




    private static void initMessage(String initBlockName) {
        System.out.println(initBlockName);
        System.out.println("\ts1: " + s1);
        System.out.println("\ts2: " + s2);
        System.out.println("\ts3: " + s3);
    }

    public static void main(String[] args) {
        FinalFieldInit finalFieldInit = new FinalFieldInit();
        initMessage("after constructor init");

    }


}
