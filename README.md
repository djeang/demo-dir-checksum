#

## JeKa commands

Execute tests
```shell
jeka test
```

Create jar 
```shell
jeka pack
```

Run jar
```shell
jeka runJar programArgs="" jvmOptions=""
```

### Rin

Run jar 
This will directly run the built application, without checking if sources have changed since last run
```
jeka -p arg0 arg1 ...
```

### Docker

Create image:
```shell
jeka docker: build
```
Show info about image
```shell
jeka docker: info
```

Create native image:
```shell
jeka docker: buildNative
```
Show info about native image:
```shell
jeka docker: infoNative
```

