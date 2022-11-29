---
Приложение task_tracker. 
---
* Используется для контроля выполнения задач в течение дня.
---
Используемые технологии:
----
* Java 17
* Hibernate, PostgreSQL, Liquibase
* Maven
* Spring boot
* HTML, CSS, Bootstrap, Thymeleaf, JavaScript

---
Сборка
---
<ol>
    <li>
        Для успешной сборки и работы проекта на вашем компьютере должны быть установлены:
        <ol>
            <li>JDK 17(+)</li>
            <li>Maven</li>
            <li>PostgreSQL</li>
        </ol>
</li>
    <li>
        В PostgreSQL создайте базу с именем "todo_list"
    </li>
    <li>
        Скачайте проект к себе на компьютер с помощью команды<br>
        <code>git clone https://github.com/ShaidurovIlia/job4j_todo_list</code><br>
        Перейдите в корень проекта
    </li>
    <li>
        Добавьте настройки для доступа к базе данных, для этого внесите соответствующие изменения в файле 
        <code>src/main/resources/db.properties</code><br>
        и в файле конфигурации проекта <code>pom.xml</code>
</li>
    <li>
        Выполните команду <code>mvn install</code> в корне проекта для его сборки<br>
        Будет выполнена миграция БД с помощью Liquibase.<br>
    </li>
    <li>
        Команда для запуска из консоли <code>java -jar target/todo_list-1.0.jar</code> после чего перейдите по данной ссылке.<br>
        <a href="http://localhost:8080/index/">http://localhost:8080/index</a>
    </li>
</ol>


* Страница регистрации. Регистрация обязательная.
---
![](../../Users/Admin/Desktop/444.png)

* Страница входа.
---
![](../../Users/Admin/Desktop/333.png)

* Окно для добавления новой задачи.
---
![](../../Users/Admin/Desktop/111.png)

* Главная страница. Тут отображаются новые и выполнение задачи за последние сутки.
---
![](../../Users/Admin/Desktop/666.png)

* Нажав на задачу, можно установить ее статус или удалить.
---
![](../../Users/Admin/Desktop/555.png)

* Окно редактирования задачи.
---
![](../../Users/Admin/Desktop/777.png)

* Список всех задач. Их можно сортировать на (All, New, Done).
---
![](../../Users/Admin/Desktop/222.png)