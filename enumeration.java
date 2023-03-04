enum example{
    HAPPY,
    NAZIA,
    SHEEN
}

public class enumeration {
    public static void main(String[] args) {

        for(example child:example.values())
        System.out.println(child);
        // example child=example.NAZIA;
        // System.out.println(child);
    }
    
}
