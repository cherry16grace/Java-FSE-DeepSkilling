import java.util.Arrays;
import java.util.Comparator;

public class LibrarySearch {
    // Linear Search
    public static Book linearSearch(Book[] books,String title){
        for(Book b : books){

            if(b.title.equalsIgnoreCase(title)){
                return b;
            }
        }

        return null;
    }
// Binary Search

    public static Book binarySearch(Book[] books,String title){


        int left=0;
        int right=books.length-1;



        while(left<=right){


            int mid=(left+right)/2;


            int result =
            books[mid].title.compareToIgnoreCase(title);



            if(result==0)
                return books[mid];


            else if(result<0)
                left=mid+1;


            else
                right=mid-1;

        }


        return null;

    }






    public static void main(String args[]){



        Book books[]={


            new Book(1,"Java","James"),

            new Book(2,"Python","Guido"),

            new Book(3,"Spring","Rod"),


            new Book(4,"C++","Bjarne")

        };



        System.out.println("Linear Search:");

        System.out.println(
        linearSearch(books,"Python"));




        // Sort before binary search

        Arrays.sort(
        books,
        Comparator.comparing(b->b.title)
        );



        System.out.println("\nBinary Search:");

        System.out.println(
        binarySearch(books,"Spring"));

    }

}