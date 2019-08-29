package com.alibaba.dragonfly.supernode.common.util;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.alibaba.dragonfly.supernode.common.exception.AuthenticationRequiredException;
import com.alibaba.dragonfly.supernode.common.exception.UrlNotReachableException;
import com.alibaba.dragonfly.supernode.common.util.HttpClientUtil;
import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.api.mockito.expectation.PowerMockitoStubber;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.slf4j.Logger;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

@RunWith(PowerMockRunner.class)
@PowerMockIgnore({"javax.management.*"})
public class HttpClientUtilTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void checkClientTrustedInputNullNotNullOutputVoid()
      throws NoSuchMethodException, IllegalAccessException, CertificateException,
             InvocationTargetException {
    final Class<?> classUnderTest = Reflector.forName(
        "com.alibaba.dragonfly.supernode.common.util.HttpClientUtil$TrustAnyTrustManager");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "checkClientTrusted", Reflector.forName("java.security.cert.X509Certificate[]"),
        Reflector.forName("java.lang.String"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(null, null, "");
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkServerTrustedInputNullNotNullOutputVoid()
      throws NoSuchMethodException, IllegalAccessException, CertificateException,
             InvocationTargetException {
    final Class<?> classUnderTest = Reflector.forName(
        "com.alibaba.dragonfly.supernode.common.util.HttpClientUtil$TrustAnyTrustManager");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "checkServerTrusted", Reflector.forName("java.security.cert.X509Certificate[]"),
        Reflector.forName("java.lang.String"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(null, null, "");
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final HttpClientUtil actual = new HttpClientUtil();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(StringUtils.class)
  @Test
  public void fillHeadersInputNull1OutputVoid() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final HttpURLConnection conn = null;
    final String[] headers = {"?"};
    final Method isNotBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isNotBlank", CharSequence.class);
    PowerMockito.doReturn(false)
        .when(StringUtils.class, isNotBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    HttpClientUtil.fillHeaders(conn, headers);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(HttpClientUtil.class)
  @Test
  public void fillHeadersInputNullNullOutputNullPointerException() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(HttpClientUtil.class);

    // Arrange
    final HttpURLConnection conn = null;
    final String[] headers = null;
    final HashMap hashMap = new HashMap();
    hashMap.put("\u6fa2\u6fa0\u6fa0\u6fa0\u6fa0\u6fa0\u6fa0\u6fa0\u6fa0\u6fa0\u6fa0", "?");
    final Method parseHeaderMethod =
        DTUMemberMatcher.method(HttpClientUtil.class, "parseHeader", java.lang.String[].class);
    PowerMockito.when(HttpClientUtil.class, parseHeaderMethod)
        .withArguments(or(isA(java.lang.String[].class), isNull(java.lang.String[].class)))
        .thenReturn(hashMap);

    // Act
    thrown.expect(NullPointerException.class);
    HttpClientUtil.fillHeaders(conn, headers);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(HttpClientUtil.class)
  @Test
  public void fillHeadersInputNullNullOutputVoid() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(HttpClientUtil.class);

    // Arrange
    final HttpURLConnection conn = null;
    final String[] headers = null;
    final Method parseHeaderMethod =
        DTUMemberMatcher.method(HttpClientUtil.class, "parseHeader", java.lang.String[].class);
    PowerMockito.when(HttpClientUtil.class, parseHeaderMethod)
        .withArguments(or(isA(java.lang.String[].class), isNull(java.lang.String[].class)))
        .thenReturn(null);

    // Act
    HttpClientUtil.fillHeaders(conn, headers);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void getAcceptedIssuersOutput0()
      throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {

    // Arrange
    final Object httpClientUtilTrustAnyTrustManager = null;

    // Act
    final Class<?> classUnderTest = Reflector.forName(
        "com.alibaba.dragonfly.supernode.common.util.HttpClientUtil$TrustAnyTrustManager");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod("getAcceptedIssuers");
    methodUnderTest.setAccessible(true);
    final X509Certificate[] actual =
        (X509Certificate[])methodUnderTest.invoke(httpClientUtilTrustAnyTrustManager);

    // Assert result
    Assert.assertArrayEquals(new X509Certificate[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({HttpURLConnection.class, URL.class, HttpClientUtil.class})
  @Test
  public void getContentLengthInputNotNull0TrueOutputAuthenticationRequiredException()
      throws UrlNotReachableException, AuthenticationRequiredException, Exception,
             MalformedURLException {

    // Arrange
    final String fileUrl = "\"\"";
    final String[] headers = {};
    final boolean dfdaemon = true;
    final URL uRL = PowerMockito.mock(URL.class);
    final Method getProtocolMethod = DTUMemberMatcher.method(URL.class, "getProtocol");
    PowerMockito.doReturn("rrrrSs").when(uRL, getProtocolMethod).withNoArguments();
    final HttpURLConnection httpURLConnection = PowerMockito.mock(HttpURLConnection.class);
    final Method getResponseCodeMethod =
        DTUMemberMatcher.method(HttpURLConnection.class, "getResponseCode");
    PowerMockito.doReturn(407).when(httpURLConnection, getResponseCodeMethod).withNoArguments();
    final Method openConnectionMethod = DTUMemberMatcher.method(URL.class, "openConnection");
    PowerMockito.doReturn(httpURLConnection).when(uRL, openConnectionMethod).withNoArguments();
    PowerMockito.whenNew(URL.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(uRL);

    // Act
    thrown.expect(AuthenticationRequiredException.class);
    HttpClientUtil.getContentLength(fileUrl, headers, dfdaemon);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({HttpURLConnection.class, URL.class, StringUtils.class, HttpClientUtil.class})
  @Test
  public void getContentLengthInputNotNull0TrueOutputAuthenticationRequiredException2()
      throws UrlNotReachableException, AuthenticationRequiredException, Exception,
             MalformedURLException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final String fileUrl = "!!!!!!!!!";
    final String[] headers = {};
    final boolean dfdaemon = true;
    final AuthenticationRequiredException authenticationRequiredException =
        PowerMockito.mock(AuthenticationRequiredException.class);
    PowerMockito.whenNew(AuthenticationRequiredException.class)
        .withNoArguments()
        .thenReturn(authenticationRequiredException);
    final URL uRL1 = PowerMockito.mock(URL.class);
    final Method getProtocolMethod1 = DTUMemberMatcher.method(URL.class, "getProtocol");
    PowerMockito.doReturn("").when(uRL1, getProtocolMethod1).withNoArguments();
    final HttpURLConnection httpURLConnection1 = PowerMockito.mock(HttpURLConnection.class);
    final Method getResponseCodeMethod1 =
        DTUMemberMatcher.method(HttpURLConnection.class, "getResponseCode");
    PowerMockito.doReturn(401).when(httpURLConnection1, getResponseCodeMethod1).withNoArguments();
    final Method openConnectionMethod1 = DTUMemberMatcher.method(URL.class, "openConnection");
    PowerMockito.doReturn(httpURLConnection1).when(uRL1, openConnectionMethod1).withNoArguments();
    final URL uRL = PowerMockito.mock(URL.class);
    final Method getProtocolMethod = DTUMemberMatcher.method(URL.class, "getProtocol");
    PowerMockito.doReturn("!!!!! ").when(uRL, getProtocolMethod).withNoArguments();
    final HttpURLConnection httpURLConnection = PowerMockito.mock(HttpURLConnection.class);
    final Method getHeaderFieldMethod =
        DTUMemberMatcher.method(HttpURLConnection.class, "getHeaderField", String.class);
    PowerMockito.doReturn("!!!!!!!!!!")
        .when(httpURLConnection, getHeaderFieldMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method getResponseCodeMethod =
        DTUMemberMatcher.method(HttpURLConnection.class, "getResponseCode");
    PowerMockito.doReturn(301).when(httpURLConnection, getResponseCodeMethod).withNoArguments();
    final Method openConnectionMethod = DTUMemberMatcher.method(URL.class, "openConnection");
    PowerMockito.doReturn(httpURLConnection).when(uRL, openConnectionMethod).withNoArguments();
    PowerMockito.whenNew(URL.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(uRL)
        .thenReturn(uRL1);
    final Method isNotBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isNotBlank", CharSequence.class);
    PowerMockito.doReturn(true)
        .when(StringUtils.class, isNotBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    thrown.expect(AuthenticationRequiredException.class);
    HttpClientUtil.getContentLength(fileUrl, headers, dfdaemon);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({HttpURLConnection.class, URL.class, HttpClientUtil.class})
  @Test
  public void getContentLengthInputNotNull0TrueOutputNegative()
      throws UrlNotReachableException, AuthenticationRequiredException, Exception,
             MalformedURLException {

    // Arrange
    final String fileUrl = "DDDD";
    final String[] headers = {};
    final boolean dfdaemon = true;
    final URL uRL = PowerMockito.mock(URL.class);
    final Method getProtocolMethod = DTUMemberMatcher.method(URL.class, "getProtocol");
    PowerMockito.doReturn("9yYYyX").when(uRL, getProtocolMethod).withNoArguments();
    final HttpURLConnection httpURLConnection = PowerMockito.mock(HttpURLConnection.class);
    final Method getContentLengthLongMethod =
        DTUMemberMatcher.method(HttpURLConnection.class, "getContentLengthLong");
    PowerMockito.doReturn(-4_611_686_018_427_387_905L)
        .when(httpURLConnection, getContentLengthLongMethod)
        .withNoArguments();
    final Method getResponseCodeMethod =
        DTUMemberMatcher.method(HttpURLConnection.class, "getResponseCode");
    PowerMockito.doReturn(200).when(httpURLConnection, getResponseCodeMethod).withNoArguments();
    final Method openConnectionMethod = DTUMemberMatcher.method(URL.class, "openConnection");
    PowerMockito.doReturn(httpURLConnection).when(uRL, openConnectionMethod).withNoArguments();
    PowerMockito.whenNew(URL.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(uRL);

    // Act
    final long actual = HttpClientUtil.getContentLength(fileUrl, headers, dfdaemon);

    // Assert result
    Assert.assertEquals(-4_611_686_018_427_387_905L, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({URL.class, Logger.class, HttpClientUtil.class})
  @Test
  public void getContentLengthInputNotNullNullFalseOutputNegative()
      throws UrlNotReachableException, AuthenticationRequiredException, Exception,
             MalformedURLException {

    // Arrange
    final String fileUrl = "?";
    final String[] headers = null;
    final boolean dfdaemon = false;
    final URL uRL = PowerMockito.mock(URL.class);
    final Method getProtocolMethod = DTUMemberMatcher.method(URL.class, "getProtocol");
    ((PowerMockitoStubber)PowerMockito.doReturn(null).doReturn(null))
        .when(uRL, getProtocolMethod)
        .withNoArguments();
    PowerMockito.whenNew(URL.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(uRL);

    // Act
    final long actual = HttpClientUtil.getContentLength(fileUrl, headers, dfdaemon);

    // Assert result
    Assert.assertEquals(-1L, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({HttpURLConnection.class, HttpClientUtil.class})
  @Test
  public void getContentLengthInputNotNullNullFalseOutputNullPointerException()
      throws UrlNotReachableException, AuthenticationRequiredException, Exception,
             MalformedURLException {

    // Setup mocks
    PowerMockito.mockStatic(HttpClientUtil.class);

    // Arrange
    final String fileUrl = "?";
    final String[] headers = null;
    final boolean dfdaemon = false;
    final URL uRL = PowerMockito.mock(URL.class);
    PowerMockito.whenNew(URL.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(uRL);
    final HttpURLConnection httpURLConnection = PowerMockito.mock(HttpURLConnection.class);
    final Method getResponseCodeMethod =
        DTUMemberMatcher.method(HttpURLConnection.class, "getResponseCode");
    PowerMockito.doReturn(401).when(httpURLConnection, getResponseCodeMethod).withNoArguments();
    PowerMockito.when(HttpClientUtil.openConnection(or(isA(URL.class), isNull(URL.class))))
        .thenReturn(httpURLConnection)
        .thenReturn(null);

    // Act
    thrown.expect(NullPointerException.class);
    HttpClientUtil.getContentLength(fileUrl, headers, dfdaemon);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({HttpURLConnection.class, HttpClientUtil.class})
  @Test
  public void getContentLengthInputNotNullNullFalseOutputNullPointerException2()
      throws UrlNotReachableException, AuthenticationRequiredException, Exception,
             MalformedURLException {

    // Setup mocks
    PowerMockito.mockStatic(HttpClientUtil.class);

    // Arrange
    final String fileUrl = "?";
    final String[] headers = null;
    final boolean dfdaemon = false;
    final URL uRL = PowerMockito.mock(URL.class);
    PowerMockito.whenNew(URL.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(uRL);
    final HttpURLConnection httpURLConnection1 = PowerMockito.mock(HttpURLConnection.class);
    final Method getResponseCodeMethod1 =
        DTUMemberMatcher.method(HttpURLConnection.class, "getResponseCode");
    PowerMockito.doReturn(401).when(httpURLConnection1, getResponseCodeMethod1).withNoArguments();
    final HttpURLConnection httpURLConnection = PowerMockito.mock(HttpURLConnection.class);
    final Method getResponseCodeMethod =
        DTUMemberMatcher.method(HttpURLConnection.class, "getResponseCode");
    PowerMockito.doReturn(401).when(httpURLConnection, getResponseCodeMethod).withNoArguments();
    PowerMockito.when(HttpClientUtil.openConnection(or(isA(URL.class), isNull(URL.class))))
        .thenReturn(httpURLConnection)
        .thenReturn(httpURLConnection1);

    // Act
    thrown.expect(NullPointerException.class);
    HttpClientUtil.getContentLength(fileUrl, headers, dfdaemon);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({HttpURLConnection.class, URL.class, HttpClientUtil.class})
  @Test
  public void getContentLengthInputNotNullNullTrueOutputAuthenticationRequiredException()
      throws UrlNotReachableException, AuthenticationRequiredException, Exception,
             MalformedURLException {

    // Arrange
    final String fileUrl = "?";
    final String[] headers = null;
    final boolean dfdaemon = true;
    final URL uRL = PowerMockito.mock(URL.class);
    final Method getProtocolMethod = DTUMemberMatcher.method(URL.class, "getProtocol");
    PowerMockito.doReturn("?").when(uRL, getProtocolMethod).withNoArguments();
    final HttpURLConnection httpURLConnection = PowerMockito.mock(HttpURLConnection.class);
    final Method getResponseCodeMethod =
        DTUMemberMatcher.method(HttpURLConnection.class, "getResponseCode");
    PowerMockito.doReturn(401).when(httpURLConnection, getResponseCodeMethod).withNoArguments();
    final Method openConnectionMethod = DTUMemberMatcher.method(URL.class, "openConnection");
    PowerMockito.doReturn(httpURLConnection).when(uRL, openConnectionMethod).withNoArguments();
    PowerMockito.whenNew(URL.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(uRL);

    // Act
    thrown.expect(AuthenticationRequiredException.class);
    HttpClientUtil.getContentLength(fileUrl, headers, dfdaemon);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void isExpiredInputNotNullNegative0OutputTrue() throws MalformedURLException {

    // Arrange
    final String[] headers = {};

    // Act and Assert result
    Assert.assertTrue(HttpClientUtil.isExpired("0", -9_223_372_036_854_775_806L, headers));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({HttpURLConnection.class, URL.class, HttpClientUtil.class})
  @Test
  public void isExpiredInputNotNullPositive0OutputFalse() throws Exception, MalformedURLException {

    // Arrange
    final String fileUrl = "0";
    final long lastModified = 1L;
    final String[] headers = {};
    final URL uRL = PowerMockito.mock(URL.class);
    final Method getProtocolMethod = DTUMemberMatcher.method(URL.class, "getProtocol");
    PowerMockito.doReturn("").when(uRL, getProtocolMethod).withNoArguments();
    final HttpURLConnection httpURLConnection = PowerMockito.mock(HttpURLConnection.class);
    final Method getResponseCodeMethod =
        DTUMemberMatcher.method(HttpURLConnection.class, "getResponseCode");
    PowerMockito.doReturn(304).when(httpURLConnection, getResponseCodeMethod).withNoArguments();
    final Method openConnectionMethod = DTUMemberMatcher.method(URL.class, "openConnection");
    PowerMockito.doReturn(httpURLConnection).when(uRL, openConnectionMethod).withNoArguments();
    PowerMockito.whenNew(URL.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(uRL);

    // Act
    final boolean actual = HttpClientUtil.isExpired(fileUrl, lastModified, headers);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({HttpsURLConnection.class, HttpClientUtil.class, URL.class,
                   HttpURLConnection.class, SSLContext.class})
  @Test
  public void
  isExpiredInputNotNullPositive0OutputFalse2()
      throws InvocationTargetException, Exception, MalformedURLException {

    // Setup mocks
    PowerMockito.mockStatic(SSLContext.class);

    // Arrange
    final String fileUrl = "";
    final long lastModified = 16L;
    final String[] headers = {};
    final SecureRandom secureRandom = PowerMockito.mock(SecureRandom.class);
    PowerMockito.whenNew(SecureRandom.class).withNoArguments().thenReturn(secureRandom);
    final URL uRL = PowerMockito.mock(URL.class);
    final Method getProtocolMethod = DTUMemberMatcher.method(URL.class, "getProtocol");
    PowerMockito.doReturn("httpS").when(uRL, getProtocolMethod).withNoArguments();
    final HttpsURLConnection httpsURLConnection = PowerMockito.mock(HttpsURLConnection.class);
    final Method getResponseCodeMethod =
        DTUMemberMatcher.method(HttpURLConnection.class, "getResponseCode");
    PowerMockito.doReturn(304).when(httpsURLConnection, getResponseCodeMethod).withNoArguments();
    final Method openConnectionMethod = DTUMemberMatcher.method(URL.class, "openConnection");
    PowerMockito.doReturn(httpsURLConnection).when(uRL, openConnectionMethod).withNoArguments();
    PowerMockito.whenNew(URL.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(uRL);
    final SSLContext sSLContext = PowerMockito.mock(SSLContext.class);
    final SSLSocketFactory sSLSocketFactory =
        (SSLSocketFactory)Reflector.getInstance("javax.net.ssl.SSLSocketFactory");
    final Method getSocketFactoryMethod =
        DTUMemberMatcher.method(SSLContext.class, "getSocketFactory");
    PowerMockito.doReturn(sSLSocketFactory)
        .when(sSLContext, getSocketFactoryMethod)
        .withNoArguments();
    final Method getInstanceMethod =
        DTUMemberMatcher.method(SSLContext.class, "getInstance", String.class);
    PowerMockito.doReturn(sSLContext)
        .when(SSLContext.class, getInstanceMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));

    // Act
    final boolean actual = HttpClientUtil.isExpired(fileUrl, lastModified, headers);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({HttpsURLConnection.class, HttpClientUtil.class, URL.class,
                   HttpURLConnection.class, SSLContext.class})
  @Test
  public void
  isExpiredInputNotNullPositive0OutputTrue()
      throws InvocationTargetException, Exception, MalformedURLException {

    // Setup mocks
    PowerMockito.mockStatic(SSLContext.class);

    // Arrange
    final String fileUrl = "";
    final long lastModified = 4L;
    final String[] headers = {};
    final SecureRandom secureRandom = PowerMockito.mock(SecureRandom.class);
    PowerMockito.whenNew(SecureRandom.class).withNoArguments().thenReturn(secureRandom);
    final URL uRL = PowerMockito.mock(URL.class);
    final Method getProtocolMethod = DTUMemberMatcher.method(URL.class, "getProtocol");
    PowerMockito.doReturn("httpS").when(uRL, getProtocolMethod).withNoArguments();
    final HttpsURLConnection httpsURLConnection = PowerMockito.mock(HttpsURLConnection.class);
    final Method getResponseCodeMethod =
        DTUMemberMatcher.method(HttpURLConnection.class, "getResponseCode");
    PowerMockito.doReturn(0).when(httpsURLConnection, getResponseCodeMethod).withNoArguments();
    final Method openConnectionMethod = DTUMemberMatcher.method(URL.class, "openConnection");
    PowerMockito.doReturn(httpsURLConnection).when(uRL, openConnectionMethod).withNoArguments();
    PowerMockito.whenNew(URL.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(uRL);
    final SSLContext sSLContext = PowerMockito.mock(SSLContext.class);
    final SSLSocketFactory sSLSocketFactory =
        (SSLSocketFactory)Reflector.getInstance("javax.net.ssl.SSLSocketFactory");
    final Method getSocketFactoryMethod =
        DTUMemberMatcher.method(SSLContext.class, "getSocketFactory");
    PowerMockito.doReturn(sSLSocketFactory)
        .when(sSLContext, getSocketFactoryMethod)
        .withNoArguments();
    final Method getInstanceMethod =
        DTUMemberMatcher.method(SSLContext.class, "getInstance", String.class);
    PowerMockito.doReturn(sSLContext)
        .when(SSLContext.class, getInstanceMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));

    // Act
    final boolean actual = HttpClientUtil.isExpired(fileUrl, lastModified, headers);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(HttpClientUtil.class)
  @Test
  public void isExpiredInputNotNullPositiveNullOutputNullPointerException()
      throws Exception, MalformedURLException {

    // Setup mocks
    PowerMockito.mockStatic(HttpClientUtil.class);

    // Arrange
    final String fileUrl = "?";
    final long lastModified = 1L;
    final String[] headers = null;
    final URL uRL = PowerMockito.mock(URL.class);
    PowerMockito.whenNew(URL.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(uRL);
    PowerMockito.when(HttpClientUtil.openConnection(or(isA(URL.class), isNull(URL.class))))
        .thenReturn(null);

    // Act
    thrown.expect(NullPointerException.class);
    HttpClientUtil.isExpired(fileUrl, lastModified, headers);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({URL.class, Logger.class, HttpClientUtil.class})
  @Test
  public void isExpiredInputNotNullPositiveNullOutputTrue()
      throws Exception, MalformedURLException {

    // Arrange
    final String fileUrl = "?";
    final long lastModified = 1L;
    final String[] headers = null;
    final URL uRL = PowerMockito.mock(URL.class);
    final Method getProtocolMethod = DTUMemberMatcher.method(URL.class, "getProtocol");
    ((PowerMockitoStubber)PowerMockito.doReturn(null).doReturn(null))
        .when(uRL, getProtocolMethod)
        .withNoArguments();
    PowerMockito.whenNew(URL.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(uRL);

    // Act
    final boolean actual = HttpClientUtil.isExpired(fileUrl, lastModified, headers);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({HttpURLConnection.class, URL.class, HttpClientUtil.class})
  @Test
  public void isSupportRangeInputNotNull0OutputFalse() throws Exception, MalformedURLException {

    // Setup mocks
    PowerMockito.mockStatic(HttpURLConnection.class);

    // Arrange
    final String fileUrl = "";
    final String[] headers = {};
    final URL uRL = PowerMockito.mock(URL.class);
    final Method getProtocolMethod = DTUMemberMatcher.method(URL.class, "getProtocol");
    PowerMockito.doReturn("hT").when(uRL, getProtocolMethod).withNoArguments();
    final HttpURLConnection httpURLConnection = PowerMockito.mock(HttpURLConnection.class);
    final Method getResponseCodeMethod =
        DTUMemberMatcher.method(HttpURLConnection.class, "getResponseCode");
    PowerMockito.doReturn(0).when(httpURLConnection, getResponseCodeMethod).withNoArguments();
    final Method openConnectionMethod = DTUMemberMatcher.method(URL.class, "openConnection");
    PowerMockito.doReturn(httpURLConnection).when(uRL, openConnectionMethod).withNoArguments();
    PowerMockito.whenNew(URL.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(uRL);

    // Act
    final boolean actual = HttpClientUtil.isSupportRange(fileUrl, headers);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({HttpURLConnection.class, URL.class, StringUtils.class, HttpClientUtil.class})
  @Test
  public void isSupportRangeInputNotNull0OutputFalse2() throws Exception, MalformedURLException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);
    PowerMockito.mockStatic(HttpURLConnection.class);

    // Arrange
    final String fileUrl = "";
    final String[] headers = {};
    final URL uRL = PowerMockito.mock(URL.class);
    final Method getProtocolMethod = DTUMemberMatcher.method(URL.class, "getProtocol");
    PowerMockito.doReturn("\"\"\"\"\"@").when(uRL, getProtocolMethod).withNoArguments();
    final HttpURLConnection httpURLConnection = PowerMockito.mock(HttpURLConnection.class);
    final Method getResponseCodeMethod =
        DTUMemberMatcher.method(HttpURLConnection.class, "getResponseCode");
    PowerMockito.doReturn(301).when(httpURLConnection, getResponseCodeMethod).withNoArguments();
    final Method getHeaderFieldMethod =
        DTUMemberMatcher.method(HttpURLConnection.class, "getHeaderField", String.class);
    PowerMockito.doReturn("")
        .when(httpURLConnection, getHeaderFieldMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method openConnectionMethod = DTUMemberMatcher.method(URL.class, "openConnection");
    PowerMockito.doReturn(httpURLConnection).when(uRL, openConnectionMethod).withNoArguments();
    PowerMockito.whenNew(URL.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(uRL);
    final Method isNotBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isNotBlank", CharSequence.class);
    PowerMockito.doReturn(false)
        .when(StringUtils.class, isNotBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = HttpClientUtil.isSupportRange(fileUrl, headers);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({HttpURLConnection.class, URL.class, HttpClientUtil.class})
  @Test
  public void isSupportRangeInputNotNull0OutputTrue() throws Exception, MalformedURLException {

    // Setup mocks
    PowerMockito.mockStatic(HttpURLConnection.class);

    // Arrange
    final String fileUrl = "     ";
    final String[] headers = {};
    final URL uRL = PowerMockito.mock(URL.class);
    final Method getProtocolMethod = DTUMemberMatcher.method(URL.class, "getProtocol");
    PowerMockito.doReturn("H").when(uRL, getProtocolMethod).withNoArguments();
    final HttpURLConnection httpURLConnection = PowerMockito.mock(HttpURLConnection.class);
    final Method getResponseCodeMethod =
        DTUMemberMatcher.method(HttpURLConnection.class, "getResponseCode");
    PowerMockito.doReturn(206).when(httpURLConnection, getResponseCodeMethod).withNoArguments();
    final Method openConnectionMethod = DTUMemberMatcher.method(URL.class, "openConnection");
    PowerMockito.doReturn(httpURLConnection).when(uRL, openConnectionMethod).withNoArguments();
    PowerMockito.whenNew(URL.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(uRL);

    // Act
    final boolean actual = HttpClientUtil.isSupportRange(fileUrl, headers);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({URL.class, Logger.class, HttpClientUtil.class})
  @Test
  public void isSupportRangeInputNotNullNullOutputFalse() throws Exception, MalformedURLException {

    // Arrange
    final String fileUrl = "?";
    final String[] headers = null;
    final URL uRL = PowerMockito.mock(URL.class);
    final Method getProtocolMethod = DTUMemberMatcher.method(URL.class, "getProtocol");
    ((PowerMockitoStubber)PowerMockito.doReturn(null).doReturn(null))
        .when(uRL, getProtocolMethod)
        .withNoArguments();
    PowerMockito.whenNew(URL.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(uRL);

    // Act
    final boolean actual = HttpClientUtil.isSupportRange(fileUrl, headers);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(HttpClientUtil.class)
  @Test
  public void isSupportRangeInputNotNullNullOutputNullPointerException()
      throws Exception, MalformedURLException {

    // Setup mocks
    PowerMockito.mockStatic(HttpClientUtil.class);

    // Arrange
    final String fileUrl = "?";
    final String[] headers = null;
    final URL uRL = PowerMockito.mock(URL.class);
    PowerMockito.whenNew(URL.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(uRL);
    PowerMockito.when(HttpClientUtil.openConnection(or(isA(URL.class), isNull(URL.class))))
        .thenReturn(null);

    // Act
    thrown.expect(NullPointerException.class);
    HttpClientUtil.isSupportRange(fileUrl, headers);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({HttpClientUtil.class, HttpURLConnection.class})
  @Test
  public void staticInitOutputVoid() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(HttpURLConnection.class);

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.alibaba.dragonfly.supernode.common.util.HttpClientUtil");

    // Assert side effects
    Assert.assertNotNull(Reflector.getInstanceField(HttpClientUtil.class, null, "logger"));
    final ArrayList<Integer> arrayList = new ArrayList<Integer>();
    arrayList.add(301);
    arrayList.add(302);
    arrayList.add(303);
    arrayList.add(307);
    Assert.assertEquals(arrayList, HttpClientUtil.REDIRECTED_CODE);
  }

  // Test written by Diffblue Cover.
  @Test
  public void verifyInputNotNullNullOutputTrue()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
    final Class<?> classUnderTest = Reflector.forName(
        "com.alibaba.dragonfly.supernode.common.util.HttpClientUtil$TrustAnyHostnameVerifier");
    final Method methodUnderTest =
        classUnderTest.getDeclaredMethod("verify", Reflector.forName("java.lang.String"),
                                         Reflector.forName("javax.net.ssl.SSLSession"));
    methodUnderTest.setAccessible(true);

    // Act
    final boolean actual = (boolean)methodUnderTest.invoke(null, "", null);

    // Assert result
    Assert.assertTrue(actual);
  }
}
