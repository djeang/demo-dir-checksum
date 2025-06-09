#

Performs a checksum on the current directory.

## Install

```shell
jeka app: install repo=djeang/demo-dir-checksum name=checksum
```

You can also install the native version:
```shell
jeka app: install repo=djeang/demo-dir-checksum name=checksum native:
```

## Run

```shell
checksum                                                                                                                                                                                       
```

## Help
```shell
checksum help
```

## Developers

### Build commands

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

### Run

Run jar 
This will directly run the built application, without checking if sources have changed since last run
```
jeka -p arg0 arg1 ...
```



