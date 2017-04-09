import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;

  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }

  @Test
  public void sizeZero() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    String e="";
    when(mq.size()).thenReturn(0);
    int res = c.countNumberOfOccurrences(e);
        assertEquals(-1,res);
  }
  @Test
  public void notContain() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    String e="e";	
    when(mq.size()).thenReturn(1);
    when(mq.contains(e)).thenReturn(false);
    int res = c.countNumberOfOccurrences(e);
        assertEquals(0,res);
  }
 @Test
  public void containSome() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    String e="i";
    when(mq.size()).thenReturn(4);
    when(mq.getAt(0)).thenReturn("i");
    when(mq.getAt(1)).thenReturn("i");
    when(mq.getAt(2)).thenReturn("e");
    when(mq.getAt(3)).thenReturn("i");
    when(mq.contains(e)).thenReturn(true);

    int counter = 0;
        for (int i = 0; i < mq.size(); i++) {
           if (e.equals(mq.getAt(i))) {
           counter++;
      }
    }
    int res = c.countNumberOfOccurrences(e);
    boolean we=(res==counter);

        assertEquals(true,we);
  }

}
