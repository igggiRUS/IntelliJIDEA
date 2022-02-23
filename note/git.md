
```console
ll ~/.ssh/
```
Проверить наличие файлов git pub
ls ll два похожих оператора но ll дает полную инфу

```console
remove file.pub
rm file.pub
```
удалить файл file.pub

###### при переходах из папки в папку надо писать в том регистре в котором название папки

```console
cd Documents\git
```
создать ssh ключ

```console
cd ~/.ssh/
ssh-keygen
```
в первой строке можем указать что хотим

```console
Enter file in which to save the key (/home/mike/.ssh/id_rsa): linuxobsidian
```


```console
cat linuxobsidian.pub
```
открываем файл и копируем хеш в браузер

github-->settings-->ssh-->

```console
git clone git@github.com:igggiRUS/obsidian.md.git
```
Делаем нужные подтверждения и все файлы клонируются на диск

```console
git log --oneline 
```
сокращенные коммиты в 1 строку удобно смотреть

```console
git diff
```
смотреть разницу дифференциал

-- покажет  коммит с меткой в скобках --all показывает логи всего
git log --oneline --all
-- слово HEAD показывает место где мы находимся

-- показывает графическое отображение коммитов
git log --all --graph






[git](https://www.youtube.com/channel/UC2Ev-rDSHBov0ZMChesLfrg)
[github](https://www.youtube.com/channel/UCK5d3n3kfkzlArMccS0TTXA)


https://www.youtube.com/watch?v=GnK6rci9Nsc
15:11 логическую цепочку превращает в схему!!!

https://gist.github.com/Jekins/2bf2d0638163f1294637
Описание makdown на github

git status статусы файла
dir ls навигация используй tab
git add . добавить все файлы
git add -a  добавляет все файлы 
.gitignore создать файл со списоком игнора обозвать его .gitignore если надо заигнорить папку пишет /folder folder название папки
git clone создаем клон на новом компе
git commit создаем коммит для пуша на облако гита что бы понимать какие изменения делались
git push пушим файлы в облако гита если при пуше в консоли ошибка пишем 
**esc** клавиша потом :pw **enter**
git pull качаем с гита файлы которые кто то пушил


git init 
git add .
git commit -m 'comment to commit'
git remote add origin https://github.com/ivansamofal/test.git

git status

git config --global user.name "Ivan"
git config --global user.email "ivansamofal@gmail.com"


git config --global push.default simple
git push

git checkout 
git branch
git stash


Отменить последние изменения
```git
git chechout folder/file.txt
```
показывает логи пушей

```git 
git log 
```


Логи в одну строчку
```git
git log --oneline
```
Показывает логи с временем пуша
```git
git log --pretty=format:"%h - %an, %ar : %s"
```
НАДО ВВЕСТИ ХЕШ ФАЙЛА eaa5950 что бы откатить только этот файл
```git
git chechout eaa5950  folder/file.txt
```

# [[Видеокурс по Git]](https://htmlacademy.ru/blog/81-git-and-github-glossary)
Работать с кодом на интенсиве нужно в системе контроля версий Git. Вы будете отправлять свои задания на проверку и получать обновления. Чтобы общаться на одном языке загляните в словарь основных терминов  (репозиторий, коммит, ветка, пулреквест и другие).

Для погружения в работу с Git и GitHub мы записали серию видеороликов.

ssh




--------- 02 -- видео как сделать репозиторий

-- --global относится глобально ко всем гитам
git config --global user.name "Миша"
git config --list
-- данные хранятся в папке .gitconfig
cat ~/.gitconfig в файле настройки акканута

-- инициализация пустого репозитория
git init
-- показать все файлы в т.ч. скрытые
sl -1 -a 

-- показывает положение файлов
git status 
-- On branch master  (говорит о том что мы в мастер ветке)
-- untracked files  (не отслеживаемые файлы изменение которых не сохраняется) 

-- git add индексирует . точка означает всю папку
git add index.html

git commit -m "за коммитили (сделали название сейва)"


git diff -- отслеживает изменения + что добавилось - что убавилось

-- показывает историю коммитов
git log
-- закрыть лог
q
-- показывает коммит по хэшу
git show kqwlmfaspoduiasdyiqwjkemasndo


--------- 03 -- что делать если что то пошло не так

--откатить файл
git checkout css/main.css

 -- если файл удален
git status
git diff (видим что строки удалены)

-- комманда checkout возвращает последний только коммит откатится на еще более раннюю версию не получится
git checlout css/main.css 
-- убединмся что файл вернулся посмотрим внутренности файла
cat  css/main.css 

-- смотрим логи коммитов
git log
-- копируем хеш коммита
git checkout klxcpwemnrxpzc.,mnewrolsdfklwekl  css/button.css

-- посмотреть проиндексированные изменения флак --stage смотрит проиндексированные изменения 

git diff --stagged

-- закомитим изменения
git commit -m "вернули изменения по хешу"
-- проверим появился ли лог
git status

откатить одно не откатив другое

после индексации
git add .
-- откатываем файл ресетим файл хед он не откатится
git reset HEAD index.thml


-- как исправить коммиит месседж -1 показывает только последий коммит -2 два последних коммита

git log -1 
-- amend изменяет последний коммит
git commit --amend -m "правильное сообщение коммита"

-- смотрим последний коммит
git log -1 

-- убедимся в том что коммиты не дублируются
git log 

-- Удалить файл из коммита
git rm css/test.css


-- исключить файл из коммита но не удалять его
git rm -- cached css/test.css
git commit --amend --no--edit
git status

git help 
gti help checkout
git help commit


--------- 04 ветки branch
-- параметр ванлайн выводит каждый коммит в 1 строку удобно сокращенный вариант

git log --oneline 
-- посмотреть содержимое коммита код каммита (cxdpoewpsdsds32osdnawel)
-- параметр -p выводит данные в человеко читаемом виде
git cat-file -p cxdpoewpsdsds32osdnawel

-- то что вышло на экран и как это читать
==================
-- tree состояние файлов на момент коммита
tree  l;cxk,weasposlkdflawelsiodf
-- parent хеш родительского
parent kcxzm,wenaspodsajret
author Миша  1500160618 +300  -- вконце это время коммита
commiter кто сохранил коммит

-- перейти в определенный коммит
git log
-выбрал из списка хеш коммита и перешел туда
git checkout clxkmena

git log --oneline
-- указатели коммита "желтый дизайн"  хеш коммита куда переместимся (создалась новая ветка коммитов)
git checkout -b желтый дизайн skdnqwelaskasd

-- покажет  коммит с меткой в скобках --all показывает логи всего
git log --oneline --all
-- слово HEAD показывает место где мы находимся

-- показывает графическое отображение коммитов
git log --all --graph

-- Слияние веток
git status
-- on branch master -- говорит о том что мы находимся в ветке мастер
-- если мы стоим на мастре то конечная ветка будет мастер а другие ветки к ней присоеденятся
git merge yellow-design -m 'Объеденили желтый дизайн и мастер'
-- проверить гитлогом
git log

-- создаем новую ветку из текущего коммита
git checkout -b firefox-bug-fix
-- смотрим логи
git log -1 --oneline
-- вернемся в мастер и проверим коммит там
git checkout master
git log -1
-- перейдем в ветку файрфокс обратно
git chekout firefox-bug-fix
git log -1
-- мы увидел две ветки сореджат один коммит
--вермемся 
-- для изменения файла в консоли надо написать start [файл]

---------

05 Откуда берутся конфликты, и что с ними делать

git status
git merge page

--- both modified:  говорит о том что одни и теже строки в двух ветказ изменены и надо выбрать верные

<<<<<<<<<HEAD --в мастере была эта строка
Мы ничего не нашли

=============



## Я ничего не нашел

> page -- код ветки page
-- Что бы решить конфликт надо выбрать какой то из вариантов или оставить оба. И не забыть удалить разделители.

--  create repository
-- выбрать create or push или создание или заливку своего проекта
git remote add original

-- показывает какой репозиторий у нас есть и с каким адресом
git remote -v
--можем забирать изменения
origin  https://github.com/igggiRUS/github.git (fetch)
--можем оставлять изменения
origin  https://github.com/igggiRUS/github.git (push)
-- создаем папку  
mkdir /.ssh
-- заходим
cd ~/.ssh
-- сгенерируем ключи
ssh-keygen -t rsa -b 4096 -C "mike215misha@gmail.com"
-- публичный ключ pub надо загрузить на гитхаб
--gihub\profile\ssh gpg keys\ new ssh key

-- используем публичный ключ для ssh гидхаба
cat названиеключа.pub
-- проверим узнает ли нас теперь гид
ssh -T -i ~/.ssh/github-15-06-2009 git@github.com
-- попробуем не указывать ключ
ssh -T git@github.com
-- создаем в папке .ssh файл config
Host github.com
    IdentityFile ~/.ssh/github-15-06-2009

git push -u origin master


------------ 07 Как синхронизировать работу на двух компьютерах

git clone
git log --oneline
git remote -v 
-- отправить  измениния origin имя репозитория master имя ветки
git push origin master
-- исправили название ветки
git push origin cmmet:comments
-- удалить старую ветку
git push origin :cmmet
-- может переименовывать удалять ветки
git branch
-- получить из репозитория
git fetch

Надо на новом компе набрать в консоли 
ssh-keygen
-- после зайти в паблик и скопировать ключ внести его в в браузер
-- затем перейти в консоль и набрать git clone вместе со скопированной из гита строки git@github.com:igggiRUS/github.git
--
git clone git@github.com:igggiRUS/github.git
-- нажать энтер все подтвердить и скачается клон на комп



### Если редактировал и вдруг решил вернуть все до последнего коммита

посмотрет статус
```git
git status
```


```python
Misha@DESKTOP-2561A0B MINGW64 /d/google/IntelliJIDEA (master)
$ git status
On branch master
Your branch is up to date with 'origin/master'.

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        **modified:   VideoCourseOracle/src/Lesson05/Car2.java**

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        `VideoCourseOracle/.idea/vcs.xml`

no changes added to commit (use "git add" and/or "git commit -a")

Misha@DESKTOP-2561A0B MINGW64 /d/google/IntelliJIDEA (master)

```

```git
git diff
```

 Посмотреть разницу изменений

 откатить файл
 git c

 
