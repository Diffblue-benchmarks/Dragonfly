package com.alibaba.dragonfly.supernode.common.util;

import com.alibaba.dragonfly.supernode.common.util.DigestUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class DigestUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999185e08c1388ec3dd() {

    // Act, creating object to test constructor
    final DigestUtil actual = new DigestUtil();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void sha1InputNotNullOutputNotNull999bf38ed1c615c8c6c() {

    // Arrange
    final ArrayList<String> arg0 = new ArrayList<String>();
    arg0.add("aaaaa");

    // Act
    final String actual = DigestUtil.sha1(arg0);

    // Assert result
    Assert.assertEquals("df51e37c269aa94d38f93e537bf6e2020b21406c", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void sha256InputNotNullOutputNotNull9992c8b9b440d05dbd8() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    final String actual = DigestUtil.sha256(arg0);

    // Assert result
    Assert.assertEquals("ed968e840d10d2d313a870bc131a4e2c311d7ad09bdf32b3418147221f51a6e2", actual);

  }
}
