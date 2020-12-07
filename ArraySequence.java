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
    for(int i = 0; i < otherseq.length(); i++) {
      data[i] = otherseq.next();
    }
  }

  public void reset() {
    currentIndex = 0;
    data = new int[0];
  }

  public int length() {
    return data.length;
  }

  public boolean hasNext() {
    return currentIndex < data.length - 1;
  }

  public int next() {
    currentIndex++;
    return data[currentIndex];
  }

}
