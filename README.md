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
![444](https://user-images.githubusercontent.com/87298998/204645526-85d10283-a03b-41d9-bc94-4bb9d787829c.png)


* Страница входа.
---
![333](https://user-images.githubusercontent.com/87298998/204646676-b11625c2-2581-44b6-af3a-4652ab8365a0.png)

* Окно для добавления новой задачи.
---
![111](https://user-images.githubusercontent.com/87298998/204646766-df05f64e-e306-439f-ac3a-8ebd32cae3f6.png)

* Главная страница. Тут отображаются новые и выполнение задачи за последние сутки.
---
![666](https://user-images.githubusercontent.com/87298998/204646958-bf6d7fbb-7e64-4330-97fe-012735935fdc.png)

* Нажав на задачу, можно установить ее статус или удалить.
---
![555](https://user-images.githubusercontent.com/87298998/204647032-3084ddcb-6a9b-4c71-9ee6-ba0151a06d22.png)

* Окно редактирования задачи.
---
![777](https://user-images.githubusercontent.com/87298998/204647057-44cb93df-9e3b-4aa9-afb4-e0881720bb90.png)

* Список всех задач. Их можно сортировать на (All, New, Done).
---
![222](https://user-images.githubusercontent.com/87298998/204647126-27ed7832-cf79-43f1-abcd-b62f03c507c5.png)
