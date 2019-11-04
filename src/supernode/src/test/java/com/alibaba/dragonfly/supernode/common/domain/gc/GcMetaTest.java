package com.alibaba.dragonfly.supernode.common.domain.gc;

import com.alibaba.dragonfly.supernode.common.domain.gc.GcMeta;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class GcMetaTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullTrueOutputNotNull999b700852dde46a929() {

    // Arrange
    final String arg0 = "aaaaa";
    final ArrayList<String> arg1 = new ArrayList<String>();
    arg1.add("aaaaa");
    final boolean arg2 = true;

    // Act, creating object to test constructor
    final GcMeta actual = new GcMeta(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertTrue(actual.isAll());
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    Assert.assertEquals(arrayList, actual.getCids());
    Assert.assertEquals("aaaaa", actual.getTaskId());

  }

  // Test written by Diffblue Cover
  @Test
  public void getCidsOutput19994d25b3db3970b7b8() {

    // Arrange
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    final GcMeta thisObj = new GcMeta("aaaaa", arrayList, true);

    // Act
    final List<String> actual = thisObj.getCids();

    // Assert result
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("aaaaa");
    Assert.assertEquals(arrayList1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getTaskIdOutputNotNull999b598c5735b62c64a() {

    // Arrange
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    final GcMeta thisObj = new GcMeta("aaaaa", arrayList, true);

    // Act
    final String actual = thisObj.getTaskId();

    // Assert result
    Assert.assertEquals("aaaaa", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isAllOutputTrue9999418a8cf35271c59() {

    // Arrange
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    final GcMeta thisObj = new GcMeta("aaaaa", arrayList, true);

    // Act
    final boolean actual = thisObj.isAll();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setAllInputTrueOutputVoid999f6cb1a9aacee5dbb() {

    // Arrange
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    final GcMeta thisObj = new GcMeta("aaaaa", arrayList, true);
    final boolean arg0 = true;

    // Act
    thisObj.setAll(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setCidsInputNotNullOutputVoid999aa6f60fb78171cce() {

    // Arrange
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    final GcMeta thisObj = new GcMeta("aaaaa", arrayList, true);
    final ArrayList<String> arg0 = new ArrayList<String>();
    arg0.add("aaaaa");

    // Act
    thisObj.setCids(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setTaskIdInputNotNullOutputVoid999d135e07d97524ef7() {

    // Arrange
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    final GcMeta thisObj = new GcMeta("aaaaa", arrayList, true);
    final String arg0 = "aaaaa";

    // Act
    thisObj.setTaskId(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
