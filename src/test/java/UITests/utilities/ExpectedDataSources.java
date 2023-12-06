package UITests.utilities;
public class ExpectedDataSources {

    public static String[] expectedinvalidEmail(){
        String[] expectedData = {"h3testw@mailsac.com","@mailsac.com",
                "juliannkozey@mailsac."};
        return expectedData;
    }
    public static String[] expectedinvalidPassword(){
        String[] expectedData = {"6","Htest3!second",
                "23567687"};
        return expectedData;
    }

}
