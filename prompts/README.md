# Prompts
A collection of "AI" tool prompts used in this project.

## Save prompts or entire sessions
- Download your "AI" tool prompt, session or audit log from, e.g. https://duck.ai
- Rename the file to include a UTC timestamp,
e.g. [duck.ai_20250829T094500Z.txt](duck.ai_20250829T094500Z.txt)

## Mark code as based on a prompt
### With Python
```python
# License ...
# based on $REPO_PATH/prompts/duck.ai_20250829T094500Z.txt
```

### With Java
```java
// License ...
// based on $REPO_PATH/prompts/duck.ai_20250829T094500Z.txt
```

## Set $REPO_PATH to find prompts
```console
$ REPO_PATH=${PWD}
$ echo $REPO_PATH
```

## See a prompt from anywhere
```console
$ cat $REPO_PATH/prompts/duck.ai_20250829T094500Z.txt
```
