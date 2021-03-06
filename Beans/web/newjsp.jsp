<%@page import="com.rajeshpatkar.PiggyBank_1"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" 
              content="text/html; charset=UTF-8">
        <title>PiggyBank Client</title>
    </head>
    <body>
        <h1>PiggyBank Client</h1>
        <jsp:useBean id="pg1" 
                     class="com.rajeshpatkar.PiggyBank_1"/>
        <h2>Initial State</h2>
        <h3>Balance</h3>
        <jsp:getProperty name="pg1" property="balance"/>
        <h3>Last Transaction</h3>
        <jsp:getProperty name="pg1" property="lt"/>
        <jsp:setProperty name="pg1" 
                         property="deposit" value="100"/>
        <jsp:setProperty name="pg1" 
                         property="deposit" value="50"/>
        <jsp:setProperty name="pg1" 
                         property="withdraw" value="25"/>
        <h2>Final State</h2>
        <h3>Balance</h3>
        <jsp:getProperty name="pg1" property="balance"/>
        <h3>Last Transaction</h3>
        <jsp:getProperty name="pg1" property="lt"/>
    </body>
</html>