## Установка Git и Visual Studio Code

Установка Git для Windows, MAC, Linux: https://git-scm.com/downloads

Установка VSCode для Windows, MAC, Linux: https://code.visualstudio.com/Download

При первом использовании Git необходимо представиться.

Для этого нужно ввести в терминале 2 команды:
```cs

git config --global user.name «Ваше имя английскими буквами» git 

config --global user.email ваша почта@example.com
```


## Основные команды Git

* git init – инициализация локального репозитория
* git status – получить информацию от git о его текущем состоянии
* git add – добавить файл или файлы к следующему коммиту
* git commit -m “message” – создание коммита.
* git log – вывод на экран истории всех коммитов с их хеш-кодами
* git checkout – переход от одного коммита к другому
* git checkout master – вернуться к актуальному состоянию и продолжить работу
* git diff – увидеть разницу между текущим файлом и закоммиченным файлом
* git commit --amend -m “message” – изменение последнего коммита
* mkdir названиепапки – создание новой директории
* history – все введенные когда-либо в терминал команды

# Синтаксис языка Markdown

Справочник по Markdown от Microsoft:
https://docs.microsoft.com/ru-ru/contribute/markdown-reference

1. # Заголовок – выделение заголовков. Количество символов “#” задаёт уровень заголовка (поддерживается 6 уровней).

2. = или - – подчёркиванием этими символами (не менее 3 подряд) выделяют заголовки
первого (“=”) и второго (“-”) уровней.

3. ** **Полужирное начертание** ** или __ __Полужирное начертание__ __

4. **Курсивное начертание* * или _ _Курсивное начертание_ _

5. ~~ ~~Зачёркнутый текст~~ ~~

6. * *Строка – ненумерованные списки, символ “ * ” в начале строки


7. 1, 2, 3 … – нумерованные списки


# Создание руководства по языку разметки MarkDawn

## Создание заголовков 




## Добавление изображений 






## Добавлекние исходного кода

В чистом Маркдауне блоки кода отбиваются 4 пробелами в начале каждой строки.

Но в GitHub-Flavored Markdown (сокращенно GFM) есть более удобный способ: ставим по три апострофа (на букве Ё) до и после кода. Также можно указать язык исходного кода.

```html
<nav class="nav nav-primary">
  <ul>
    <li class="tab-conversation active">
      <a href="#" data-role="post-count" class="publisher-nav-color" data-nav="conversation">
        <span class="comment-count">0 комментариев</span>
        <span class="comment-count-placeholder">Комментарии</span>
      </a>
    </li>
    <li class="dropdown user-menu" data-role="logout">
      <a href="#" class="dropdown-toggle" data-toggle="dropdown">
        <span class="dropdown-toggle-wrapper">
          <span>
            Войти
          </span>
        </span>
        <span class="caret"></span>
      </a>
    </li>
  </ul>
</nav>
```

Самое приятное, что в коде не нужно заменять угловые скобки `< >` и амперсанд `&` на их html-сущности.






# Добавление таблиц 





