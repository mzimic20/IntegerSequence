import java.util.NoSuchElementException;

public class Range implements IntegerSequence {

  private int start, end, current;

  public Range(int s, int e) {
    start = s;
    end = e;
    current = s;
  }

  public void reset() {
    start = 0;
    end = 0;
    current = 0;
  }

  public int length() {
    return end - start + 1;
  }

  public boolean hasNext() {
    return current < end + 1;
  }

  public int next() {
    if ( hasNext() ) {
      current++;
      return current - 1;
    }
    else throw new NoSuchElementException("NoSuchElementException: No elements beyond " + (current - 1));
  }

}
