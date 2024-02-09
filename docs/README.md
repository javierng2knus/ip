---
runme:
  id: 01HMZD4NRPP8TSXCEWV9VGZEMC
  version: v2.2
---

# JAV User Guide

// Product screenshot goes here

// Product intro goes here

## Features

### Feature-Greetings & Farewells

Chat bot is able to say greetings and farewells upon starting or ending a conversation.

### Feature-Storage

Chat bot is able to store and list out tasks from the user via the "store" and "list" commands.

### Feature-Mark & Unmark as done

Chat bot is able to modify stored tasks as done or undone.

### Feature-Local file storage

Chat bot is able to save data into a local file and read the data upon startup.

## Usage

### Adding a task

### `todo *` or `t *` - Add a task (todo), where * is the name of the task

### `deadline *` or `d *` - Add a task (deadline), where * is the name of the task and deadline

### `event *` or `e *` - Add a task (event), where * is the name of the task, startdate and enddate

Stores a task into the storage. Todos only have a string as its name. Deadlines have a string as its name and a string as its deadline. Events have a string as its name and 2 strings as its start and end.

Example of usage:

`todo userinputedstring` or `t userinputedstring`

`deadline userinputedstring \by customdeadline` or `d userinputedstring \by customdeadline`

`event userinputedstring \from customstarttime \to customendtime` or `e userinputedstring \from customstarttime \to customendtime`

Expected outcome:

Bot replies with a confirmation message and stores the string.

```sh {"id":"01HMZD4NRPP8TSXCEWV6YPTZE0"}
| User Input:
> t read book
| Sure I'll store it right away!

| User Input:
> d read book \by tues
| Sure I'll store it right away!

| User Input:
> e read book \from 1 jan \to 1 dec
| Sure I'll store it right away!



```

### `list` or `l` - Lists out all stored tasks

Lists out all strings stored in the storage.

Example of usage:

`list` or `l`

Expected outcome:

Bot replies with a confirmation message and prints all the stored strings in the order that they were stored.

```sh {"id":"01HMZMAJCPTDT1GMQ9NRCDH4V2"}
| User Input:
> l
| Here's everything that I'd stored!
| 1.[ ] userinputedstring



```

### `mark *` or `m *` - Marks a task as done, where * is index of the task (starting from 1)

Marks a specific task as done, given its index as a integer.

Example of usage:

`mark 1` or `m 1`

Expected outcome:

If the task exists, the bot replies with a confirmation message and marks the specified task as done. Otherwise, the bot replies with a error messsage.

```sh {"id":"01HMZRCM91X6GB5EH09NJFQP7Y"}
// If valid
| User Input:
> m 1
| Fantastic news!
| You've just upgraded that task from a to-do to a ta-daa!

// If invalid
| User Input:
> m 0
| It appears the parameters might be doing a little dance of confusion!
| Could you please check the parameters and give them another whirl?



```

### `unmark *` or `u *` - Marks a task as not done, where * is index of the task (starting from 1)

Marks a specific task as not done, given its index as a integer.

Example of usage:

`unmark 1` or `u 1`

Expected outcome:

If the task exists, the bot replies with a confirmation message and marks the specified task as not done. Otherwise, the bot replies with a error messsage.

```sh {"id":"01HMZQS7Z1TQDRK0F62XPS3GPN"}
// If valid
| User Input:
> u 1
| Task status reversed!
| Sometimes even completed tasks could use an encore.

// If invalid
| User Input:
> u 0
| It appears the parameters might be doing a little dance of confusion!
| Could you please check the parameters and give them another whirl?



```

### `remove *` or `r *` - Deletes a task, where * is index of the task (starting from 1)

Deletes a task from the storage, given its index as a integer.

Example of usage:

`remove 1` or `r 1`

Expected outcome:

If the task exists, the bot replies with a confirmation message and deletes the specified task from the storage. Otherwise, the bot replies with a error messsage.

```sh {"id":"01HN13MPSVX0V5J4FSCYWCMSYY"}
// If valid
| User Input:
> r 1
| Sure! Time to delete it from the storage!
| Now, isn't that a task-tastic disappearing act? 

// If invalid
| User Input:
> r 0
| It appears the parameters might be doing a little dance of confusion!
| Could you please check the parameters and give them another whirl?



```

### `find *` or `f *` - Finds tasks matching a given keyword, where * is the keyword to search for

Finds and prints out all tasks matching a given keyword, where * is the keyword as a string to search for.

Example of usage:

`find a` or `f a`

Expected outcome:

If the task exists, the bot replies with a confirmation message and deletes the specified task from the storage. Otherwise, the bot replies with a error messsage.

```sh {"id":"01HP40KJH2Y1D6W3292VZZ82QP"}
// If valid
| User Input:
> f user
| Let the search commence!
| Here's what I've found: 
| 1.[T][ ] userinputedstring
| 2.[T][X] userinputedstring2

// If invalid
| User Input:
> f 
| It appears the parameters might be doing a little dance of confusion!
| Could you please check the parameters and give them another whirl?

// If nothing found
| User Input:
> f zzz
| It appears that this road is a deadend and no tasks were found with the keyword!
| Shall we recalibrate our keyword quest to find a different task?



```
