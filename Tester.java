public class Tester {

  public static void main(String[]args) {
    IntegerSequence r = new Range(10, 20);
    while ( r.hasNext() ) {
      System.out.println( r.next() );
      if ( r.hasNext() ) System.out.println(", ");
    }
    System.out.println();
  }

}