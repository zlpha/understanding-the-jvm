# understanding-the-jvm
## command
```bash
mvn clean compile
java -cp target/classes/ -XX:+PrintGCDetails com.zlpha.utj.ch03.ReferenceCountingGC

mvn clean compile exec:java -Dexec.mainClass=com.zlpha.utj.ch03.ReferenceCountingGC
```

## reference
> http://www.mojohaus.org/exec-maven-plugin/
