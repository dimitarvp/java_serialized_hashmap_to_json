# java_serialized_hashmap_to_json
Loads a serialized HashMap file (`args[0]`) and outputs JSON on stdout.

Created due to discussion here: https://elixirforum.com/t/reading-files-data-structures-from-other-platforms-into-elixir-erlang/21845

To compile the tool:

```bash
# clone this repo
# `cd` inside this repo
$ javac -cp gson-2.8.5.jar:. MapToJson.java
```

To use the tool:

```bash
$ java -cp gson-2.8.5.jar:. MapToJson /path/to/serialized/hashmap.file
```
