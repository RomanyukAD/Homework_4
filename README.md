

Объединяет:

1) ДЗ: ДЗ #4: Разворачивание и подключение Selenoid (директория webProject)
2) ДЗ: ДЗ #5: Мобильное тестирование (директория appiumProject)


1) Для разворачивания тестов на Selenoid были выполнены действия:
* в docker создан контейнер с браузером Chrome (файл во вложении)
* в cmd выполнена команда htpasswd -bc C:\Users\Romanyuk.AD\otus\practik\ggr\grid-router \users.htpasswd test test-password
* в cmd выполнена команда  ggr_windows_amd64.exe -guests-allowed  -guests-quota "test" -verbose –quotaDir C:\Users\Romanyuk.AD\otus\practik\ggr\grid-router\quota\&
* в cmd выполнена команда   ggr-ui_windows_amd64.exe -quota-dir C:\Users\Romanyuk.AD\otus\practik\ggr\grid-router\quota\&
* в cmd выполнена команда  ggr-ui_windows_amd64.exe -guests-allowed  -guests-quota "test" -verbose -quotaDir C:\Users\Romanyuk.AD\otus\practik\ggr\grid-router\quota\&
* в cmd выполнена команда selenoid-ui_windows_amd64.exe --selenoid-uri http://127.0.0.1:8888 -listen ":8090" -allowed-origin "*" &
* Тесты запускала из терминала командой mvn -DforkCount=1 -DthreadCount=2 test


2) Для мобильного тестирования:
* установлена Androin Studia
* в системные переменные прописаны ANDROID_HOME и ANDROID_SDK_ROOT 
* в терминале выполнена команда npm appium install
* в терминале выполнена команда appium -a 127.0.0.1 -p 4725
* параллельно в соседней вкладке браузера был запущен Stub server
