package com.example.patterns.Abstract;

public class Main {

    public static void main(String[] args) {
        String os = "Linux";

        GUIFactory guiFactory;
        if (os.equals("Linux")) {
            guiFactory = new LinuxFactory();
        } else {
            guiFactory = new WindowsFactory();
        }

        Button b = guiFactory.newButton();
        CheckBox c = guiFactory.newCheckbox();

        b.render();
        c.render();
    }
}

/*
    Створили інтерфейси для об'єктів. Вони повинні для створення методів,
    які в подальшому самі класи повинні реалізувати. А також, щоб один і
    той самий метод виконував різні дії в залежності від класу об'єкту.
    Це Button та Checkbox. Метод є render() який буде відображати ці елементи.

    Далі створюються певні класи:
    WindowsButton, WindowsCheckbox, LinuxButton, та LinuxCheckbox
    Коже з них реалізує цей метод render() відповідно до стилів відображення
    елементів на різних ОС.

    Визначаємо інтерфейс GUIFactory з методами newButton() та newCheckbox().
    Він визначає спосіб створення об'єктів Button та Checkbox. Але не конкретизує
    як саме вони будуть створені.

    Відповідно ми створюємо фабрики Windows- та LinuxFactory. І кожна з них
    реалізує методи newButton() та newCheckbox() повертаючи відповідні об'єкти
    до своєї ОС.

    Ну і на останок вибираємо яку фабрику треба використовувати на основі поточної ОС.
    Після вибору фабрики ми викликаємо методи створення об'єктів Button та Checkbox, а
    тоді вже методи render() щоб вони відображалися на екрані.

    Отже, метод абстрактної фабрики дозволяє забезпечити максимальну гнучкість
    у створенні сімейств пов'язаних об'єктів, уникнувши прямої залежності від
    конкретних класів. Він дозволяє легко змінювати поведінку програми, додаючи
    нові реалізації об'єктів без зміни вже наявного коду.
*/