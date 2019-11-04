package com.alibaba.dragonfly.supernode.common.util;

import com.alibaba.dragonfly.supernode.common.exception.AuthenticationRequiredException;
import com.alibaba.dragonfly.supernode.common.exception.UrlNotReachableException;
import com.alibaba.dragonfly.supernode.common.util.HttpClientUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;



public class HttpClientUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b561e7ca65e1ceeb() {

    // Act, creating object to test constructor
    final HttpClientUtil actual = new HttpClientUtil();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void fillHeadersInputNull3OutputNullPointerException999d2d382b008419e7c() {

    // Arrange
    final HttpURLConnection arg0 = null;
    final String[] arg1 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    thrown.expect(NullPointerException.class);
    HttpClientUtil.fillHeaders(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getContentLengthInputNotNull3TrueOutputMalformedURLException9998cf3cd7b11c227e7() throws AuthenticationRequiredException, UrlNotReachableException, MalformedURLException {

    // Arrange
    final String arg0 = "aaaaa";
    final String[] arg1 = { "aaaaa", "aaaaa", "aaaaa" };
    final boolean arg2 = true;

    // Act
    thrown.expect(MalformedURLException.class);
    HttpClientUtil.getContentLength(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isExpiredInputNotNullPositive3OutputMalformedURLException9991d21c390cc1bb534() throws MalformedURLException {

    // Arrange
    final String arg0 = "aaaaa";
    final long arg1 = 1L;
    final String[] arg2 = { "aaaaa", "aaaaa", "aaaka" };

    // Act
    thrown.expect(MalformedURLException.class);
    HttpClientUtil.isExpired(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isSupportRangeInputNotNull3OutputMalformedURLException9990c3bc82e53d9227b() throws MalformedURLException {

    // Arrange
    final String arg0 = "aaaaa";
    final String[] arg1 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    thrown.expect(MalformedURLException.class);
    HttpClientUtil.isSupportRange(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void openConnectionInputNullOutputNullPointerException999028d7d9b09dd93aa() throws NoSuchAlgorithmException, IOException, KeyManagementException {

    // Arrange
    final URL arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    HttpClientUtil.openConnection(arg0);

    // The method is not expected to return due to exception thrown

  }
}
