<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 22/02/2023
  Time: 4:24 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<div>
  <table style="margin: auto">
    <form action="/DictionaryAppController" method="post">
      <tr>
        <th colspan="2">
          <h1 style="color: white">DICTIONARY APP </h1>
        </th>
      </tr>
      <tr>
        <th><input type="text" placeholder="Input your word" name="word" value="${word}"></th>
        <th><input type="text" readonly placeholder="Result" value="${newWord}"></th>
      </tr>
      <tr>
        <th colspan="2">
          <button type="submit">
            Search
          </button>
        </th>
      </tr>
    </form>
  </table>
</div>

</body>
</html>