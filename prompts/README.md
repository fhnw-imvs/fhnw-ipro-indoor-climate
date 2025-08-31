# Prompts
A collection of "AI" tool prompts used in this project.

### Save prompts or entire sessions
- Download your "AI" tool prompts or session logs into the _prompts_ directory
- Rename the file to include a UTC timestamp
  e.g. [2025-08-29T09-45-00Z.txt](2025-08-29T09-45-00Z.txt)

### Mark code as based on a prompt
#### With Python
```python
# License ...
# based on $REPO_PATH/prompts/2025-08-29T09-45-00Z.txt
```

#### With Java
```java
// License ...
// based on $REPO_PATH/prompts/2025-08-29T09-45-00Z.txt
```

### See a prompt from where you are
```console
$ REPO_PATH=$(git rev-parse --show-toplevel)
$ cat $REPO_PATH/prompts/2025-08-29T09-45-00Z.txt
```
