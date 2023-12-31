# javacoursework
Java Course Group Work

Назва проєкту: JavaCourseWork

Опис: Цей проєкт розробляється для курсової роботи з предмету "Програмування на Java". Основна мета проєкту - створити веб-додаток на базі Spring Boot із можливістю взаємодії з базою даних та реалізацією операцій CRUD (Create, Read, Update, Delete) для обраних сутностей.

Технології та інструменти:

    Java: Основна мова програмування проєкту.
    Spring Boot: Використовується для створення веб-додатка та реалізації бізнес-логіки.
    Spring Data JPA: Використовується для спрощення взаємодії із базою даних.
    Maven: Використовується для керування залежностями та збирання проєкту.
    MSSQL: Використовується як система керування базами даних.
    Spring Security (опціонально): Додається для реалізації автентифікації та авторизації користувачів.
    Thymeleaf (опціонально): Використовується як шаблонний двигун для створення веб-сторінок.

Компоненти проєкту:

    Entity (Сутність): Створюються Java-класи для представлення даних у базі даних, такі як "MyEntity." Використовуються анотації JPA для мапінгу сутностей на таблиці в базі даних.

    Repository (Репозиторій): Створюється інтерфейс "MyEntityRepository," який розширює JpaRepository для взаємодії з базою даних. Надає CRUD-операції для сутностей.

    Service (Сервіс): Реалізується сервісний шар ("MyEntityService"), де додаються методи для виконання бізнес-логіки. Цей шар взаємодіє з репозиторієм для доступу до даних.

    Controller (Контролер): Створюється контролер ("MyEntityController") для надання HTTP-ендпоінтів для операцій CRUD. Контролер обробляє HTTP-запити, викликає відповідні методи сервісу та повертає дані у відповідному форматі.

    Тести: Розробляються юніт-тести для перевірки функціональності проєкту.

Запуск проєкту:

    Проєкт запускається з використанням вбудованого сервера, надається можливість тестувати його операції за допомогою Postman або аналогічних інструментів для взаємодії з REST API.

Додатково (опціонально):

    До проєкту може бути додана Spring Security для захисту REST-ресурсів та реалізації автентифікації та авторизації користувачів.

Цей проєкт надає зручний спосіб розробити веб-додаток на Java з використанням популярних технологій і бібліотек для роботи із базою даних та веб-сервісами.
