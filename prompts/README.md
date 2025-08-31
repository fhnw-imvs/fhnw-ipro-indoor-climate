# Prompts
A collection of "AI" tool prompts used in this project.

## Save prompts or entire sessions
- Download your "AI" tool prompst or session log into the _/prompt_ directory
- Rename the file to include a UTC timestamp
  e.g. [2025-08-29T09-45-00Z.txt](2025-08-29T09-45-00Z.txt)

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
