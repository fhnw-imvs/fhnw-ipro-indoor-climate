# Prompts
A collection of "AI" tool prompts used in this project.

### Save prompts or entire sessions
- Download your "AI" tool prompts or session logs into the _prompts_ directory
- Rename the file to include a UTC timestamp, e.g. [2025-08-29T09-45-00Z.txt](2025-08-29T09-45-00Z.txt)

### Mark code as based on a prompt
To attribute "AI" tool use in a source file, for transparency and academic integrity.

#### With Python
```python
# License ...
# based on $REPO_PATH/prompts/2025-08-29T09-45-00Z.txt
```
e.g. [csv_write.py](../level-1/Python/csv_write/csv_write.py#L2)

#### With Java
```java
// License ...
// based on $REPO_PATH/prompts/2025-08-29T09-45-00Z.txt
```
e.g. [Program.java](../level-1/Java/csv_write/src/main/java/Program.java#L2)

### Access a prompt from any subdirectory
Assuming your current directory is inside the repository.
```console
$ REPO_PATH=$(git rev-parse --show-toplevel)
$ cat $REPO_PATH/prompts/2025-08-29T09-45-00Z.txt
```
