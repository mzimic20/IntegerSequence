import java.util.NoSuchElementException;

public class Range implements IntegerSequence {

  private int start, end, current;

  public Range(int s, int e) {
    start = s;
    end = e;
    current = start;
  }

  public void reset() {
    current = start;
  }

  public int length() {
    return end - start + 1;
  }

  public boolean hasNext() {
    return start <= current && current <= end;
  }

  public int next() {
    if ( !hasNext() ) {
      throw new NoSuchElementException("NoSuchElementException: No elements beyond " + (current - 1));
    }
    current++;
    return current - 1;
  }

}
