# test_task_ofd
## Пример входящего запроса на адрес /add_data
```
{
"user_id": "34545",
"user_data": "Test string 1"
}
```
## Пример ответа на этот запрос
```
{
"answer": "Processed Successfully"
}
```
## Пример логов
```
15.07.2024    19:46:32    Initializing Spring DispatcherServlet 'dispatcherServlet'
15.07.2024    19:46:32    Initializing Servlet 'dispatcherServlet'
15.07.2024    19:46:32    Completed initialization in 1 ms
15.07.2024    19:46:32    user_id:34545 user_data:Test string 1
15.07.2024    19:46:35    user_id:34545 user_data:Test string 1
15.07.2024    19:46:53    user_id:34545 user_data:Test string 1
```
## Пример лога этой операции
`15.07.2024    19:46:53    user_id:34545 user_data:Test string 1`

## Можно проверить
### с помощью curl из bash
```
curl -X POST -H "Content-Type: application/json" -d '{
"user_id": 123,
"user_data": "Test string"
}' http://localhost:8080/add_data
```
### с помощью Invoke-RestMethod из Powershell
```
$data = @{
  user_id = 123
  user_data = "Test string"
}
$jsonData = ConvertTo-Json -InputObject $data
Invoke-RestMethod -Uri http://localhost:8080/add_data -Method POST -Body $jsonData -ContentType "application/json"
```
## Файл с логами
- Путь до файла с логами можно указать в application.properties
- Как и другие параметры логгера
