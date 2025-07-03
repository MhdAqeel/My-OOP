public class TestDate {
    public static void main(String[] args) {
        Date millanium = new Date();
        Date tommorrwdate = new Date(2024,12,31);
        
        System.out.println(tommorrwdate.toString());
        System.out.println(tommorrwdate.findTommorrow());
    }
}
