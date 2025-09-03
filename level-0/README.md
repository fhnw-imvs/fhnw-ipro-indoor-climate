# Level 0: Getting started
To manage your time, update this schedule.

```mermaid
gantt
    dateFormat YYYY-MM-DD
    tickInterval 1day
    excludes Saturday, Sunday
    Level 0 :t0, 2025-09-01, 2d
    Level 1 :t1, after t0, 2d
    Level 2 :t2, after t1, 2d
```

## Goals
To finish the level, achieve these goals.

- [ ] Have a rough plan when to do what
- [ ] Check in with your support team
- [ ] Be ready to work on this project

## Building blocks
To achieve the goals, use these blocks.

- [ ] Set up Github and git, on your computer
- [ ] [Create a private copy of this repository](#create-a-private-copy-of-this-repository)
- [ ] Commit and push to your copy of the repo
- [ ] Use the terminal or cmd, to work with files
- [ ] Set up a Java or Python IDE, e.g. VS Code
- [ ] [Set an environment variable $REPO_PATH](#set-an-environment-variable-repo_path)
- [ ] [Use a venv virtual environment with Python](#use-a-venv-virtual-environment-with-python)
- [ ] [Plan and update a project schedule](#plan-and-update-a-project-schedule)
- [ ] [Keep a project log to take notes](#keep-a-project-log-to-take-notes)
- [ ] [Learn how to make a prototype](#learn-how-to-make-a-prototype)
- [x] [Check done items off the list](#check-done-items-off-the-list)

### Create a private copy of this repository
> Note: Do not _fork_ the respository
- Visit https://github.com/fhnw-imvs/fhnw-ipro-indoor-climate
- Click _Use this template_
- Select _Create new repository_
- Name it _fhnw-ipro-indoor-climate-USER_, e.g.
    ```
    fhnw-ipro-indoor-climate-tamberg
    ```
- Choose visibility _Private_
- Click _Create repository_

### Set an environment variable $REPO_PATH
- Set a temporary environment variable
    ```console
    $ REPO_PATH=$(git rev-parse --show-toplevel)
    ```
- Show the content of _$REPO_PATH_
    ```console
    $ echo $REPO_PATH
    ```

### Use a venv virtual environment with Python
To work with Python, use a [virtual environment](https://docs.python.org/3/library/venv.html).

- Install a project-specific _venv_, once
    ```console
    $ cd $REPO_PATH
    $ python3 -m venv venv
    ```
- Activate the _venv_, to work with Python
    ```console
    $ source venv/bin/activate
    (venv) $ python --version
    ```
- Deactivate the _venv_, to stop working
    ```console
    $ deactivate
    ```
- Uninstall the _venv_, to move the project
    ```console
    $ rm -r venv
    ```

### Plan and update a project schedule
Manage your time.

- Create e.g. a [Gantt chart](https://docs.mermaidchart.com/mermaid-oss/syntax/gantt.html)
- Find out what to do next
- See how much time is left
- Update the plan regularly

### Keep a project log to take notes
Take notes for yourself.

- Explore alternatives in parallel
- Find again what you already tried
- Include your command line history
    ```console
    $ history
    ```
- Consider using `>` to add notes
> Like this, right here.
- Or use a .TXT file per day, e.g.
    ```
    $ nano Notes_v20250823.txt
    ```

### Learn how to make a prototype
How to [make a prototype](http://www.tamberg.org/bowen/2024/MakeAPrototypeWithEmbeddedML.pdf).

- Draw a sketch
- Start simple, iterate
- Test separately, then combine
- Go back to a working state

### Check done items off the list
Edit each [README.md](README.md) to check off `[x]` done items.

## Side quests
To learn more, consider these side quests.

- [ ] Set up an SSH key to simplify Github usage
- [ ] Set up a terminal program like screen or PuTTY
- [ ] Get used to Windows Subsystem for Linux (WSL 2.0)
