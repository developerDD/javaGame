public class HotKey {
    /**
     * Git commands:
     * git branch -vv  -посмотреть как у вас настроены ветки слежения
     * git clone <url> -клонирует удалённый репозиторий
     * git remote -  просмотреть список настроенных удалённых репозиториев
     *      указать ключ -v, чтобы просмотреть адреса для чтения и записи, привязанные к репозиторию:
     * git commit -a -m'messedge'; - добавление в стейдж эриа и сразуже комит меседж
     * git commit --amend; - исправить коммит который еще не за пушили
     * git restore <file>; - что бы удалить с индыксации файл
     * git log --oneline --decorate --graph --all; - для отображения истории коммитов
     * git checkout -b название ветки; - создать и сразу перейти в ветку
     * git branch -d (название ветки) - удаления ветки
     * git checkout название ветки; - переход на указаную ветку
     * git merge название ветки; - слитяние ветки где находишся и ветки которую указал
     * git diff используется для вычисления разницы между любыми двумя Git деревьями (ветками)
     *
     * Редактирование:
     *
     * Shift + Enter Создание новой строки (где бы не находился курсор) с переходм каретки в начало
     * Ctr + Z	Undo, отменить последнее действие
     * Ctr + Shift + Z	Redo, отменить последнюю отмену действия
     * Ctr + Shift + V	Расширенная вставка из буфера обмена (с историей)
     * Ctr (+ Shift) + W	Инкрементальное выделение выражения
     * Ctr + W Выдиление полного слова где стоит курсор (выдиление текста с помощью синтатксиса)
     * Ctr + влево/вправо	Перемещение между словами
     * Ctr + вверх/вниз	Прокрутка кода без изменения позиции курсора
     * Ctr + Home/End	Переход в начало/конец файла
     * Shift + Del (Ctr + Y)	Удаление строки, отличие в том, где потом окажется курсор
     * Ctr + Del	Удалить от текущей позиции до конца слова
     * Ctr + Backspace	Удалить от текущей позиции до начала слова
     * Ctr + D	Дублировать текущую строку
     * Tab / Shift + Tab	Увеличить / уменьшить текущий отступ
     * Ctr + Alt + I	Выравнивание отступов в коде
     * Ctr + Alt + L	Приведение кода в соответствие code style
     * Ctr + /	Закомментировать/раскомментировать текущую строку
     * Ctr + Shift + /	Закомментировать/раскомментировать выделенный код
     * Ctr + -/+	Фолдинг, свернуть/развернуть
     * Ctr + Shift + -/+	Фолдинг, свернуть/развернуть все
     * Ctr + Shift + .	Сделать текущий скоуп сворачиваемым и свернуть его
     * Ctr + .	Сделать текущий скоуп несворачиваемым
     * Ctr + R	Замена в тексте
     * Ctr + Shift + R	Замена во всех файлах
     *
     *
     * Окна, вкладки:
     *
     * Alt + влево/вправо	Перемещение между вкладками
     * Ctr + F4	Закрыть вкладку
     * Alt + циферка	Открытие/закрытие окон Project, Structure, Changes и тд
     * Ctr + Tab	Switcher, переключение между вкладками и окнами
     * Shift + Esc	Закрыть активное окно
     * F12	Открыть последнее закрытое окно
     * Ctr + колесико	Zoom, если он был вами настроен
     *
     *
     * Закладки:
     *
     * F11	Поставить или снять закладку
     * Ctr + F11	Аналогично с присвоением буквы или цифры
     * Shift + F11	Переход к закладке (удаление — клавишей Delete)
     * Ctr + Число	Быстрый переход к закладке с присвоенным числом
     *
     *
     * Подсказки и документация:
     *
     * Ctr + Q	Документация к тому, на чем сейчас курсор
     * Ctr + Shift + I	Показать реализацию метода или класса
     * Alt + Q	Отобразить имя класса или метода, в котором мы находимся
     * Ctr + P	Подсказка по аргументам метода
     * Ctr + F1	Показать описание ошибки или варнинга
     * Alt + Enter	Показать, что нам предлагают «лампочки»
     *
     *
     * Поиск:
     *
     * Дважды Shift	Быстрый поиск по всему проекту
     * Ctr + Shift + A	Быстрый поиск по настройкам, действиям и тд
     * Alt + вниз/вверх	Перейти к следующему/предыдущему методу
     * Ctr + [ и Ctr + ]	Перемещение к началу и концу текущего скоупа
     * Ctr + F	Поиск в файле
     * Ctr + Shift + F	Поиск по всем файлам (переход — F4)
     * Ctr + F3	Искать слово под курсором
     * F3 / Shift + F3	Искать вперед/назад
     * Ctr + G	Переход к строке или строке:номеру_символа
     * Ctr + F12	Список методов с переходом к их объявлению
     * Ctr + E	Список недавно открытых файлов с переходом к ним
     * Ctr + Shift + E	Список недавно измененных файлов с переходом к ним
     * Ctr + H	Иерархия наследования текущего класса и переход по ней
     * Ctr + Alt + H	Иерархия вызовов выбранного метода
     * Ctr + N	Поиска класса по имени и переход к нему
     * Ctr + Shift + N	Поиск файла по имени и переход к нему
     * Ctr + B	Перейти к объявлению переменной, класса, метода
     * Ctr + Alt + B	Перейти к реализации
     * Ctr + Shift + B	Определить тип и перейти к его реализации
     * Shift + Alt + влево	Перемещение назад по стеку поиска
     * Shift + Alt + вправо	Перемещение вперед по стеку поиска
     * F2 / Shift + F2	Переход к следующей / предыдущей ошибке
     * Shift + Alt + 7	Найти все места, где используется метод / переменная
     * Ctr + Alt + 7	Как предыдущий пункт, только во всплывающем окне
     *
     *
     * Генерация кода и рефакторинг:
     *
     * Ctr + Space	Полный автокомплит
     * Ctr + Shift + Space	Автокомплит с фильтрацией по подходящему типу
     * Alt + /	Простой автокомплит по словам, встречающимся в проекте
     * Ctr + I	Реализовать интерфейс
     * Ctr + O	Переопределить метод родительского класса
     * !!!Ctr + J	Генерация шаблонного кода (обход по итератору и тд)
     * Ctr + Alt + J	Обернуть выделенный код в один из шаблонов
     * Alt + Insert	Генератор кода — сеттеров, зависимостей в pom.xml и тд
     * Shift + F6	Переименование переменной, класса и тд во всем коде
     * !!!Ctr + F6	Изменение сигнатуры метода во всем коде(перенос, смена параметров метода)
     * F6	Перемещение метода, класса или пакета
     * F5	Создать копию класса, файла или каталога
     * Shift + F5	Создать копию класса в том же пакете
     * Alt + Delete	Безопасное удаление класса, метода или атрибута
     * !!!Ctr + Alt + M	Выделение метода (создание нового метода и пепенос его отдельно)
     * Ctr + Alt + V	Выделение переменной
     * !!!Ctr + Alt + V	Установит возвращающий тип и назевет переменную из лямда выражений
     * Ctr + Alt + F	Выделение атрибута
     * Ctr + Alt + C	Выделение константы (public final static)
     * Ctr + Alt + P	Выделение аргумента метода
     * Ctr + Alt + N	Инлайнинг метода, переменной, аргумента или константы
     * Ctr + Alt + O	Оптимизация импортов
     *
     *
     * Прочее:
     *
     * Ctr + ~	Быстрое переключение цветовой схемы, code style и тд
     * Alt + F12	Открыть/закрыть терминал
     * F10	Запустить последнюю запущенную программу или тест
     * Shift + F10	Запустить открытую в редакторе программу или тест
     * Shift + Alt + F10	Запустить что-то из списка того что запускалось раньше
     * Ctr + F2	Остановить программу
     * Ctr + Alt + A	Добавить в систему контроля версий
     * Ctr + K	Сделать коммит в систему контроля версий
     * Ctr + Shift + K	Сделать пуш в систему контроля версий
     * Ctr + Shift + P	В Scala-плагине определяет implicit параметры
     * Ctr + Shift + Q	В Scala-плагине определяет implicit преобразования
     *
     */
}
