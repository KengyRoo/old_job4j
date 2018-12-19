package ru.job4j.condition;

/**
 * @author Aleksandr Kostyuk (mailto;KengyRoo@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class DummyBot {
    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Спросиие другой вопрос.";
        if ("Привет,Бот".equals(question)) {
            rsl = "Привет, умник";
        } else if ("Пока".equals(question)) {
            rsl = "До скорой встречи";
        }
        return rsl;
    }
}

