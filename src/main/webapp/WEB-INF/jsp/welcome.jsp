<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        <title>Hello World!</title>
    </head>
    <body>
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>${greeting}</h1>
                    <p>${tagline}</p>
                </div>
                <div>
                    <a href="products" style="text-align: center; background-color: aliceblue; display: inline-block; width: 200px; color: saddlebrown;">Produkty</a>
                    <a href="customers" style="text-align: center; background-color: aliceblue; display: inline-block; width: 200px; color: sandybrown">Klienci</a>
                </div>
            </div>
        </section>
    </body>
</html>