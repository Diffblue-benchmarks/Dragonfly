package com.alibaba.dragonfly.supernode.rest.request;

import com.alibaba.dragonfly.supernode.rest.request.ReportServiceDownRequest;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ReportServiceDownRequestTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void canEqualInputNotNullOutputFalse999e6f65d691ab724af() {

    // Arrange
    final ReportServiceDownRequest thisObj = new ReportServiceDownRequest();
    final Object arg0 = "aaaaa";

    // Act
    final boolean actual = thisObj.canEqual(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9998c588b28a25f3942() {

    // Act, creating object to test constructor
    final ReportServiceDownRequest actual = new ReportServiceDownRequest();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getCid());
    Assert.assertNull(actual.getTaskId());

  }

  // Test written by Diffblue Cover
  @Test
  public void equalsInputNotNullOutputFalse999a8e96ed707cd8855() {

    // Arrange
    final ReportServiceDownRequest thisObj = new ReportServiceDownRequest();
    final Object arg0 = "aaaaa";

    // Act
    final boolean actual = thisObj.equals(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getCidOutputVoid999a020594f9441f812() {

    // Arrange
    final ReportServiceDownRequest thisObj = new ReportServiceDownRequest();

    // Act
    final String actual = thisObj.getCid();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTaskIdOutputVoid9994659750144fd7546() {

    // Arrange
    final ReportServiceDownRequest thisObj = new ReportServiceDownRequest();

    // Act
    final String actual = thisObj.getTaskId();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void hashCodeOutputPositive9998d08f2cf7f60fd3e() {

    // Arrange
    final ReportServiceDownRequest thisObj = new ReportServiceDownRequest();

    // Act
    final int actual = thisObj.hashCode();

    // Assert result
    Assert.assertEquals(6061, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setCidInputNotNullOutputVoid9999b86b1947ec9058b() {

    // Arrange
    final ReportServiceDownRequest thisObj = new ReportServiceDownRequest();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setCid(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getCid());

  }

  // Test written by Diffblue Cover
  @Test
  public void setTaskIdInputNotNullOutputVoid999dafa2f72f312079d() {

    // Arrange
    final ReportServiceDownRequest thisObj = new ReportServiceDownRequest();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setTaskId(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getTaskId());

  }

  // Test written by Diffblue Cover
  @Test
  public void toStringOutputNotNull999f58da9385420b90b() {

    // Arrange
    final ReportServiceDownRequest thisObj = new ReportServiceDownRequest();

    // Act
    final String actual = thisObj.toString();

    // Assert result
    Assert.assertEquals("ReportServiceDownRequest(taskId=null, cid=null)", actual);

  }
}
