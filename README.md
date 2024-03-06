
# S

### Single Responsibility Principle (Принцип единственной ответственности)

- Класс `User` отвечает только за данные пользователя и методы доступа к ним.
- Классы `Student` и `Teacher` отвечают за данные студента и преподавателя соответственно.
- Классы `StudentView` и `TeacherView` отвечают за конкретную задачу, за отображение данных
  студента и преподавателя на консоли.
- Класс `StudentGroupService` отвечает за работу с группой студентов, сортировку списка студентов
  по общему среднему баллу и по ФИО.
- Класс `TeacherService` отвечает за конкретную задачу, обработку данных учителя и их сортировку.
- Класс `TeacherList` представляет список учителей и содержит только методы для работы с этим списком
  (получение, установка, добавление учителя).
- Класс `StudentGroup` преставляет группу студентов и содержит только методы для работы с этим списком
  (получение, установка, добавление студента, вовращение итератора)
- Класс `UserComparator` отвечает за реализацию сравнения объектов типа `User` или его подтипов.
- Класс `StudentGroupIterator` отвечает за за управление и обработку группы студентов.

# O

### Open/Closed Principle (Принцип открытости/закрытости)

- Классы `Student`, `StudentGroup`, `StudentGroupService`, `StudentView`, `Teacher`, `TeacherList`, `TeacherService`,
  `TeacherView` могут быть расширены без изменения их исходного кода.
  Например, добавление новых методов или функциональности без изменения существующего кода.

# L

### Liskov Substitution Principle (Принцип подстановки Барбары Лисков)

- Классы `Student` и `Teacher` могут быть использованы вместо их родительского класса `User`
  без изменения поведения программы.

# I

### Interface Segregation Principle (Принцип разделения интерфейса)

- Интерфейс `UserView` определяет только один метод `sendOnConsole`, который отправляет данные на консоль.
  Это позволяет классам, реализующим этот интерфейс, использовать только необходимые им методы.

# D

### Dependency Inversion Principle (Принцип инверсии зависимостей)

- Классы `StudentGroupService` и `TeacherService` зависят от абстракций (`StudentGroup`, `TeacherList`),
  а не от конкретных реализаций. Это позволяет легко заменять
  или расширять реализации без изменения кода внедрения зависимостей.