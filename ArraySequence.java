import java.util.NoSuchElementException;

public class ArraySequence implements IntegerSequence {

  private int currentIndex;
  private int[] data;

  public ArraySequence(int[] other) {
    currentIndex = 0;
    data = new int[ other.length ];
    for(int i = 0; i < other.length; i++) {
      data[i] = other[i];
    }
  }

  public ArraySequence(IntegerSequence otherseq) {
    currentIndex = 0;
    data = new int[ otherseq.length() ];
    for(int i = 0; i < otherseq.length() - 1; i++) {
      data[i] = otherseq.next();
    }
    otherseq.reset();
  }

  public void reset() {
    currentIndex = 0;
  }

  public int length() {
    return data.length;
  }

  public boolean hasNext() {
    return 0 <= currentIndex && currentIndex < data.length;
  }

  public int next() {
    if ( hasNext() ) {
      currentIndex++;
      return data[currentIndex - 1];
    }
    else throw new NoSuchElementException("NoSuchElementException: No elements beyond " + (currentIndex - 1));
  }

}
