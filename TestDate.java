public class TestDate {
    public static void main(String[] args) {
        Date millanium = new Date();
        Date tommorrwdate = new Date(2024,2,28);
        
        System.out.println(millanium.toString());
        System.out.println(tommorrwdate.findTommorrow());
    }
}
