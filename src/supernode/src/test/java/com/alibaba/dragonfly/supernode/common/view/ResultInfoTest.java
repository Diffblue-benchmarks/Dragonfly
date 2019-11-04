package com.alibaba.dragonfly.supernode.common.view;

import com.alibaba.dragonfly.supernode.common.view.ResultInfo;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.HashMap;
import java.util.Map;



public class ResultInfoTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void addAdditionInputNotNullNotNullOutputVoid99925b80c6bf3819271() {

    // Arrange
    final ResultInfo thisObj = new ResultInfo();
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";

    // Act
    thisObj.addAddition(arg0, arg1);

    // Assert side effects
    final HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    Assert.assertEquals(hashMap, thisObj.getAddition());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9990bafde5cbb9af7a3() {

    // Act, creating object to test constructor
    final ResultInfo actual = new ResultInfo();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(200, actual.getCode());
    Assert.assertNull(actual.getAddition());
    Assert.assertNull(actual.getMsg());
    Assert.assertNull(actual.getData());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputPositiveNotNullOutputNotNull999acbff5c7f38f21bf() {

    // Arrange
    final int arg0 = 1;
    final Object arg1 = "aaaaa";

    // Act, creating object to test constructor
    final ResultInfo actual = new ResultInfo(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getCode());
    Assert.assertNull(actual.getAddition());
    Assert.assertNull(actual.getMsg());
    Assert.assertEquals("aaaaa", actual.getData());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputPositiveNotNullNotNullOutputNotNull9998730e2f569150acf() {

    // Arrange
    final int arg0 = 1;
    final String arg1 = "aaaaa";
    final Object arg2 = "aaaaa";

    // Act, creating object to test constructor
    final ResultInfo actual = new ResultInfo(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getCode());
    Assert.assertNull(actual.getAddition());
    Assert.assertEquals("aaaaa", actual.getMsg());
    Assert.assertEquals("aaaaa", actual.getData());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputPositiveOutputNotNull99963664a2bca42a646() {

    // Arrange
    final int arg0 = 1;

    // Act, creating object to test constructor
    final ResultInfo actual = new ResultInfo(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getCode());
    Assert.assertNull(actual.getAddition());
    Assert.assertNull(actual.getMsg());
    Assert.assertNull(actual.getData());

  }

  // Test written by Diffblue Cover
  @Test
  public void getAdditionOutputVoid9992ee17f3726c73fea() {

    // Arrange
    final ResultInfo thisObj = new ResultInfo();

    // Act
    final Map<String, String> actual = thisObj.getAddition();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getCodeOutputPositive999f93c0306836f5bf9() {

    // Arrange
    final ResultInfo thisObj = new ResultInfo();

    // Act
    final int actual = thisObj.getCode();

    // Assert result
    Assert.assertEquals(200, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getDataOutputVoid999a4700b314ac366b0() {

    // Arrange
    final ResultInfo thisObj = new ResultInfo();

    // Act
    final Object actual = thisObj.getData();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getMsgOutputVoid99987a5cefd701d51a3() {

    // Arrange
    final ResultInfo thisObj = new ResultInfo();

    // Act
    final String actual = thisObj.getMsg();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setAdditionInputNotNullOutputVoid999a3cc18fe10a8ca63() {

    // Arrange
    final ResultInfo thisObj = new ResultInfo();
    final HashMap<String, String> arg0 = new HashMap<String, String>();
    arg0.put("aaaaa", "aaaaa");

    // Act
    thisObj.setAddition(arg0);

    // Assert side effects
    final HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    Assert.assertEquals(hashMap, thisObj.getAddition());

  }

  // Test written by Diffblue Cover
  @Test
  public void setCodeInputPositiveOutputVoid999030527b71e7a517a() {

    // Arrange
    final ResultInfo thisObj = new ResultInfo();
    final int arg0 = 1;

    // Act
    thisObj.setCode(arg0);

    // Assert side effects
    Assert.assertEquals(1, thisObj.getCode());

  }

  // Test written by Diffblue Cover
  @Test
  public void setDataInputNotNullOutputVoid999cfb3abc318eae70f() {

    // Arrange
    final ResultInfo thisObj = new ResultInfo();
    final Object arg0 = "aaaaa";

    // Act
    thisObj.setData(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getData());

  }

  // Test written by Diffblue Cover
  @Test
  public void setMsgInputNotNullOutputVoid999ea0df9957d154aa7() {

    // Arrange
    final ResultInfo thisObj = new ResultInfo();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setMsg(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getMsg());

  }

  // Test written by Diffblue Cover
  @Test
  public void successCodeOutputTrue999c14511b9407e1c39() {

    // Arrange
    final ResultInfo thisObj = new ResultInfo();

    // Act
    final boolean actual = thisObj.successCode();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void withCodeInputPositiveOutputNotNull999ee9fa7120fab6c2c() {

    // Arrange
    final ResultInfo thisObj = new ResultInfo();
    final int arg0 = 1;

    // Act
    final ResultInfo actual = thisObj.withCode(arg0);

    // Assert side effects
    Assert.assertEquals(1, thisObj.getCode());

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getCode());
    Assert.assertNull(actual.getAddition());
    Assert.assertNull(actual.getMsg());
    Assert.assertNull(actual.getData());

  }

  // Test written by Diffblue Cover
  @Test
  public void withDataInputNotNullOutputNotNull9994791b37a08361299() {

    // Arrange
    final ResultInfo thisObj = new ResultInfo();
    final Object arg0 = "aaaaa";

    // Act
    final ResultInfo actual = thisObj.withData(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getData());

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(200, actual.getCode());
    Assert.assertNull(actual.getAddition());
    Assert.assertNull(actual.getMsg());
    Assert.assertEquals("aaaaa", actual.getData());

  }

  // Test written by Diffblue Cover
  @Test
  public void withMsgInputNotNullOutputNotNull999442731c8fe977e32() {

    // Arrange
    final ResultInfo thisObj = new ResultInfo();
    final String arg0 = "aaaaa";

    // Act
    final ResultInfo actual = thisObj.withMsg(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getMsg());

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(200, actual.getCode());
    Assert.assertNull(actual.getAddition());
    Assert.assertEquals("aaaaa", actual.getMsg());
    Assert.assertNull(actual.getData());

  }
}
