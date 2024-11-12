package theAuthorAndBookClassesturn;

public class text {
    public static void main(String[] args) {
  //testAuthor
     Author a1 = new Author( "tan ah teck","ahteck@nơhere.com");
     System.out.println(a1);

     a1.setEmail("ahteck@somewhere.com");
     System.out.println(a1);
     System.out.println("Name is : " + a1.getName());
     System.out.println("Email is : " + a1.getEmail());

   //testBook
     Book b1 = new Book("12345", "java for dummies ",a1,8.8,88)   ;
     System.out.println(b1);

     b1.setPrice(9.9);
     b1.setQty(99);
     System.out.println(b1);
        System.out.println(" isbn is : " + b1.getIsbn());
        System.out.println("name is : " + b1.getName());
        System.out.println("price is : " + b1.getPrice());
        System.out.println("qty is : " + b1.getQty());
        System.out.println("author is : " + b1.getAuthor());
        System.out.println("author's name : " + b1.getAuthorName());
        System.out.println("author's name :"+ b1.getAuthor().getName());//co the dung hai cai lenh nay de goi ten cua lop Author.
        System.out.println("author's email : " + b1.getAuthor().getEmail());


    }
}
