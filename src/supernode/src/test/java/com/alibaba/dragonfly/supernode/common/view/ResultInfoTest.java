package com.alibaba.dragonfly.supernode.common.view;

import com.alibaba.dragonfly.supernode.common.view.ResultInfo;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.HashMap;

public class ResultInfoTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void addAdditionInputNotNullNotNullOutputVoid() {

    // Arrange
    final ResultInfo resultInfo = new ResultInfo();

    // Act
    resultInfo.addAddition("", "");

    // Assert side effects
    final HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("", "");
    Assert.assertEquals(hashMap, resultInfo.getAddition());
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputZeroNotNullNotNullOutputNotNull() {

    // Arrange
    final Integer data = new Integer(0);

    // Act, creating object to test constructor
    final ResultInfo actual = new ResultInfo(0, "", data);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getData());
    Assert.assertNull(actual.getAddition());
    Assert.assertEquals("", actual.getMsg());
    Assert.assertEquals(0, actual.getCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputZeroNotNullOutputNotNull() {

    // Arrange
    final Integer data = new Integer(0);

    // Act, creating object to test constructor
    final ResultInfo actual = new ResultInfo(0, data);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getData());
    Assert.assertNull(actual.getAddition());
    Assert.assertNull(actual.getMsg());
    Assert.assertEquals(0, actual.getCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputZeroOutputNotNull() {

    // Act, creating object to test constructor
    final ResultInfo actual = new ResultInfo(0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getData());
    Assert.assertNull(actual.getAddition());
    Assert.assertNull(actual.getMsg());
    Assert.assertEquals(0, actual.getCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final ResultInfo actual = new ResultInfo();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getData());
    Assert.assertNull(actual.getAddition());
    Assert.assertNull(actual.getMsg());
    Assert.assertEquals(200, actual.getCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getAdditionOutputNull() {

    // Arrange
    final ResultInfo resultInfo = new ResultInfo();

    // Act and Assert result
    Assert.assertNull(resultInfo.getAddition());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCodeOutputPositive() {

    // Arrange
    final ResultInfo resultInfo = new ResultInfo();

    // Act and Assert result
    Assert.assertEquals(200, resultInfo.getCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getDataOutputNull() {

    // Arrange
    final ResultInfo resultInfo = new ResultInfo();

    // Act and Assert result
    Assert.assertNull(resultInfo.getData());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getMsgOutputNull() {

    // Arrange
    final ResultInfo resultInfo = new ResultInfo();

    // Act and Assert result
    Assert.assertNull(resultInfo.getMsg());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setAdditionInputNullOutputVoid() {

    // Arrange
    final ResultInfo resultInfo = new ResultInfo();

    // Act
    resultInfo.setAddition(null);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setCodeInputZeroOutputVoid() {

    // Arrange
    final ResultInfo resultInfo = new ResultInfo();

    // Act
    resultInfo.setCode(0);

    // Assert side effects
    Assert.assertEquals(0, resultInfo.getCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setDataInputNotNullOutputVoid() {

    // Arrange
    final ResultInfo resultInfo = new ResultInfo();
    final Integer data = new Integer(0);

    // Act
    resultInfo.setData(data);

    // Assert side effects
    Assert.assertEquals(0, resultInfo.getData());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setMsgInputNotNullOutputVoid() {

    // Arrange
    final ResultInfo resultInfo = new ResultInfo();

    // Act
    resultInfo.setMsg("");

    // Assert side effects
    Assert.assertEquals("", resultInfo.getMsg());
  }

  // Test written by Diffblue Cover.
  @Test
  public void successCodeOutputTrue() {

    // Arrange
    final ResultInfo resultInfo = new ResultInfo();

    // Act and Assert result
    Assert.assertTrue(resultInfo.successCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void withCodeInputZeroOutputNotNull() {

    // Arrange
    final ResultInfo resultInfo = new ResultInfo();

    // Act
    final ResultInfo actual = resultInfo.withCode(0);

    // Assert side effects
    Assert.assertEquals(0, resultInfo.getCode());

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getData());
    Assert.assertNull(actual.getAddition());
    Assert.assertNull(actual.getMsg());
    Assert.assertEquals(0, actual.getCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void withDataInputNotNullOutputNotNull() {

    // Arrange
    final ResultInfo resultInfo = new ResultInfo();
    final Integer data = new Integer(0);

    // Act
    final ResultInfo actual = resultInfo.withData(data);

    // Assert side effects
    Assert.assertEquals(0, resultInfo.getData());

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getData());
    Assert.assertNull(actual.getAddition());
    Assert.assertNull(actual.getMsg());
    Assert.assertEquals(200, actual.getCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void withMsgInputNotNullOutputNotNull() {

    // Arrange
    final ResultInfo resultInfo = new ResultInfo();

    // Act
    final ResultInfo actual = resultInfo.withMsg("");

    // Assert side effects
    Assert.assertEquals("", resultInfo.getMsg());

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getData());
    Assert.assertNull(actual.getAddition());
    Assert.assertEquals("", actual.getMsg());
    Assert.assertEquals(200, actual.getCode());
  }
}
