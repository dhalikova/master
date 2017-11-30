<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Произведение чисел</title>
</head>
<body>
<!-- Yandex.Metrika informer -->
<a href="https://metrika.yandex.ru/stat/?id=46358004&amp;from=informer"
   target="_blank" rel="nofollow"><img src="https://informer.yandex.ru/informer/46358004/3_1_FFFFFFFF_EFEFEFFF_0_pageviews"
                                       style="width:88px; height:31px; border:0;" alt="Яндекс.Метрика" title="Яндекс.Метрика: данные за сегодня (просмотры, визиты и уникальные посетители)" class="ym-advanced-informer" data-cid="46358004" data-lang="ru" /></a>
<!-- /Yandex.Metrika informer -->

<!-- Yandex.Metrika counter -->
<script type="text/javascript" >
    (function (d, w, c) {
        (w[c] = w[c] || []).push(function() {
            try {
                w.yaCounter46358004 = new Ya.Metrika({
                    id:46358004,
                    clickmap:true,
                    trackLinks:true,
                    accurateTrackBounce:true
                });
            } catch(e) { }
        });

        var n = d.getElementsByTagName("script")[0],
                s = d.createElement("script"),
                f = function () { n.parentNode.insertBefore(s, n); };
        s.type = "text/javascript";
        s.async = true;
        s.src = "https://mc.yandex.ru/metrika/watch.js";

        if (w.opera == "[object Opera]") {
            d.addEventListener("DOMContentLoaded", f, false);
        } else { f(); }
    })(document, window, "yandex_metrika_callbacks");
</script>
<noscript><div><img src="https://mc.yandex.ru/watch/46358004" style="position:absolute; left:-9999px;" alt="" /></div></noscript>
<!-- /Yandex.Metrika counter -->

<CENTER>
    <br>
    <br>
    <br>
    <label>Введите данные и вычислите произведение</label>
    <br>
    <br>
    <label>Максимальное значение чисел:</label>
    <br>
    <label>1000000000000000</label>
    <br>
    <br>
    <!-- Объявляем форму в которой есть кнопка, при нажатии на которую будет
    отправлен запрос на урл / тип запроса - POST-->
    <form action="" method="post">
        <!--
        br - переход на новую строку
        font-size - размер шрифта
        <input type="number" - поле для ввода типа Число-->
        <label>Первое число:</label>
        <br>
        <input type="number" step="any" max="1000000000000000" min="-1000000000000000"
               value="${number_first}" name="number_first" style="height: 30px; width: 500px; font-size: 12pt" required/>
        <br>
        <br>
        <label>Второе число:</label>
        <br>
        <input type="number" step="any" max="1000000000000000" min="-1000000000000000"
               value="${number_second}" name="number_second" style="height: 30px; width: 500px; font-size: 12pt" required/>
        <br>
        <br>
        <!-- Кнопка Умножить-->
        <input type="submit" style="height: 30px; width: 160px; font-size: 12pt" value="Умножить"/>
        <br>
        <br>
        <label>Результат:</label>
        <br>
        <input type="text" value="${result}" name="result" style="height: 30px; width: 700px; font-size: 12pt"/>
    </form>
</CENTER>
</body>
</html>
