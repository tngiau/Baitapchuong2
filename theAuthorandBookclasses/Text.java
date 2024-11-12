package theAuthorandBookclasses;

public class Text {
    public static void main(String[] args) {

 //text author
      Author ahTeck = new Author("Tan Ah Teck","ahteck@nowhere.com",'m') ;
      System.out.println(ahTeck);
      ahTeck.setEmail("paulTan@nowhere.com");
      System.out.println("Name's is : "+ahTeck.getName());
      System.out.println("Email's is : "+ahTeck.getEmail());
      System.out.println("Gender's is : "+ahTeck.getGender());

 //text Book
      Book conan = new Book("Shinichi", ahTeck,19.5, 99 );
      System.out.println(conan);
      conan.setPrice(29.95);
      conan.setQty(28);
      System.out.println(" Name is : " + conan.getName());
      System.out.println(" Price is : " + conan.getPrice());
      System.out.println(" Qty is : " + conan.getQty());
      System.out.println(" Author is : " + conan.getAuthor());
      System.out.println(" Author's name is : " + conan.getAuthor().getName());
      System.out.println(" Author's email is : " + conan.getAuthor().getEmail());
    }
}
