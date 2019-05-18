package raytracer;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ValueTest {
  @Test
  public void hasValue() {
    Value a = new Value(10);
    assertThat(a.v).isEqualTo(10);
  }
}