# Kotlin-Rest-JDBC-Example

How to run this repo?

`mvn clean install spring-boot:run`

Test the API in your command line

Add New User
```$xslt
curl --data "name=uchiha_sasuke&email=uchiha_sasuke@konohagakure.co.jp" http://localhost:8080/create

```

Get All User
```
curl -i -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://localhost:8080/users/all
```

Find User by name
```$xslt
curl -i -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://localhost:8080/users/find?name=sasuke
```

Delete User by Id
```$xslt
curl --data "id=1" http://localhost:8080/delete
```

Update User by Id
```$xslt
curl --data "id=6&name=uzumaki_naruto&email=uzumaki_naruto@konohagakure.co.jp" http://localhost:8080/update
```

Get All Users
```$xslt
curl http://localhost:8080/all
```



